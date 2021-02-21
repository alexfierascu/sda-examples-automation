package modelTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import model.Doctor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoctorTest {

  Doctor doctor = new Doctor();

  @Test
  public void test1() {
    doctor.setSpeciality("Dermatology");
    String doctorSpeciality = doctor.getSpeciality();
    assertEquals("Dermatology", doctorSpeciality);
  }

  @Test
  public void test2() {
    doctor.setSpeciality("Dermatology");
    String doctorSpeciality = doctor.getSpeciality();
    Assertions.assertNotNull(doctorSpeciality);
  }

  @Test
  public void test3() {
    doctor.setSalary(2000);
    doctor.setBribe(500);
    double income = doctor.calculateTotalIncome();
    assertEquals(income, 2500);
  }

  @Test
  public void test4() {
    doctor.setBribe(1000);
    boolean isFraudulent = doctor.checkBribeLevel();
    assertFalse(isFraudulent);
  }

  @Test
  public void test5() {
    doctor.setBribe(400);
    boolean isFraudulent = doctor.checkBribeLevel();
    assertTrue(isFraudulent);
  }

  @Test
  public void test6() {
    doctor.setNumarCredite(8);
    String level = doctor.calculateProficiencyLevel();
    assertEquals(level, "L1");
  }

  @Test
  public void test7() {
    doctor.setNumarCredite(25);
    String level = doctor.calculateProficiencyLevel();
    assertEquals(level, "L2");
  }

  @Test
  public void test8() {
    doctor.setNumarCredite(80);
    String level = doctor.calculateProficiencyLevel();
    assertEquals(level, "L3");
  }

  @Test
  public void checkThatADoctorCanIncreaseHisNumberOfCredits() {
    doctor.setNumarCredite(9);
    int newNumberOfCredits = doctor.increaseNumberOfCredits(10);
    assertEquals(newNumberOfCredits, 19);
  }
}
