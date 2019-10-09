package exceptions;
import spaza.Product;

public class SaltyCracksAllEatenException extends ProductNotFoundException{
    public SaltyCracksAllEatenException(Product product){

    }

    public SaltyCracksAllEatenException(maxivending.Product product) {
    }
}
