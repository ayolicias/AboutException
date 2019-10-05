package spaza;

import exceptions.SoftDrinksOutOfStockException;
import exceptions.SaltyCracksAllEatenException;
import exceptions.ChocolatesAllGone;

public class VendingMachine {
    public static int newStock = 0;
    public static int count = 0;
    public int SoftDrinks = 0;
    public static int SaltySnakes = 0;
    public int Chocolates = 0;

    private String Product;

   public static void main(String[] args){
       Product drinks = new SoftDrinks("coke", "sprite");
       addStock(drinks, 0);
       System.out.println(getCount());

    }

    public void buy(Product product) throws SoftDrinksOutOfStockException, SaltyCracksAllEatenException, ChocolatesAllGone {
       if (product instanceof Product){
               if (SoftDrinks >= 0){
                   SoftDrinks --;
               }
               else {
                   throw new SoftDrinksOutOfStockException(product);
               }
           }

       if (product instanceof Product){
           if (SaltySnakes>= 0){
               SaltySnakes --;
           }

           else {
               throw new SaltyCracksAllEatenException(product);
           }
       }

       if (product instanceof Product){
           if (Chocolates>= 0){
               Chocolates --;
           }

           else{
               throw new ChocolatesAllGone(product);
           }
       }

       }


    public static void addStock(Product product, int newStock){
       if (product instanceof SoftDrinks){
           count += newStock;
       }
       if (product instanceof SaltySnakes){
           count += SaltySnakes;
       }
       if (product instanceof Chocolates){
           count += newStock;
       }
       count += newStock;
    }
    public String getStock(){

        return getStock();
    }

    public static int getCount(){
        return getCount();
    }

    }

