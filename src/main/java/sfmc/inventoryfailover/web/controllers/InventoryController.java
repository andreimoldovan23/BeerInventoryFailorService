package sfmc.inventoryfailover.web.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sfmc.inventoryfailover.web.model.BeerInventoryDTO;

@RestController
public class InventoryController {
    @GetMapping("/api/v1/beer/{beerId}/inventory")
    public List<BeerInventoryDTO> getInventoryByBeerId(@PathVariable UUID beerId) {
        return List.of(BeerInventoryDTO.builder().beerId(beerId).build());
    }
}
