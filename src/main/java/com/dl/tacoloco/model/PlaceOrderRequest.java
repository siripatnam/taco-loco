package com.dl.tacoloco.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlaceOrderRequest {

    double noOfVegTacos;
    double noOfChickenBeefTacos;
    double noOfChorizoTacos;
    String orderNumber;
}
