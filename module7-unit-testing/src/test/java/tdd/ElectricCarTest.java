package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectricCarTest {
    ElectricCar futureElectricCar = new ElectricCar();

    @Test
    public void checkElectricCarAutonomy() {
        futureElectricCar.setAutonomy(400);
        int carAutonomy = futureElectricCar.getAutonomy();
        assertEquals(carAutonomy, 400);
    }

    @Test
    public void checkIncreaseAccelerationFeature() {
        futureElectricCar.setSpeed(0);
        double carSpeed = futureElectricCar.accelerate(50.8);
        assertEquals(carSpeed, 50.8);
    }

    @Test
    public void checkDecreaseAccelerationFeature() {
        futureElectricCar.setSpeed(50.8);
        double newCarSpeed = futureElectricCar.decreaseAcceleration(80);
        assertEquals(newCarSpeed, -29.2, 0.1);
    }

    @Test
    public void checkAutonomy() {
        double distanceFromAToB = 98.2;
        double distanceFromBToC = 100.9;
        double distanceFromCToD = 200.9;
        double distanceFromDToA = 100;

        double distantaDeParcurs = distanceFromAToB + distanceFromBToC + distanceFromCToD + distanceFromDToA;
        assertEquals(distantaDeParcurs, futureElectricCar.getGeneralAutonomy());
    }
}
