package com.tyss.jspiders.sbs.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class StudentDTO {
    private String studentId;
    private String studentName;
    private String password;
}
