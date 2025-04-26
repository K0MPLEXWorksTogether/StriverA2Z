package Basics.BasicsOfJava;

public class WhileLoops {
    public static void main(String[] args) {
        boolean gameIsOn = true;
        int count = 0;
        while (gameIsOn) {
            if (count > 10) {
                gameIsOn = false;
            } else {
                count++;
            }
        }
    }    
}
