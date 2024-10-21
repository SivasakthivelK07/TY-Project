package com.tyss.jspiders.sesb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.jspiders.sesb.service.EmailService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(path = "api/email")
@RestController
public class EmailController {

	private final EmailService emailService;

	@PostMapping(path = "/send")
	public ResponseEntity sendEmail(@RequestParam String to,
			@RequestParam String subject,
			@RequestParam String body
			) {
		Boolean isSend = emailService.sendEmail(to, subject, body);

		return ResponseEntity.ok(ResponseEntity.status(HttpStatus.GONE));
	}

}
