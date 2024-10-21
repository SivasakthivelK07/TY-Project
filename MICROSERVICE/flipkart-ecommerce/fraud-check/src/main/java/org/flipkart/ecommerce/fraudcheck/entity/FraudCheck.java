package org.flipkart.ecommerce.fraudcheck.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class FraudCheck {
    @GeneratedValue
    @Id
    private Integer fraudId;
    private Integer customerId;
    private String email;
    private boolean isFraudlent;
    private LocalDateTime time;
}
