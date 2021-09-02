import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {

    // Get an array of 10 random numbers
    Random rnd = new Random();
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rnd10 = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 1; i <=10; i++) {
            rnd10.add(rnd.nextInt(21));
        }
        return rnd10;
    }

    // Return a random letter
    public String getRandomLetter() {
        Random rnd = new Random();
        String alphaString = "abcdefghijklmnopqrstuvwxyz";
        char rndChar = alphaString.charAt(rnd.nextInt(26));
        return String.valueOf(rndChar);

    }


    // Generate Password
    public String genPassword() {
        String password = "";
        for (int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }    

    // Get New Password Set
    public ArrayList<String> getSetPassword(int len) {
        ArrayList<String> setPassword = new ArrayList<String>();
        for (int i = 0; i < len; i++) {
            setPassword.add(genPassword());
        }
        return setPassword;
    }
}
