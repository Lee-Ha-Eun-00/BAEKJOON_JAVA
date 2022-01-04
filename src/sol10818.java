import java.util.*;

public class sol10818 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();


        if((input>=1)&&(input<=1000000))
        {
            int[] arr = new int[input];
            for(int i=0; i<input; i++)
            {
                int num = scanner.nextInt();
                arr[i] = num;
            }

            //최댓값 구하기
            int max=arr[0];
            for(int i=0; i<input-1; i++)
            {
                if(arr[i+1] > max) {
                    max = arr[i + 1];
                }
            }

            //최솟값 구하기
            int min=arr[0];
            for(int i=0; i<input-1; i++)
            {
                if(arr[i+1] < min) {
                    min = arr[i + 1];
                }
            }

            System.out.printf(min + " " + max);
        }
    }
}
