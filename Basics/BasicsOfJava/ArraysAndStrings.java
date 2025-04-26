package Basics.BasicsOfJava;

public class ArraysAndStrings {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        String string = "Name";

        System.out.println("Array");
        for (int num : array) {
            System.out.printf("%d ", num);
        }

        System.out.println("String");
        System.out.println(string); 
    }
}
