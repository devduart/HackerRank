import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length() + B.length());
        Integer get_val = A.compareTo(B);

        if(get_val > 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


        String s1 = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
        String s2 = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();

        System.out.println(s1 + " " + s2);
    }

}
