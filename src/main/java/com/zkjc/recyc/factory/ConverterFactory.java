package com.zkjc.recyc.factory;

import com.zkjc.recyc.converter.Converter;

public interface ConverterFactory<S, R> {

    <T extends R> Converter<S, T> getConverter(Class<T> targetType);

}
