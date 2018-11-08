package com.zkjc.recyc.util;

import com.zkjc.recyc.enums.BaseEnum;

public class EnumUtil {
    public static <T extends BaseEnum> Object getIEnum(Class<T> targerType, String source) {
        for(T enumObj : targerType.getEnumConstants()){
            if(source .equals( enumObj.getValue())){
                return enumObj;
            }
        }
        return null;
    }
}
