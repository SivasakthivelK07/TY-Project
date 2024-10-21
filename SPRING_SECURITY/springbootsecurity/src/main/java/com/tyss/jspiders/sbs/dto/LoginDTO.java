package com.tyss.jspiders.sbs.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class LoginDTO {
    private String username;
    private String password;
}
