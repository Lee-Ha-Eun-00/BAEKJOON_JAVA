import java.util.*;

public class sol1110 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        if((input>=0)&&(input<=99))
        {
            int fnum1 = 0;
            int fnum2 = 0;
            int anum1 = 0;
            int anum2 = 0;
            int sum = 0;
            int result = -1;
            int count = 0;

            while(result != input)
            {
                if(input == 0)
                {
                    fnum1 = 0;
                    fnum2 = 0;
                    anum1 = 0;
                    anum2 = 0;
                }
                else
                {
                    if(count == 0)
                    {
                        result = input;
                    }
                    if(result<10)
                        fnum1 = 0;
                    else
                        fnum1 = result / 10;
                    fnum2 = result % 10;

                    sum = fnum1 + fnum2;

                    if(sum<10)
                        anum1 = 0;
                    else
                        anum1 = sum / 10;
                    anum2 = sum % 10;
                }
                result = fnum2 * 10 + anum2;
                count++;
            }

            System.out.println(count);
        }
    }
}
