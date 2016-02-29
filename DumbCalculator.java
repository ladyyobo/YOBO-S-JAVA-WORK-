import java.util.Scanner;

public class DumbCalculator 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double a,b,c,sum;
        
        
        System.out.println("What is your first number?");
        a = keyboard.nextDouble();
        System.out.println("What is your second number?");
        b = keyboard.nextDouble();
        System.out.println("What is your third number?");
        c = keyboard.nextDouble();
        sum=(a+b+c)/2;
        
        System.out.print("("+a+"+"+b+"+"+c+")" + "/2 is..." + sum );
    }
    
}
