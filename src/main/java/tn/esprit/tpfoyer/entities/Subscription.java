package tn.esprit.tpfoyer.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate; import java.time.LocalTime;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numSub ;
    private Float price ;

    private LocalDate startDate;
    private LocalDate endDate;
    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSub;

    @OneToOne
    Skieur skieur;


}
