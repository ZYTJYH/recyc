package com.zkjc.recyc.enums;

import java.util.HashMap;
import java.util.Map;

public enum  EmployeeStatusEnum implements BaseEnum
{
        on("on"),off("off");

        private String value;
        private static Map<String, EmployeeStatusEnum> valueMap = new HashMap<>();

        static {
                for(EmployeeStatusEnum employeeStatusEnum : EmployeeStatusEnum.values()) {
                        valueMap.put(employeeStatusEnum.value, employeeStatusEnum);
                }
        }

        EmployeeStatusEnum(String value) {
                this.value = value;
        }

        @Override
        public String getValue() {
                return value;
        }

        public static EmployeeStatusEnum getByValue(String value) {
                EmployeeStatusEnum result = valueMap.get(value);
                if(result == null) {
                        throw new IllegalArgumentException("No element matches " + value);
                }
                return result;
        }
}
