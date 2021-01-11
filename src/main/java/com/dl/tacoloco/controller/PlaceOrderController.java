package com.dl.tacoloco.controller;

import com.dl.tacoloco.model.PlaceOrderRequest;
import com.dl.tacoloco.model.PlaceOrderResponse;
import com.dl.tacoloco.service.PlaceOrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/api/v1/tacoLoco")
public class PlaceOrderController {

    private final PlaceOrderService placeOrderService;

    @Autowired
    public PlaceOrderController(PlaceOrderService placeOrderService) {
        this.placeOrderService = placeOrderService;
    }

    @ApiOperation(value = "TacoLoco", notes = "Returns the total amount for the tacos ordered")
    @PostMapping(value = "/placeOrder")
    public PlaceOrderResponse storeInventory(@RequestBody @Valid PlaceOrderRequest placeOrderRequest) {
        return placeOrderService.calculateOrderTotal(placeOrderRequest);


    }
}
