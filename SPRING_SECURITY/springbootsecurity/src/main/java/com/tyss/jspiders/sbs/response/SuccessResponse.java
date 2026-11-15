package com.tyss.jspiders.sbs.response;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SuccessResponse {
    private String message;
    private Object data;
    private HttpStatus status;
    private String token;
    private LocalDateTime time;
}
