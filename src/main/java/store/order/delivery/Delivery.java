package store.order.delivery;

import store.logic.FlowerBucket;

import java.util.List;

public interface Delivery {
    public String deliver(List<FlowerBucket> items);
}
