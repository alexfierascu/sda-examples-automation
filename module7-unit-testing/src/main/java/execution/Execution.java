package execution;

import model.Doctor;
import model.Human;
import model.Programmer;

public class Execution {
    public static void main(String[] args) {

        Human human = new Human();
        Doctor doctor = new Doctor();
        Programmer programmer = new Programmer();


        human.setFirstName("Frantz");
        human.setLastName("DeLacroy");
        human.setEducationLevel("DBA");
        human.setAge(37);
        human.run();
        human.talk();
        human.walk();
        System.out.println(human.toString());

        doctor.setFirstName("Albert");
        doctor.setLastName("Einstein");
        doctor.setEducationLevel("PhD");
        doctor.setAge(38);
        doctor.setSpeciality("philosophy");
        doctor.diagnose();
        System.out.println(doctor.toString());

        programmer.setFirstName("Cristi");
        programmer.setLastName("Popescu");
        programmer.setAge(24);
        programmer.setTechnologyStack("java backend developer");
        programmer.setEducationLevel("BSc");
        programmer.code();
        programmer.walk();
        System.out.println(programmer.toString());

        System.out.println(programmer.returnTotalSalary());
    }
}
