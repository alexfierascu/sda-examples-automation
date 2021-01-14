package beginner;

public class ProblemaCeva {
    public static void main(String[] args) {
        System.out.println(gradePercentage("85 %", "85 %"));
    }

    public static String gradePercentage(String userScore, String passScore) {
        String[] userScoreArray = userScore.split(" ");
        String[] passScoreArray = passScore.split(" ");
        int userScoreNumber = Integer.parseInt(userScoreArray[0]);
        int passScoreNumber = Integer.parseInt(passScoreArray[0]);
        String s = checkIfPassed(userScoreNumber, passScoreNumber);

//        if (Integer.parseInt(userScore.substring(0, userScore.length())) <= Integer.parseInt(passScore.substring(0, passScore.length()))) {
//            s += "PASSED";
//        }
//        if (Integer.parseInt(userScore.substring(0, userScore.length())) >= Integer.parseInt(passScore.substring(0, passScore.length()))) {
//            s += "FAILED";
//        }
        return "You " + s + " the Exam";
    }

    public static String checkIfPassed(int userScore, int passScore) {
        if (userScore >= passScore) {
            return "PASSED";
        } else {
            return "FAILED ";
        }
    }
}
