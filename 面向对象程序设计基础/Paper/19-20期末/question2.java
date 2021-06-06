import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question2 {
    public static void main(String[] args)throws IOExcep
    tion{
        int[] NumOfEach = new int[10];
        //将数字个数与数组下标对应
        BufferedReader In = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String:");
        String str = In.readLine();
        char[] chars = str.toCharArray();
        for(char tchar : chars){
            NumOfEach[Integer.parseInt(String.valueOf(tchar))] += 1;
        }
        for(int i = 0;i < 10;i++){
            System.out.printf("Number of %d = %d \n",i,NumOfEach[i]);
        }
    }
}
