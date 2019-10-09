package spaza;

import exceptions.ProductNotFoundException;
import exceptions.SoftDrinksOutOfStockException;
import exceptions.SaltyCracksAllEatenException;
import exceptions.ChocolatesAllGone;

public class VendingMachine {
    public  int countStock;
    public  int softDrinks = 0;
    public  int saltySnakes = 0;
    public  int chocolates = 0;

    private String Product;

   public static void main(String[] args){

       Product drinks = new SoftDrinks();
       VendingMachine vendingMachine = new VendingMachine();
       try{
           vendingMachine.addStock(drinks,2);
           vendingMachine.buy(drinks);

       }
       catch (SoftDrinksOutOfStockException e){
           System.out.println("drinks not found");

       } catch (ProductNotFoundException e) {
           e.printStackTrace();
       }
   }

    public void buy(Product product) throws ProductNotFoundException {
       if (product instanceof SoftDrinks){

               if (softDrinks <= 0){
                   throw new SoftDrinksOutOfStockException(product);
               }
               else {
                   softDrinks --;
                   countStock --;
//                   System.out.println("bought 1 SoftDrink");
               }
           }

       if (product instanceof SaltySnakes){
           if (saltySnakes <= 0){
               throw new SaltyCracksAllEatenException(product);

           }

           else {
               saltySnakes --;
               countStock --;
           }
       }

       if (product instanceof Chocolates){
           if (chocolates <= 0){
               throw new ChocolatesAllGone(product);
           }
           else{
               chocolates --;
               countStock --;
           }
       }

       }

    public  void addStock(Product product, int newStock){
       if (product instanceof SoftDrinks){
           softDrinks += newStock;
           countStock += newStock;

           System.out.println(softDrinks);
           System.out.println(newStock);
       }
       if (product instanceof SaltySnakes){
           saltySnakes += newStock;
           countStock += newStock;
       }
       if (product instanceof Chocolates){
           chocolates += newStock;
           countStock += newStock;
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

