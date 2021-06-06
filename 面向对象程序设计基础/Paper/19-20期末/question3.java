import java.util.Scanner;
import java.util.zip.DataFormatException;

public class question3 {
    public static void main(String[] args) {
         int max;
         int min;
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                max = sc.nextInt();
                min = max;
                break;
            }catch (Exception ex){
                System.out.println("NoT a int");
                System.out.println(ex.toString());
                sc.next();
            };
        }
        for(int i = 0; i<9 ; i++){
            while(true){
                try {
                    int tnum = sc.nextInt();
                    if(tnum> max){
                        max =tnum;
                    }
                    if(tnum < min){
                        min = tnum;
                    }
                    break;
                }catch (Exception ex){
                    System.out.println("NoT a int");
                    System.out.println(ex.toString());
                    sc.next();
                };
            }
        }
        System.out.printf("The max is %d \n", max);
        System.out.printf("The min is %d \n", min);
    }
}
