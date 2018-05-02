import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Checker {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String BracketSequence = br.readLine();
            System.out.println(checkCorrectBracketSequences(BracketSequence));
        }
    }

    static Boolean checkCorrectBracketSequences(String BracketSequence) {
        byte counter = 0;
        char[] charArray = BracketSequence.toCharArray();
        for (char c : charArray) {
            if (c == '(') {
                counter++;
            } else if (c == ')') {
                counter--;
            }
            if (counter < 0) {
                return false;
            }
        }
        return counter == 0;
    }
}
