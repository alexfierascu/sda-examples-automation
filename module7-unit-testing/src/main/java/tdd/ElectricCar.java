package tdd;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElectricCar {
    private int autonomy;
    private double speed;
    private double autonomieGeneralaAUneiMasiniElectrice;


    public double accelerate(double accelerationSpeed) {
        this.speed = this.speed + accelerationSpeed;
        return this.speed;
    }


    public double decreaseAcceleration(double decelerationSpeed) {
        this.speed = this.speed - decelerationSpeed;
        return this.speed;
    }

    public double getGeneralAutonomy() {
        this.autonomieGeneralaAUneiMasiniElectrice = 500;
        return this.autonomieGeneralaAUneiMasiniElectrice;
    }
}
