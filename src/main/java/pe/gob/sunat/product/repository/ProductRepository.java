package pe.gob.sunat.product.repository;

import org.springframework.stereotype.Repository;
import pe.gob.sunat.product.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductRepository {
    private final List<pe.gob.sunat.product.model.Product> products = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong(1);

    public List<Product> findAll() {
        return products;
    }

    public Optional<Product> findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public Product save(Product product) {
        product.setId(counter.getAndIncrement());
        products.add(product);
        return product;
    }

    public boolean deleteById(Long id) {
        return products.removeIf(p -> p.getId().equals(id));
    }
}