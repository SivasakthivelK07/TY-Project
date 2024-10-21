package com.tyss.jspiders.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class LoginDTO {
    private String userName;
    private String password;
}
