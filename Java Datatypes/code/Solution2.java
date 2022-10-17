import java.util.*;
import java.io.*;



class Solution2{
    public static void main(String []argh)
    {
        Scanner scanner = new Scanner(System.in);
        int myInt =scanner.nextInt();

        for(int i = 0; i < myInt; i ++){

            try{
                long myLong = scanner.nextLong();
                System.out.println(myLong+" can be fitted in:");
                if(myLong>=Byte.MIN_VALUE && myLong<=Byte.MAX_VALUE)System.out.println("* byte");
                if(myLong>=Short.MIN_VALUE && myLong<=Short.MAX_VALUE)System.out.println("* short");
                if(myLong>=Integer.MIN_VALUE && myLong<=Integer.MAX_VALUE)System.out.println("* int");
                if(myLong>=Long.MIN_VALUE && myLong<=Long.MAX_VALUE)System.out.println("* long");
            }catch(Exception e){
                System.out.println(scanner.next()+" can't be fitted anywhere. ");
            }
        }
    }
}