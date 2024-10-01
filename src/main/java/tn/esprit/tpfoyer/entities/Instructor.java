
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
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numInstructor ;
    private LocalDate dateOfHire ;
    private String name;

    @OneToMany
    Set<Course> courses;
}
