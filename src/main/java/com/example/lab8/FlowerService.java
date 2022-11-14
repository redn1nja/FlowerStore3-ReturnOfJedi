package com.example.lab8;

import com.flowers.Flower;
import com.flowers.FlowerColor;
import com.flowers.FlowerType;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlowerService {
    public List<Flower> getFlowers() {
        return List.of(new Flower(1,15.0, FlowerColor.BLUE, 15.0, FlowerType.ROSE),
                new Flower(2, 10.0, FlowerColor.RED, 20.0, FlowerType.TULIP));
    }
}
