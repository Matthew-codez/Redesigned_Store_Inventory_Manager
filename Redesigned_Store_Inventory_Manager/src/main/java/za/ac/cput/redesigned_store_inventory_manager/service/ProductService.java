package za.ac.cput.redesigned_store_inventory_manager.service;
/**
 *
 * @author Zacharia Dipudi
 */
import org.springframework.stereotype.Service;
import za.ac.cput.redesigned_store_inventory_manager.domain.Product;
import za.ac.cput.redesigned_store_inventory_manager.repository.ProductRepository;

import java.util.List;
import java.util.Optional;
@Service
public class ProductService implements IProductService{
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product read(String productId) {
        return productRepository.findById(productId).orElse(null);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public boolean delete(String productId) {
        productRepository.deleteById(productId);
        return true;
    }

    @Override
    public List<Product> getAll() {
        return List.of();
    }
}



