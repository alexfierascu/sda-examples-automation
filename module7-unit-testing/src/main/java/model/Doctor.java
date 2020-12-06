package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doctor extends Human {
    private String speciality;
    private int salary;
    private double bribe;
    private int numarCredite;

    public void diagnose() {
        System.out.println("The doctor is diagnosing");
    }

    @Override
    public String toString() {
        return super.toString() + " Doctor{" +
                "speciality='" + speciality + '\'' +
                '}';
    }

    public double calculateTotalIncome() {
        return salary + bribe;
    }

    public boolean checkBribeLevel() {
        if (bribe <= 500) {
            return true;
        } else {
            return false;
        }
    }

    public String calculateProficiencyLevel() {
        if (numarCredite <= 10) {
            return "L1";
        } else if (numarCredite > 10 && numarCredite <= 50) {
            return "L2";
        } else {
            return "L3";
        }
    }

}
