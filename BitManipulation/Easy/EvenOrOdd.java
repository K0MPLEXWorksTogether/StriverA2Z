package BitManipulation.Easy;

public class EvenOrOdd {
    public static boolean isEven(int num) {
        if ((num & 1) > 0) {
            return true;
        }

        return false;
    }
}
