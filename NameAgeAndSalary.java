import java.util.Scanner;

public class NameAgeAndSalary
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        int age;
        float salary;
        
        System.out.println("What is your name?");
        name = keyboard.next();
        
        System.out.println("Hi " + name + "! How old are you?");
        age = keyboard.nextInt();
        System.out.println("So you're " + age + " eh! That's not old enough");
        
        System.out.println("How much do you make " + name + " ?");
        salary = keyboard.nextFloat();
        
        System.out.println(salary + " I hope that's per hour not per year");
        
    }
    
}
