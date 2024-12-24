package com.yr.simpleblog.controller.file;

import com.yr.simpleblog.common.utils.FileUtils;
import com.yr.simpleblog.controller.file.converter.FileUploadMapper;
import com.yr.simpleblog.controller.file.vo.FileUploadResVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author yurui
 * @date 2024-12-24 20:26
 */
@RestController
@RequestMapping("/file")
public class FileUploadController {
    public static final String UPLOAD_DIR = FileUtils.getFilePath();


    @PostMapping("/upload")
    public List<FileUploadResVO> uploadFile(@RequestParam("files") MultipartFile[] files) {
        if (files.length == 0) {
            return null;
        }
        List<FileUploadResVO> fileUploadResVOList = new ArrayList<>();
        try {
            for (MultipartFile file : files) {
                if (file.isEmpty()) {
                    continue;
                }
                String originalFilename = file.getOriginalFilename();
                String fileExtension = "";
                if (originalFilename != null && originalFilename.contains(".")) {
                    fileExtension = originalFilename.substring(originalFilename.lastIndexOf("."));
                }
                // 创建文件保存路径
                String filePath = new SimpleDateFormat("yyyy/MM/dd").format(new Date()) + "/" + System.currentTimeMillis() + fileExtension;
                Path path = Paths.get(UPLOAD_DIR + "/" + filePath);
                // 创建上传目录（如果不存在）
                Files.createDirectories(path.getParent());
                // 将文件保存到目标路径
                file.transferTo(path.toFile());
                fileUploadResVOList.add(FileUploadMapper.INSTANCE.toFileUploadResVO(file, "/uploads/" + filePath));
            }
            return fileUploadResVOList;

        } catch (IOException e) {

            return Collections.emptyList();
        }

    }


}
