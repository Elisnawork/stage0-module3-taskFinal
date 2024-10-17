package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int num4 = number%10; // 4
        int num3 = (number/100)%10; // 3
        int num2 = (number/10)%10;
        int num1 = number/1000;

        int result = num4 + num3 + num2 + num1;

        System.out.println(result);



    }
}
