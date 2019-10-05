package exceptions;

import spaza.Product;

public class ChocolatesAllGone extends Throwable {
    public ChocolatesAllGone(Product product){
        super(String.valueOf(product));
    }

}
