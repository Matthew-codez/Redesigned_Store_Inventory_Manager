package za.ac.cput.redesigned_store_inventory_manager.service;

import za.ac.cput.redesigned_store_inventory_manager.domain.Product;
import za.ac.cput.redesigned_store_inventory_manager.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

public class ProductService implements IProductService{
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        if (product == null) return null;
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(String id) {
        if (id == null) return null;
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        if (id == null) return;
        productRepository.deleteById(id);
    }

    @Override
    public boolean existsById(String id) {
        if (id == null) return false;
        return productRepository.existsById(id);
    }


}



