package exceptions;

import spaza.Product;

public class SoftDrinksOutOfStockException extends Throwable {
    public SoftDrinksOutOfStockException(Product product){
        super(String.valueOf(product));
    }
}
