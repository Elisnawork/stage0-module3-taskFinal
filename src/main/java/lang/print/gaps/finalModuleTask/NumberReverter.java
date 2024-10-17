package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
    int num1 = number/100;
    int num2 = (number/10)%10;
    int num3 = number%10;
    int result = num3*100 + num2*10 + num1;
    System.out.println(result);
    }
}
