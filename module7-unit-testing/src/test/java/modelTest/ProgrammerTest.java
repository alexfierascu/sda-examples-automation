package modelTest;

import model.Programmer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgrammerTest {

    Programmer programmer = new Programmer();

    @Test
    public void checkLastNameFunctionality() {
        programmer.setLastName("Decebal");
        String programmerName = programmer.getLastName();
        assertEquals(programmerName, "Decebal");
    }

    @Test
    public void checkFirstNameFunctionality() {
        programmer.setFirstName("Vasile");
        ;
        String programmerFirstName = programmer.getFirstName();
        assertEquals(programmerFirstName, "Vasile");
    }

    @Test
    public void checkAgeFunctionality() {
        programmer.setAge(29);
        int programmerAge = programmer.getAge();
        assertEquals(programmerAge, 29);
    }

    @Test
    public void checkSalaryFunctionality() {
        programmer.setMonthlySalary(9999.987654321);
        double programmerSalary = programmer.getMonthlySalary();
        assertEquals(programmerSalary, 9999.987654321);
    }

    @Test
    public void checkTechnologyStackFunctionality() {
        programmer.setTechnologyStack("java");
        String programmerTechnologyStack = programmer.getTechnologyStack();
        assertEquals(programmerTechnologyStack, "java");
    }

    @Test
    public void checkEducationFunctionality() {
        programmer.setEducationLevel("BCs");
        String programmerEducationLevel = programmer.getEducationLevel();
        assertEquals(programmerEducationLevel, "BCs");
    }

    @Test
    public void checkIncreaseSalaryFunctionality() {
        double newSalary = programmer.increaseSalary(10);
        assertEquals(newSalary, 2750);
    }
}
