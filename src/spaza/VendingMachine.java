package spaza;

public class VendingMachine {
    public  int newStock;

    public int SoftDrinks = 0;
    public int SaltySnakes =0;
    public int Chocolate = 0;
    private int Product;

    public static void main(String[] args) {

    }

    public void buy(Product product) {
//        String Product;
        int qty = 0;

        this.Product = Product;
        if (qty == Product){
            --qty;
        }
        if (product instanceof Product){
            Product = newStock;

        }

    }




    public void addStock(Product product, int newStock){
        this.SoftDrinks = newStock;
        this.SaltySnakes = newStock;
        this.Chocolate = newStock;
    }
    public String getStock(){

        return getStock();
    }

    }

