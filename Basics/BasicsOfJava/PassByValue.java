package Basics.BasicsOfJava;

public class PassByValue {
    public void swapNums(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        
        System.out.println("Values Before:");
        System.out.println("A: " + num1 + " B: " + num2);
        PassByValue test = new PassByValue();
        test.swapNums(num1, num2);

        System.out.println("Values After:");
        System.out.println("A: " + num1 + " B: " + num2);
    }
}
