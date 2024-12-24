package com.yr.simpleblog.common.utils;

import com.yr.simpleblog.common.constants.OsEnum;

/**
 * @author yurui
 * @date 2024-12-24 21:06
 */
public final class FileUtils {
    private FileUtils() {}

    public static String getFilePath() {
        String filePath = "uploads";
        if (OsUtils.getOsName() == OsEnum.WINDOWS) {
            filePath = "D:/uploads";
        } else if (OsUtils.getOsName() == OsEnum.LINUX) {
            filePath = "/data/uploads";
        }
        System.out.println(filePath);
        return filePath;
    }
}
