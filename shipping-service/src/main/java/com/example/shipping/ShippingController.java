package com.example.shipping;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController {
    @GetMapping("/shipping/status")
    public Map<String, Object> getShippingStatus() {
        return Map.of(
            "service", "Shipping Service",
            "status", "success",
            "shipmentId", "SHIP-1001",
            "deliveryStatus", "In Transit"
        );
    }
}
