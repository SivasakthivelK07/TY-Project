package com.tyss.jspiders.sbs.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
@Entity
public class Admin {
    @Id
    private String adminId;
    private String adminName;
}
