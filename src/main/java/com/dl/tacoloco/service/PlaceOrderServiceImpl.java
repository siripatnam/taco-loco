package com.dl.tacoloco.service;

import com.dl.tacoloco.model.PlaceOrderRequest;
import com.dl.tacoloco.model.PlaceOrderResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PlaceOrderServiceImpl implements PlaceOrderService {


    @Override
    public PlaceOrderResponse calculateOrderTotal(PlaceOrderRequest placeOrderRequest) {

        PlaceOrderResponse placeOrderResponse = new PlaceOrderResponse();
        double finalAmount = 0;
        double totalAmount = (placeOrderRequest.getNoOfVegTacos() * 2.50) + (placeOrderRequest.getNoOfChickenBeefTacos() * 3.00) + (placeOrderRequest.getNoOfChorizoTacos() * 3.50);

        if ((placeOrderRequest.getNoOfVegTacos() + placeOrderRequest.getNoOfChorizoTacos() + placeOrderRequest.getNoOfChickenBeefTacos()) >= 4) {
            double discount = 0.2 * totalAmount;
            finalAmount = totalAmount - discount;
        } else {
            finalAmount = totalAmount;
        }
        placeOrderResponse.setTotalAmount(finalAmount);
        return placeOrderResponse;

    }
}
