package com.imooc.sell.utils.serializer;

import com.imooc.sell.enums.CodeEnum;

public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T enumConstant : enumClass.getEnumConstants()) {
            if (code.equals(enumConstant.getCode())) {
                return enumConstant;
            }
        }
        return null;
    }
}
