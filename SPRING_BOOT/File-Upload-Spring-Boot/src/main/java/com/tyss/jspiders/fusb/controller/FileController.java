package com.tyss.jspiders.fusb.controller;

import java.io.IOException;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tyss.jspiders.fusb.response.ErrorResponse;
import com.tyss.jspiders.fusb.response.Response;
import com.tyss.jspiders.fusb.response.SuccessResponse;
import com.tyss.jspiders.fusb.service.FileService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(path = "api/file")
@RestController
public class FileController {
	
	private final FileService fileService;

	@PostMapping("upload")
	public ResponseEntity<Response> uploadFile(@RequestParam(name = "file") MultipartFile file) throws IOException{
		
//		List<List<String>> excelData =fileService.uploadFile(file);
		
//		System.out.println("getBytes:"+file.getBytes());
//		System.out.println("getContentType:"+file.getContentType());
//		System.out.println("getInputStream:"+file.getInputStream());
//		System.out.println("getName:"+file.getName());
//		System.out.println("getOriginalFilename:"+file.getOriginalFilename());
//		System.out.println("getSize:"+file.getSize());
			
		if (!file.isEmpty()) {
			return ResponseEntity.<Response>ofNullable(SuccessResponse.builder()
					.message(file.getOriginalFilename()+" File Received")
					.data(fileService.uploadFile(file))
					.time(LocalDateTime.now())
					.status(HttpStatus.ACCEPTED)
					.build());
		}else {
			return ResponseEntity.<Response>ofNullable(ErrorResponse.builder()
					.message("File Not Received")
					.time(LocalDateTime.now())
					.status(HttpStatus.NO_CONTENT)
					.build());
		}
	}
	
}
