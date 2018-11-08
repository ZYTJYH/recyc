package com.zkjc.recyc.converter;

public interface Converter<S,T> {
    T convert(S source);
}
