package com.devsuperior.aula01.services;

import com.devsuperior.aula01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public double total(Order order){
        if(order.getDiscount() > 0 ) {
            return order.getBasic() * (1 - order.getDiscount() / 100.0) + shippingService.shipment(order);
        } else {
            return order.getBasic() + shippingService.shipment(order);
        }

    }
}
