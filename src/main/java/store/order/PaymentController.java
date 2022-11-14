package store.order;


import store.flowers.Flower;
import store.logic.FlowerBucket;
import store.logic.FlowerPack;
import store.order.delivery.PostDelivery;
import store.order.payment.PayPalPay;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/pay")
public class PaymentController {
    @GetMapping
    public String getOrder(){
        Flower f = new Flower(1, 15.0, "#0000FF", 20.0);
        FlowerPack p = new FlowerPack(f, 15);
        FlowerBucket buck = new FlowerBucket();
        buck.add(p);
        Order order = new Order();
        order.addItem(buck);
        order.setPaymentStrategy(new PayPalPay());
        order.setDeliveryStrategy(new PostDelivery());
        return order.processOrder();
    }
}
