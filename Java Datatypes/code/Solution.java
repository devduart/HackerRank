import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {
        Scanner scanner = new Scanner(System.in);
        int myInt =scanner.nextInt();

        for(int i=0;i<myInt;i++)
        {

            try
            {
                long myLong=scanner.nextLong();
                System.out.println(myLong+" can be fitted in:");
                if(myLong>=-128 && myLong<=127)System.out.println("* byte");
                if(myLong>=-32768 && myLong<=32767)System.out.println("* short");
                double int_cutoff = Math.pow(2,31);
                if(myLong>=-int_cutoff && myLong<=int_cutoff-1)System.out.println("* int");
                double long_cutoff = Math.pow(2,63);
                if(myLong>=-long_cutoff && myLong<=long_cutoff-1)System.out.println("* long");

            }
            catch(Exception e)
            {
                System.out.println(scanner.next()+" can't be fitted anywhere.");
            }

        }
    }
}