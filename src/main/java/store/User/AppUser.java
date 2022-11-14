package store.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;


@Getter @Setter @Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    @Transient
    private int age;
    private LocalDate dob;

    public int getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }

}
