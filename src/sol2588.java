import java.util.*;
public class sol2588 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        int num1 = input2 % 10;
        input2 = input2 / 10;
        int num2 = input2 % 10;
        input2 = input2 / 10;
        int num3 = input2;

        int result1 = input1 * num1;
        int result2 = input1 * num2;
        int result3 = input1 * num3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result1+result2*10+result3*100);
    }
}
