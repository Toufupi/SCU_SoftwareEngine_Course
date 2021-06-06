import java.util.Scanner;

public class question1 {
    public static void main(String[] args){
        int NumberOfUpper = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a stringzheng:");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();

        for(char tchar : chars){
            if (tchar>= 'A' && tchar <= 'Z'){
                NumberOfUpper ++;
            }
        }
        System.out.print("The number of  uppercase letters is ");
        System.out.println(NumberOfUpper);
    }
}
