package tests.factory_method;

import org.junit.Test;
import static org.junit.Assert.*;
import creational_patterns.factory_method.*;

public class PaymentProcessorTest {

    @Test
    public void testPayPalProcessor() {
        PaymentProcessor processor = new PayPalProcessor();
        assertEquals("Paid with PayPal", processor.processPayment());
    }

    @Test
    public void testCreditCardProcessor() {
        PaymentProcessor processor = new CreditCardProcessor();
        assertEquals("Paid with Credit Card", processor.processPayment());
    }
}
