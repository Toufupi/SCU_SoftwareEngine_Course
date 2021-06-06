import java.util.ArrayList;

public class question4 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("zhang san");
        names.add("li si");
        names.add("wang five");
        names.add("horse six");
        names.add("zhao qi");
        for (int i = 0;i < 5; i++){
            System.out.print(names.get(i));
            System.out.printf(" is the %d elements\n",i);
        }
        System.out.println(names.size());
        names.remove(2);
        System.out.println(names.get(2));
        System.out.println(names.size());
    }
}
