package com.dl.tacoloco.service;

import com.dl.tacoloco.model.PlaceOrderRequest;
import com.dl.tacoloco.model.PlaceOrderResponse;

public interface PlaceOrderService {

    PlaceOrderResponse calculateOrderTotal(PlaceOrderRequest placeOrderRequest);
}
