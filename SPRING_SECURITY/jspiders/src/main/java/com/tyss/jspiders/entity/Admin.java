package com.tyss.jspiders.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Builder
@Entity
public class Admin {
    @Id
    private String adminId;
    private String name;
}
