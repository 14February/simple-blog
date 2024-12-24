package com.yr.simpleblog.common.utils;

import com.yr.simpleblog.common.constants.OsEnum;

/**
 * @author yurui
 * @date 2024-12-24 20:57
 */
public final class OsUtils {
    public static final String OS_NAME = System.getProperty("os.name").toLowerCase();

    private OsUtils() {}

    public static OsEnum getOsName() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            return OsEnum.WINDOWS;
        } else if (os.contains("mac")) {
            return OsEnum.MACOS;
        } else if (os.contains("nix") || os.contains("nux")) {
            return OsEnum.LINUX;
        }
        return null;
    }
}
