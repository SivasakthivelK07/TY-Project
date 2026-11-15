package com.tyss.jspiders.fusb.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

	List<List<String>> uploadFile(MultipartFile file);

}
