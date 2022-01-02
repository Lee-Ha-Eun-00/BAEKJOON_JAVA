import java.util.*;

public class sol10871 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int stdnum = scanner.nextInt();
        int input=0;
        if(((num>=1)&&(num<=10000))&&((stdnum>=1)&&(stdnum<=10000)))
        {
            for(int i = 0; i<num; i++ )
            {
                input = scanner.nextInt();
                if(input<stdnum)
                {
                    System.out.printf(input + " ");
                }
            }
        }
    }
}
