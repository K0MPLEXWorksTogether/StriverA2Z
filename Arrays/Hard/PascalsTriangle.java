package Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;

public class PascalsTriangle {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (numRows == 1) {
            result.add((ArrayList<Integer>) (Arrays.asList(1)));
            return result;
        }

        ArrayList<ArrayList<Integer>> prevRows = generate(numRows - 1);
        ArrayList<Integer> newRow = new ArrayList<Integer>();
        newRow.add(1);
        ArrayList<Integer> prevRow = prevRows.get(prevRows.size() - 1);
        for (int i = 1; i < prevRow.size(); i++) {
            newRow.add(prevRow.get(i) + prevRow.get(i - 1));
        }
        newRow.add(1);
        prevRows.add(newRow);
        return prevRows;
    }
}
