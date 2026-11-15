package com.tyss.jspiders.sbs.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
@Entity
public class Trainer {
    @Id
    private String trainerId;
    private String trainerName;
}
