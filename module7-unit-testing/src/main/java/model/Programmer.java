package model;

import lombok.Getter;
import lombok.Setter;

import static java.lang.Math.pow;

@Getter
@Setter
public class Programmer extends Human {
    private String technologyStack;
    private double monthlySalary = 2500;
    private double salaryIncreasePercentage;
    private int pensionAge = 70;
    private int annualSalaryIncreasePercentage = 10;

    public String code() {
        return "The programmer is coding";
    }

    public String walk() {
        return "The programmer is walking";
    }

    @Override
    public String toString() {
        return super.toString() + " Programmer{" +
                "technologyStack='" + technologyStack + '\'' +
                ", salary=" + monthlySalary +
                '}';
    }

    public double increaseSalary(double salaryIncreasePercentage) {
        return monthlySalary + (monthlySalary *salaryIncreasePercentage)/100;
    }

    //todo
    public double returnTotalSalary() {
        double finalSalary = 0;
        double annualSalary = monthlySalary * 12;
        for (int i = 0; i < 3; i++) {
            finalSalary = finalSalary + annualSalary + annualSalary * pow(annualSalaryIncreasePercentage, i);
        }
        return finalSalary;
    }
}
