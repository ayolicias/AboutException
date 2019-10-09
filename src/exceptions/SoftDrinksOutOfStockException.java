package exceptions;

import spaza.Product;

public class SoftDrinksOutOfStockException extends ProductNotFoundException {
    public SoftDrinksOutOfStockException(Product product){

    }

//    public SoftDrinksOutOfStockException(maxivending.Product product) {
//    }

    public SoftDrinksOutOfStockException() {

    }
}
