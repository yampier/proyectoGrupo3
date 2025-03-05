package pe.gob.sunat.product.service;

import org.springframework.stereotype.Service;
import pe.gob.sunat.product.model.Product;
import pe.gob.sunat.product.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return repository.findById(id);
    }

    public Product createProduct(Product product) {
        return repository.save(product);
    }

    public boolean deleteProduct(Long id) {
        return repository.deleteById(id);
    }
}