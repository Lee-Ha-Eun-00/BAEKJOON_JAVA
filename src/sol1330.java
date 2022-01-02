import java.util.*;

public class sol1330 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        if(((input1 <= 10000)&&(input1 >= -10000))&&((input2 <= 10000)&&(input2 >= -10000)))
        {
            if(input1>input2)
                System.out.println(">");
            else if(input1<input2)
                System.out.println("<");
            else if(input1==input2)
                System.out.println("==");

        }else
        {
            System.out.println("error");
        }
    }
}
