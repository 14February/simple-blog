package com.yr.simpleblog.common.constants;

import lombok.Getter;

/**
 * @author yurui
 * @date 2024-12-24 20:59
 */
@Getter
public enum OsEnum {
    WINDOWS("windows", "windows"),
    LINUX("linux", "linux"),
    MACOS("macos", "macos");

    private final String code;
    private final String name;

    OsEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }


    public static OsEnum getOsEnum(String code) {
        for (OsEnum osEnum : OsEnum.values()) {
            if (osEnum.getCode().equals(code)) {
                return osEnum;
            }
        }
        return null;
    }
}
