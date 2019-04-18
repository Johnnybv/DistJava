package us.johnerickson.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {

    @RequestMapping("/products")
    public List<Products> getAllSongs() {
        List<Products> products = new ArrayList<>();
        products.add(new Products(1,"ShoeExtreme", "The Extreme shoe for Extreme People", 3.43));
        products.add(new Products(2,"Thing Shirt", "The shirt with a thing on it.", 335.34));
        products.add(new Products(3,"Super Tee", "The last Tee You will ever need", 1.11));
        products.add(new Products(4,"Best Wife Beater", "Be the worst beater u can be in this best wife beater", 99.99));
        return products;
    }
}
