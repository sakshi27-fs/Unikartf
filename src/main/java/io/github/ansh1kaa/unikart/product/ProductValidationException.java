package io.github.ansh1kaa.unikart.product;

public class ProductValidationException extends Exception {
    /**
     * Creates a new ProductValidationException with the specified message.
     * @param message The error message explaining the validation isse.
     */
    public ProductValidationException(String message) {
        super(message);
    }
}