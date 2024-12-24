package com.yr.simpleblog.controller.file.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yurui
 * @date 2024-12-24 22:01
 */
@Data
public class FileUploadResVO implements Serializable {
    /**
     * 原始文件名
     */
    private String originalFileName;
    /**
     * 文件路径
     */
    private String filePath;
    /**
     * 文件大小
     */
    private Long fileSize;
    /**
     * 文件类型
     */
    private String fileType;
    /**
     * 文件URL
     */
    private String fileUrl;

}
