package Basics.BasicRecursion;

public class BasicRecursion {
    int count = 0;

    public void printHelloWorld() {
        if (count >= 10)
            return;

        System.out.println("Hello, World!: " + count);
        count++;
        printHelloWorld();
    }
    
    public static void main(String[] args) {
        BasicRecursion rec = new BasicRecursion();
        rec.printHelloWorld();
    }
}
