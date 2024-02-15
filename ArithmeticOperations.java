import java.util.*;
public class ArithmeticOperations 
{
    
    public static void main(String[] args) 
    {
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the first integer (a): ");
        int a = get.nextInt();

        System.out.print("Enter the second integer (b): ");
        int b = get.nextInt();

        System.out.println("addittion of a & b:"+(a+b));
        System.out.println("subtraction of a & b:"+(a-b));
        System.out.println("multiplication of a & b :"+(a*b));
        System.out.println("division of a & b :"+(a/b));
        System.out.println("modulo of a & b :"+(a%b));
    }
}