import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=scanner.next();
                int x=scanner.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");

    }


    // https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax  docs
}
