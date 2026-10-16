package com.example.inventory;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
    @GetMapping("/inventory/items")
    public Map<String, Object> getItems() {
        return Map.of(
            "service", "Inventory Service",
            "status", "success",
            "items", new Object[] {
                Map.of("id", 101, "name", "Laptop", "quantity", 25),
                Map.of("id", 102, "name", "Mouse", "quantity", 60)
            }
        );
    }
}
