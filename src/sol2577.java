import java.util.*;

public class sol2577 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();

        int result = input1*input2*input3;
        int[] arr = new int[10];
        int check=0;

        while(result!=0)
        {
            check = result%10;
            arr[check]++;
            result = result/10;
        }

        for(int i=0 ; i<10 ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
