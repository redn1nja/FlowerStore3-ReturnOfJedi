package store.flowers;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Setter @Entity
@Table @ToString
public class Flower {
//    private int id;
    @Id @GeneratedValue
    @Getter
    private int id;
    @Getter
    private double sepalLength;
    private String color;
    @Getter
    private double price;
    public String getColor() {
        return color.toString();
    }
}
