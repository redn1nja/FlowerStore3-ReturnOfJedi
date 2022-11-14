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
    private FlowerColor color;
    @Getter
    private double price;
    private FlowerType flowerType;
    public String getColor() {
        return color.toString();
    }
    public String getFlowerType() {return flowerType.toString();}
}
