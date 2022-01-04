public class sol4673 {

    public static void main(String[] args)
    {
        int[] arr = new int[10001];
        int count=1;
        while(count<=10000)
        {
            if(arr[count]==1)
            {
                count++;
                continue;
            }
            else
            {
                func(arr, count);
                count++;
            }

        }

        for(int i=1; i<=10000; i++)
        {
            if(arr[i]==0)
            {
                System.out.println(i);
            }
        }
    }

    static int func(int[] a, int num){



        int sum=num;
        int stdnum=num;
        int remainder=0;

        while(stdnum>0)
        {
            remainder = stdnum % 10;
            sum = sum + remainder;
            stdnum = stdnum / 10;

        }



        if(sum>10000)
            return 0;
        else
        {
            a[sum]=1;
            func(a, sum);
        }
        return 0;
    }

}
