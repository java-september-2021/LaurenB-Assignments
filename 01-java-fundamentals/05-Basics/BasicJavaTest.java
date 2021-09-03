public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava basic = new BasicJava();
        int[] nums = { -1, 2, 5, 6, 10 };
        int y = 3;

        basic.OneToTwoFifty();
        basic.PrintOdds();
        System.out.println(basic.GetSum(nums));
        basic.LoopArray(nums);
        System.out.println(basic.FindMax(nums));
        System.out.println(basic.ArrOddNum());
        System.out.println(basic.GetAverage(nums));
        System.out.println(basic.GreaterThanY(nums, y));
        basic.Square(nums);
        basic.EliminateNegative(nums);
        basic.MaxMinAverage(nums);
        basic.ShiftArray(nums);

    }
}
