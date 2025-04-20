package tests.simple_factory;

import org.junit.Test;
import static org.junit.Assert.*;

import creational_patterns.simple_factory.*;

public class VehicleFactoryTest {

    @Test
    public void testCreateCar() {
        Vehicle car = VehicleFactory.createVehicle("car");
        assertTrue(car instanceof Car);
        car.drive();
    }

    @Test
    public void testCreateBike() {
        Vehicle bike = VehicleFactory.createVehicle("bike");
        assertTrue(bike instanceof Bike);
        bike.drive();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidVehicleType() {
        Vehicle unknown = VehicleFactory.createVehicle("plane");
    }
}
