import java.util.*;
public class Coordinate
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x");
        int x= sc.nextInt();
        System.out.println("enter the value of y");
        int y= sc.nextInt();
        if(x==0 && y==0)
        {
            System.out.println("the line in origin");
        }
        else if(x>0 && y>0)
        {
            System.out.println("the line in first quadrant");
        }
        else if(x<0 && y>0)
        {
            System.out.println("line in second quadrant");
        }
        else if(x<0 && y<0)
        {
            System.out.println("the line in third quadrant");
        }
        else if(x>0 && y<0)
        {
            System.out.println("the line in fourth quadrant");
        }
        else if(x==0 && y>0)
        {
            System.out.println("the line in y axis");
        }
        
    }
}