import java.io.*;
import java.util.Scanner;

class DataTypes{
    public static void main(String args[])throws IOException{
        //To read an input 2 methodes
        //1. Using scanner class
        //2. Using bufferedReader

        /**Scanner class **/
        //make an object scanner class
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter a value : ");
        // String num = scan.nextLine();
        // System.out.println("Character in the first position of string: "+ num.charAt(0));
        // scan.close();

        /** USING BUFFERED READER **/
        //make object of inputstreamreader
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader reader = new BufferedReader(isr);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a value : ");
        String value = reader.readLine();
        int num = Integer.parseInt(value);
        System.out.println("Entered value is : "+num);

    }
}