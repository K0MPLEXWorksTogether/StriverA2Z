package Basics.BasicsOfJava;

public class DoWhile {
    public static void main(String[] args) {
        boolean gameIsOn = true;
        int count = 0;

        do {
            if (count > 10) {
                gameIsOn = false;
            } else {
                count++;
            }
        } while (gameIsOn);
    }
}
