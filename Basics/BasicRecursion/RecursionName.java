package Basics.BasicRecursion;

public class RecursionName {
    int count = 0;

    public void printName(int n, String name) {
        if (count >= n)
            return;

        System.out.println(name);
        count++;
        printName(n, name);
    }
    
    public static void main(String[] args) {
        RecursionName rec = new RecursionName();
        rec.printName(10, "Abhiram");
    }
}
