package exceptions;

import spaza.Product;

public class SoftDrinksOutOfStockException extends ProductNotFoundException {
    public SoftDrinksOutOfStockException(Product product){

    }
}
