package com.zkjc.recyc.configuration;

import com.zkjc.recyc.filter.JWTAuthenticationFilter;
import com.zkjc.recyc.filter.JWTLoginFilter;
import com.zkjc.recyc.handler.Http401AuthenticationEntryPoint;
import com.zkjc.recyc.security.CustomAuthenticationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)  //  启用方法级别的权限认证
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    private static final String[] AUTH_WHITELIST = {
            // -- register url
            "/users/signup",
            // -- swagger ui
            "/v2/api-docs",
            "/swagger-resources",
            "/swagger-resources/**",
            "/configuration/ui",
            "/configuration/security",
            "/swagger-ui.html",
            "/webjars/**",
            "/**"
//            "/information/**"
            // other public endpoints of your API may be appended to this array
    };
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void configure(WebSecurity web) throws Exception {
        //解决静态资源被拦截的问题
        web.ignoring().antMatchers("/css/**","/images/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .authorizeRequests()
                .antMatchers(AUTH_WHITELIST).permitAll()
                .anyRequest().authenticated()  // 所有请求需要身份认证
                .and()
                .exceptionHandling()
                .authenticationEntryPoint(
                        new Http401AuthenticationEntryPoint("Basic realm=\"MyApp\""))
                .and()
//                .exceptionHandling().accessDeniedHandler(customAccessDeniedHandler) // 自定义访问失败处理器
//                .and()
                .addFilter(new JWTLoginFilter(authenticationManager()))
                .addFilter(new JWTAuthenticationFilter(authenticationManager()))
                .logout() // 默认注销行为为logout，可以通过下面的方式来修改
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login")// 设置注销成功后跳转页面，默认是跳转到登录页面;
//                .logoutSuccessHandler(customLogoutSuccessHandler)
                .permitAll()
                .and()
                .formLogin()
                .loginPage("/login")
                .successForwardUrl("/home");
//                .loginProcessingUrl("/user/form");
    }



    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(new CustomAuthenticationProvider(userDetailsService, bCryptPasswordEncoder));
    }


    /**
     * 设置用户密码的加密方式为不加密
     */
    class EmptyPasswordEncoder implements PasswordEncoder {

        @Override
        public String encode(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override
        public boolean matches(CharSequence charSequence, String s) {
//            System.out.print()
            return charSequence.toString().equals(s);
        }
    }
}

