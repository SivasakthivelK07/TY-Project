package com.tyss.jspiders.sbs.response;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ErrorResponse {
    private String message;
    private HttpStatus status;
    private LocalDateTime time;
}
