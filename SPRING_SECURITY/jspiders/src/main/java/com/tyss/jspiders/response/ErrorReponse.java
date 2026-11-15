package com.tyss.jspiders.response;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ErrorReponse {
    private String error;
    private HttpStatus status;
    private LocalDateTime timestamp;
}
