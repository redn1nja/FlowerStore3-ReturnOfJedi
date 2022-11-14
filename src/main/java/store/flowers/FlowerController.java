package store.flowers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/flower")
public class FlowerController {
    private FlowerService flowerService;
    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<Flower> getFlowers(){
        return flowerService.getFlowers();
    }

    @PostMapping
    public void addFlower(@RequestBody Flower flower){
        flowerService.addFlower(flower);
    }
}
