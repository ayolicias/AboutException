package maxivending;

import exceptions.ChocolatesAllGone;
import exceptions.ProductNotFoundException;
import exceptions.SaltyCracksAllEatenException;
import exceptions.SoftDrinksOutOfStockException;
import spaza.*;
import spaza.Chocolates;

public class MaxiVendingMachine extends VendingMachine {
    public  int countStock;
    public int softDrinks = 0;
    public int saltySnakes = 0;
    public int chocolates = 0;

    public static void main(String[] args){

        spaza.Product snakes = new SoftDrinks();
        VendingMachine vendingMachine = new VendingMachine();
        try{
            vendingMachine.addStock(snakes,5);
            vendingMachine.buy(snakes);

        }
        catch (SoftDrinksOutOfStockException e){
            System.out.println("drinks not found");

        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void buy(spaza.Product product) throws ProductNotFoundException {
        if (product instanceof SoftDrinks){

            if (softDrinks <= 0){
                throw new SoftDrinksOutOfStockException(product);
            }
            else {
                softDrinks --;
            }
        }

        if (product instanceof SaltySnakes){
            if (saltySnakes <= 0){
                throw new SaltyCracksAllEatenException(product);

            }

            else {
                saltySnakes --;
            }
        }

        if (product instanceof spaza.Chocolates){
            if (chocolates <= 0){
                throw new ChocolatesAllGone(product);
            }
            else{
                chocolates --;
            }
        }
    }

    @Override
    public void addStock(spaza.Product product, int newStock) {
        if (product instanceof SoftDrinks){
            softDrinks += newStock;


            System.out.println(softDrinks);
            System.out.println(newStock);
        }
        if (product instanceof SaltySnakes){
            saltySnakes += newStock;

        }
        if (product instanceof Chocolates){
            chocolates += newStock;

        }
    }

    public int getNewStock(){
        return countStock;
    }
    public int getNewStock(Product product){
        if (product instanceof SoftDrinks){
            return softDrinks;
        }
        if (product instanceof SaltySnakes){
            return saltySnakes;
        }
        return chocolates;
    }

}

