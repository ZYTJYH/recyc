package com.zkjc.recyc.enums;

import java.util.HashMap;
import java.util.Map;

public enum EmployeeKindEnum implements BaseEnum{
    car("car"),bin("bin"),person("person");

    private String value;
    private static Map<String, EmployeeKindEnum> valueMap = new HashMap<>();

    static {
        for(EmployeeKindEnum employeeKindEnum : EmployeeKindEnum.values()) {
            valueMap.put(employeeKindEnum.value, employeeKindEnum);
        }
    }

    EmployeeKindEnum(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static EmployeeKindEnum getByValue(String value) {
        EmployeeKindEnum result = valueMap.get(value);
        if(result == null) {
            throw new IllegalArgumentException("No element matches " + value);
        }
        return result;
    }
}
