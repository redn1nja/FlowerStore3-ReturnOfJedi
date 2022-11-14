package com.example.lab8;


import com.flowers.Chamomile;
import com.flowers.Flower;
import com.flowers.FlowerColor;
import com.flowers.FlowerType;
import com.logic.FlowerBucket;
import com.logic.FlowerPack;
import com.order.Order;
import com.order.delivery.PostDelivery;
import com.order.payment.PayPalPay;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/pay")
public class PaymentController {
    @GetMapping
    public String getOrder(){
        Flower f = new Flower(1, 15.0, FlowerColor.RED, 20.0, FlowerType.ROSE);
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
