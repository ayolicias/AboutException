package JUnitSpark.src.test.java.maxivendings;

import exceptions.SaltyCracksAllEatenException;
import exceptions.SoftDrinksOutOfStockException;
import maxivending.MaxiVendingMachine;
import org.testng.annotations.Test;
import spaza.Product;
import spaza.SaltySnakes;
import spaza.SoftDrinks;
import spaza.VendingMachine;

import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class MaxiVendingMachineTest {

    @Test
    public void shouldGetProductNames() {
        VendingMachine vendingMachine = new VendingMachine();
        Product drinks = new SoftDrinks();

        assertEquals(drinks, drinks);
    }

    @Test
    public void shouldGetNewStock(){
        VendingMachine vendingMachine = new VendingMachine();
        Product drinks = new SoftDrinks();
        vendingMachine.addStock(drinks,2);

        assertEquals(vendingMachine.getNewStock(drinks),2);
    }

    @Test

    public void shouldThrowMaxiException(){
        MaxiVendingMachine maxiVendingMachine = new MaxiVendingMachine();
        SoftDrinks softDrinks = new SoftDrinks();

        assertThrows(SoftDrinksOutOfStockException.class,() -> maxiVendingMachine.buy(softDrinks));
    }

    @Test

    public void shouldThrowVendingException(){
        VendingMachine vendingMachine = new VendingMachine();
        SaltySnakes saltySnakes = new SaltySnakes();

        assertThrows(SaltyCracksAllEatenException.class,() -> vendingMachine.buy(saltySnakes));
    }
}
