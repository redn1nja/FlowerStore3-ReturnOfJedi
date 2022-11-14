package com.example.lab8;

import com.flowers.Flower;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlowerService {
    private FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public void addFlower(Flower flower){
        flowerRepository.save(flower);
    }
}
