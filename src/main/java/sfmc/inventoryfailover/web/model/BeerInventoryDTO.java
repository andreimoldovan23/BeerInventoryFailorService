package sfmc.inventoryfailover.web.model;

import java.io.Serializable;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerInventoryDTO implements Serializable {
    @Builder.Default
    private UUID beerId = UUID.fromString("00000000-0000-0000-0000-000000000000");

    @Builder.Default
    private Integer quantityOnHand = 999;
}
