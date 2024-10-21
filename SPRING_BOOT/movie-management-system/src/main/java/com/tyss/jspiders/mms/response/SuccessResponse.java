package com.tyss.jspiders.mms.response;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder

@FieldDefaults(level = AccessLevel.PRIVATE)

public class SuccessResponse {
	String message;
	HttpStatus status;
	Object data;
	LocalDate time;
}
