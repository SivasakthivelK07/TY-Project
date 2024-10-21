package com.tyss.jspiders.sbs.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
@Entity
public class Role {
    @GeneratedValue
    @Id
    private Integer id;

    @Column(unique = true)
    private String roleName;

    @ManyToMany(mappedBy = "roles",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<AppUser> appUsers;
}
