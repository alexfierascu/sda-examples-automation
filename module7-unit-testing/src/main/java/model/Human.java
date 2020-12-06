package model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Human {
    private String firstName;
    private String lastName;
    private String educationLevel;
    private int age;


    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", educationLevel='" + educationLevel + '\'' +
                ", age=" + age +
                '}';
    }

    public String walk() {
        return "The human is walking.";
    }

    public String run() {
        return "The human is running.";
    }

    public String talk() {
        return "The human is talking.";
    }

    public boolean isHumanAllowedToVote(int age) {
        boolean flag;
        switch (age) {
            case 10:
                flag = false;
                break;
            case 18:
                flag = true;
                break;
            case 58:
                flag = true;
                break;
            case 1:
                flag = false;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + age);
                //flag = false;
        }
        return flag;
    }

}
