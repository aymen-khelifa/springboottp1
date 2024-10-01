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

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table//(name="t_skier")
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idskier;
    private String name;

    private LocalDate birthDate;
    private String city;
    @OneToOne(mappedBy ="skieur")//mabbed by nottou fel child ken ki yebda bidirectionnel
    Subscription subscription;

    @OneToMany(mappedBy = "skier")
    Set<Registration> registrations;
}


