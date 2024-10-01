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

import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
@Setter
@ToString
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numCourse ;
    private int level ;
    private Float price ;
    private int timeSlot ;
//onetone 1 attribut  fel unidi
   //manytoone 1 attribut  fel unidi
   //onetomany   list or set fel unidi
   //manytomany list or set fel unidi
    @Enumerated(EnumType.STRING)
    private Support support;

    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;


    @OneToMany(mappedBy = "course")
    Set<Registration> registrations;


}
