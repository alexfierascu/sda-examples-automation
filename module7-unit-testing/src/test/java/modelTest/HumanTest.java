package modelTest;

import model.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {
    Human human = new Human();

    @Test
    public void checkLastNameFunctionality() {

        human.setLastName("Popescu");
        String numeOm = human.getLastName();
        assertEquals(numeOm, "Popescu");
    }

    @Test
    public void checkFirstNameFunctionality() {
        human.setFirstName("Cineva");
        String prenumeOm = human.getFirstName();
        assertEquals(prenumeOm, "Cineva");
    }

    @Test
    public void checkEducationFunctionality() {
        human.setEducationLevel("BSc");
        String studies = human.getEducationLevel();
        assertEquals(studies, "BSc");
    }

    @Test
    public void checkAgeFunctionality() {
        human.setAge(23);
        int varsta = human.getAge();
        assertEquals(varsta, 23);
    }

    @Test
    public void checkWalkFunctionality() {
        String response = human.walk();
        assertEquals(response, "The human is walking.");
    }

    @Test
    public void checkRunFunctionality() {
        String response = human.run();
        assertEquals(response, "The human is running.");
    }

    @Test
    public void checkTalkFunctionality() {
        String response = human.talk();
        assertEquals(response, "The human is talking.");
    }

    @Test
    public void checkVotingFunctionalityWithValidData() {
        boolean result = human.isHumanAllowedToVote(58);
        assertTrue(result);
    }

    @Test
    public void checkVotingFunctionalityWithInvalidDataAndHandlingExceptions() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            human.isHumanAllowedToVote(34);
        });
        String expectedMessage = "Unexpected value";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
