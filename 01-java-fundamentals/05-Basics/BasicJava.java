import java.util.ArrayList;
public class BasicJava {

    // PRINT 1-255
    public void OneToTwoFifty() {
        for (int i = 1; i <= 255; i++)
            System.out.println(i);
        
    }
    
    // PRINT ODD NUMBERS BETWEEN 1-255
    public void PrintOdds() {
        for (int i = 1; i <= 255; i++)
            if (i % 2 != 0)
                System.out.println(i);
    }

    // SIGMA OF 255 AKA SUM TO 255
    public int GetSum(int[] numbers) {
       int sum = 0;
       for ( int i= 1; i < numbers.length; i++) {
           sum += numbers[i];
       }
        return sum;
    }

    // ITERATING THROUGH AN ARRAY
    public void LoopArray(int[] arr) {
        for(int value: arr)
            System.out.println(value);
    }

    // FIND MAX
    public int FindMax(int[] numbers) {
        int maxValue = numbers[0];
        for (int i =0; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    // ARRY WITH ODD NUMBERS
    public ArrayList<Integer> ArrOddNum() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for ( int i = 0; i <=255; i++) {
            if (i % 2 != 0)
                nums.add(i);
        }
        return nums;
    }
}