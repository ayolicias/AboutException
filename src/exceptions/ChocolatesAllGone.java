package exceptions;

import spaza.Product;

public class ChocolatesAllGone extends ProductNotFoundException {
    public ChocolatesAllGone(Product product) {

    }

    public ChocolatesAllGone(maxivending.Product product) {
    }

//    public ChocolatesAllGone(maxivending.Product product) {
//    }
}
