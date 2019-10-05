package exceptions;
import spaza.Product;

public class SaltyCracksAllEatenException extends Throwable{
    public SaltyCracksAllEatenException(Product product){
        super(String.valueOf(product));
    }

}
