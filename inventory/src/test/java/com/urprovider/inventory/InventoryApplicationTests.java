package com.urprovider.inventory;

import com.urprovider.inventory.domain.model.entity.Product;
import com.urprovider.inventory.domain.persistence.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
class InventoryApplicationTests {


    @Mock
    private ProductRepository productRepository;

    @Test
    public void createInventory() {
        Product create = Product.builder()
                .image("https://www.adslzone.net/app/uploads-adslzone.net/2019/04/borrar-fondo-imagen-1200x675.jpg")
                .name("Pepsi")
                .category("type")
                .available(true)
                .numberOfSales(10)
                .description("Bebida gasificada")
                .build();
        productRepository.save(create);
    }

}
