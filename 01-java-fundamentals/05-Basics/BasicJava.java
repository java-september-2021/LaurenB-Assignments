import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

    // GET AVERAGE
    public double GetAverage(int[] number) {
        int sum = GetSum(number);
        double avg = (double)sum/number.length;
        System.out.println(String.format("Average is %f", avg));
        return avg;
    }

    // GREATER THAN Y
    public int GreaterThanY (int[] arr, int y) {
        int count = 0;
        for (int num: arr) {
            if (num > y)
                count++;
        }
        return count;
    }

    //SQUATE THE VALUE
    public void Square(int[] num) {
        for(int i = 0; i < num.length; i++) {
            num[i]= num[i] * num[i];
            System.out.println(num[i]);
        }
    }

    // ELIMINATE NEGATIVE NUMBERS
    public void EliminateNegative(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0)
                num[i]=0;
                System.out.println(num[i]);
        }    
    }

    // FIND MIN
    public int FindMin(int[] numbers) {
        int minValue = numbers[0];
        for (int i =0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue= numbers[i];
            }
        }
        return minValue;
    }
    // MAX, MIN, AVERAGE
    public void MaxMinAverage(int[] num){
        int max = FindMax(num);
        int min = FindMin(num);
        double avg = GetAverage(num);
        System.out.println(String.format("Max is %d, Min is %d, Avg is %f", max, min, avg));

    }

    // SHIFTING THE VALUES IN THE ARRAY
    public void ShiftArray(int[] arrnum) {
        for (int i = 0; i < arrnum.length; i++) {
            if (i == arrnum.length-1) {
                arrnum[i]=0;
                break;
            }
            arrnum[i] = arrnum[i+1];
        }
        System.out.println(Arrays.toString(arrnum));
    }
} 