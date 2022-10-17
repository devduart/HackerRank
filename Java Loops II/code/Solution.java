import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        for (int i = 0; i < myInt; i++) {
            int myInt2 = scanner.nextInt();
            int myInt3 = scanner.nextInt();
            int myInt4 = scanner.nextInt();
            int myInt5 = 1;
            int myInt6 = myInt2;
            for (int k = 0; k < myInt4; k++) {
                myInt6 = myInt6 + myInt5 * myInt3;
                System.out.print(myInt6);
                myInt5 = myInt5 << 1;
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}