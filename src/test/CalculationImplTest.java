package test;

import com.askar.classes.entity.*;
import com.askar.classes.service.CalculationImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CalculationImplTest {

    Salad salad = null;
    Fruit apple = null;
    Fruit banana = null;
    Vegetable avocado = null;
    SeaProduct krill = null;
    CalculationImpl calculation = null;

    @Before
    public void setUp() throws Exception {
        salad = new Salad("delicious");
        apple = new Fruit(FruitType.APPLE, 2019, 6, 2, 150, 1, 20);
        banana = new Fruit(FruitType.BANANA, 2019, 5, 29, 200, 1, 20);
        avocado = new Vegetable(VegetableType.AVOCADO, 2019, 5, 28, 300, 2, 25);
        krill = new SeaProduct(SeaProductType.KRILL, 2019, 5, 15, 500, 1, 10);
        calculation = new CalculationImpl();
        salad.addIngredient(apple);
        salad.addIngredient(banana);
        salad.addIngredient(avocado);
        salad.addIngredient(krill);
    }

    @After
    public void tearDown() throws Exception {
        salad = null;
        apple = null;
        banana = null;
        avocado = null;
        krill = null;
        calculation = null;
    }

    @Test
    public void sumOfCalorie() {
        double actual = calculation.sumOfCalorie(salad);
        double expected = 19.0;
        Assert.assertEquals(expected, actual, 0.00);

    }

    @Test
    public void intgredientsInRangeOfCalorie() {
        List<AbstractIngredient> actual = calculation.intgredientsInRangeOfCalorie(salad);
        List<AbstractIngredient> expected = Arrays.asList(krill);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortByCalorie() {
        List<AbstractIngredient> actual = calculation.sortByCalorie(salad);
        List<AbstractIngredient> expected = Arrays.asList(apple, banana, krill, avocado);
        Assert.assertEquals(expected, actual);
    }
}