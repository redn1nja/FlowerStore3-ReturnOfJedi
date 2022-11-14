package store.flowers;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlowerService {
//    private FlowerRepository flowerRepository;
//
//    @Autowired
//    public FlowerService(FlowerRepository flowerRepository) {
//        this.flowerRepository = flowerRepository;
//    }
    public List<Flower> getFlowers(){
        return List.of(new Flower(1, 15.0, FlowerColor.RED, 15.0, FlowerType.TULIP), new Flower(2, 10.0, FlowerColor.BLUE, 20.0, FlowerType.ROSE));
    }
//    public List<Flower> getFlowers() {
//        return flowerRepository.findAll();
//    }
//
//    public void addFlower(Flower flower){
//        flowerRepository.save(flower);
//    }
}
