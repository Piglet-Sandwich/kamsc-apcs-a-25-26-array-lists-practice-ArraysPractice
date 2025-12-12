import java.util.ArrayList;
import java.util.Arrays;

public class SandwichSum {
    public static void main(String[] args) {        
        // Starting number: 5, Ending number: 9
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
            10, 5, 2, 8, 5, 9, 10
        ));
        System.out.println("Input: number = " + numbers + ", startNum = 5, endNum = 9");
        System.out.println("Output: " + sumBetween(numbers, 5, 9));
    }
    
    public static int sumBetween(ArrayList<Integer> numbers, int startNum, int endNum) {
        // TODO: Implement this method
        // Find the index of the first occurrence of startNum
        // Find the index of the first occurrence of endNum
        // Sum all integers found at the indices between them (strictly between, not including start and end)
        // Return the calculated sum
        int tot = 0;
        for (int i = numbers.indexOf(startNum) + 1; i < numbers.indexOf(endNum); i++) {
            tot += numbers.get(i);
        }
        return tot;
    }
}
