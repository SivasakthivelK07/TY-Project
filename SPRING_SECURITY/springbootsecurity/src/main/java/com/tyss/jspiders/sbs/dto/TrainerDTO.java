package com.tyss.jspiders.sbs.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TrainerDTO {
    private String trainerId;
    private String trainerName;
    private String password;
}
