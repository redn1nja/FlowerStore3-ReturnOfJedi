package store.logic;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@ToString
public class FlowerBucket {
    @Getter @Setter
    private List<FlowerPack> packs = new ArrayList<>();

    public void add(FlowerPack pack) {
        packs.add(pack);
    }
    public double getPrice() {
        double result = 0;
        for (FlowerPack pack : packs) {
            result += pack.getPrice();
        }

        return result;
    }
}
