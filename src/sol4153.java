import java.util.*;
import java.io.*;

public class sol4153 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input1 = 1;
        int input2 = 1;
        int input3 = 1;
        int max=0;

        while(input1!=0){
            input1 = scanner.nextInt();
            input2 = scanner.nextInt();
            input3 = scanner.nextInt();
            if(input1 == 0)
                break;
            if((input1>input2)&&(input1>input3))
                max = 1;
            else if((input2>input1)&&(input2>input3))
                max = 2;
            else
                max = 3;

            if(max == 1)
            {
                if(input1*input1==(input2*input2 + input3*input3))
                    bw.write("right");
                else
                    bw.write("wrong");

            }
            else if(max == 2)
            {
                if(input2*input2==(input1*input1 + input3*input3))
                    bw.write("right");
                else
                    bw.write("wrong");
            }
            else if(max == 3)
            {
                if(input3*input3==(input1*input1 + input2*input2))
                    bw.write("right");
                else
                    bw.write("wrong");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
