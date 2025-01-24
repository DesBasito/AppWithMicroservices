package kg.manurov.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "fraud_id_sequence",
        sequenceName = "fraud_id_sequence")
public class FraudCheckHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "fraud_id_sequence")
    private Integer id;
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;
}