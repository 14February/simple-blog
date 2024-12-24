package com.yr.simpleblog.controller.file.converter;

import com.yr.simpleblog.controller.file.vo.FileUploadResVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author yurui
 * @date 2024-12-24 22:21
 */
@Mapper
public interface FileUploadMapper {
    FileUploadMapper INSTANCE = Mappers.getMapper(FileUploadMapper.class);

    default FileUploadResVO toFileUploadResVO(MultipartFile file, String filePath) {
        FileUploadResVO fileUploadResVO = new FileUploadResVO();
        fileUploadResVO.setOriginalFileName(file.getOriginalFilename());
        fileUploadResVO.setFilePath(filePath);
        fileUploadResVO.setFileSize(file.getSize());
        fileUploadResVO.setFileType(file.getContentType());
        fileUploadResVO.setFileUrl("http://localhost:8080" + filePath);
        return fileUploadResVO;
    }

}
