package io.github.ansh1kaa.unikart.product;

import java.util.List;

/**
 * Interface for product service logic.
 */
public interface ProductService {

    Product createProduct(Product product) throws ProductValidationException;

    List<Product> getAllProducts() throws ProductNotFoundException;

    Product getProductByName(String name) throws ProductNotFoundException;

    Product updateProductName(Long id, String newName) throws ProductValidationException;

    boolean deleteProduct(Long id) throws ProductNotFoundException;
}