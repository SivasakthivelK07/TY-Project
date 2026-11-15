package org.flipkart.ecommerce.reponse;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SuccessResponse {
    String message;
    Object data;
    LocalDateTime time;
    HttpStatus status;
}
