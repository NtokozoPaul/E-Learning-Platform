package tests.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import creational_patterns.builder.*;

public class PizzaBuilderTest {

    @Test
    public void testBuildPizza() {
        Pizza pizza = new PizzaBuilder()
            .addCheese()
            .addToppings("Mushrooms")
            .build();

        assertTrue(pizza.hasCheese());
        assertEquals("Mushrooms", pizza.getToppings());
    }
}
