import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        scanner.close();

        String myString = String.valueOf(myInt);
        if (myInt == Integer.parseInt(myString)){
            System.out.println("Good job");
        }else {
            System.out.println("Wrong answer.");
        }

    }
}
