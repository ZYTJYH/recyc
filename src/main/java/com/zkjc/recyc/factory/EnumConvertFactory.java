package com.zkjc.recyc.factory;

import com.zkjc.recyc.enums.BaseEnum;
import com.zkjc.recyc.util.EnumUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class EnumConvertFactory implements ConverterFactory<String, BaseEnum> {
    @Override
    public <T extends BaseEnum> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToIEum<>(targetType);
    }
    private static class StringToIEum<T extends BaseEnum>  implements Converter<String, T> {
        private Class<T> targerType;

        /**
         * Instantiates a new String to i eum.
         *
         * @param targerType the targer type
         */
        public StringToIEum(Class<T> targerType) {
            this.targerType = targerType;
        }

        @Override
        public T convert(String source) {
            if (StringUtils.isBlank(source)) {
                return null;
            }
            return (T) EnumUtil.getIEnum(this.targerType, source);
        }
    }

}
