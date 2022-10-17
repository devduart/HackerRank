import java.io.*;
import java.util.*;

public class Solution {
    public static int b, h;
    private static boolean flag = false;

    static
    {
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        h = scanner.nextInt();
        if( b > 0 && h > 0){
            flag = true;
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area = b * h;
            System.out.println(area);
        }

    }
}