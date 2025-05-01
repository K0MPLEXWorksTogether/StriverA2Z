package Basics.BasicMaths;

public class ArmstrongNumber {
    public boolean isArmstrong(int num) {
        int length = String.valueOf(num).length();
        int armstrong = 0;
        int copy = num;
        while (num > 0) {
            int dig = num % 10;
            armstrong += Math.pow(dig, length);
            num /= 10;
        }

        return copy == armstrong ? true : false;
    }

    public static void main(String[] args) {
        ArmstrongNumber arm = new ArmstrongNumber();
        System.out.println(arm.isArmstrong(371));
    }
}
