package tests.simple_factory;

import org.junit.Test;
import static org.junit.Assert.*;
import creational_patterns.simple_factory.*;

public class VehicleFactoryTest {

    @Test
    public void testCar() {
        Vehicle car = VehicleFactory.createVehicle("car");
        assertTrue(car instanceof Car);
    }

    @Test
    public void testBike() {
        Vehicle bike = VehicleFactory.createVehicle("bike");
        assertTrue(bike instanceof Bike);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidType() {
        Vehicle invalid = VehicleFactory.createVehicle("plane");
    }
}
