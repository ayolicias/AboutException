package JUnitSpark.src.test.java.maxivendings;

import exceptions.SoftDrinksOutOfStockException;
import org.testng.annotations.Test;
import spaza.Product;
import spaza.SoftDrinks;
import spaza.VendingMachine;

import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class MaxiVendingMachineTest {

//    private static void () {
//        "drinks not Found";
//    }

    @Test
    public void shouldGetProductNames() {
        VendingMachine vendingMachine = new VendingMachine();
        Product drinks = new SoftDrinks();

        assertEquals(drinks, drinks);
    }

    @Test
    public void shouldCountProductsAreBought(){
        VendingMachine vendingMachine = new VendingMachine();
        Product drinks = new SoftDrinks();

        vendingMachine.addStock(drinks,2);

        assertEquals(vendingMachine.getNewStock(drinks),2);
    }

    @Test

    public void shouldThrowException(){
    assertThrows(SoftDrinksOutOfStockException.class,()-> new SoftDrinksOutOfStockException());
    }
}
