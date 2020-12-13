package string;

//count how many words have 4 letters in a given string
public class Exercise11 {

    public static void main(String[] args) {
        System.out.println(count4LetterWords("Ioan alexandru gigi nemimar radu"));
    }

    public static int count4LetterWords(String word) {
        int count = 0;
        String[] splitWord = word.split(" ");
        for (int i = 0; i < splitWord.length; i++) { //array - splitWord.length
            if (splitWord[i].length() == 4) { //string - splitWord[i].length()
                count++;
            }
        }
        return count;
    }
}
