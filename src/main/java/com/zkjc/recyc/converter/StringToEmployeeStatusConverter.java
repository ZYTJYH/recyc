package com.zkjc.recyc.converter;

import com.zkjc.recyc.enums.EmployeeStatusEnum;

public class StringToEmployeeStatusConverter implements Converter<String,EmployeeStatusEnum> {
    @Override
    public EmployeeStatusEnum convert(String source) {
        return EmployeeStatusEnum.getByValue(source);
    }
}

