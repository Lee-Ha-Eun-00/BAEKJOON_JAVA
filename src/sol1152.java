import java.util.*;

public class sol1152 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count=0;
        StringTokenizer st = new StringTokenizer(scanner.nextLine()," ");

        while(st.hasMoreTokens())
        {
            count++;
            st.nextToken();
        }
        System.out.println(count);

    }
}
