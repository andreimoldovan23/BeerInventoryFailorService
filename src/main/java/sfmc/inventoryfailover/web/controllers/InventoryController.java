package sfmc.inventoryfailover.web.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sfmc.inventoryfailover.web.model.BeerInventoryDTO;

@RestController
public class InventoryController {
    @GetMapping("/api/v1/inventory-failover")
    public List<BeerInventoryDTO> getInventoryByBeerId() {
        return List.of(BeerInventoryDTO.builder().build());
    }
}
