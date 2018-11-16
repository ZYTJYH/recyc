package com.zkjc.recyc.configuration;

import com.zkjc.recyc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsUtils;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)  //  启用方法级别的权限认证
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //解决静态资源被拦截的问题
        web.ignoring().antMatchers("/css/**","/images/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //  允许所有用户访问"/"和"/index.html"
        http.authorizeRequests()
                .antMatchers( "/login","/information/**").permitAll()
                .requestMatchers(CorsUtils::isPreFlightRequest).permitAll()//就是这一行啦
                .anyRequest().authenticated()   // 其他地址的访问均需验证权限
                .and()
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/user/form")
//                .failureUrl("/login?error")
                .defaultSuccessUrl("/home")
                .and()
                .csrf().disable();
    }



    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService()).passwordEncoder(new EmptyPasswordEncoder());
//        auth.inMemoryAuthentication().passwordEncoder(new EmptyPasswordEncoder()).withUser("root1").password("123456").roles("USER");
    }


    /**
     * 设置用户密码的加密方式为不加密
     */
    class EmptyPasswordEncoder implements PasswordEncoder{

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



    /**
     *从数据库中读取用户信息
     */
    @Bean
    public UserDetailsService userService() {
        return new UserService();
    }

}
