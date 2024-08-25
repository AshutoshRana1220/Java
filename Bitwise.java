import java.util.*;
public class Bitwise{
    public static void main(String args[])
    {
        // welcome to our bitwise program
        Scanner input =new Scanner(System.in);
        System.out.println("enter your first numbe:");
        int first = input.nextInt();
        System.out.println("enter your second number:");
        int second =input.nextInt();

        int result = first & second;
        System.out.println(result);
        int results =first |second;
        System.out.println(result);
    } 
}