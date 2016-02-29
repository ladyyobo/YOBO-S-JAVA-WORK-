import java.util.Scanner;
public class MoreUserInputOfData
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String firstname;
        String lastname;
        int grade;
        int id;
        String login;
        float gpa;
        
        System.out.println("Please enter the following information so I can sell it for profit.");
        
        System.out.print("First Name: ");
        firstname = keyboard.next();
        
        System.out.print("Last Name: ");
        lastname = keyboard.next();
        
        System.out.print("Grade (9-12): ");
        grade = keyboard.nextInt();
        
        System.out.print("Student ID: ");
        id = keyboard.nextInt();
        
        System.out.print("Login: ");
        login = keyboard.next();
        
        System.out.print("GPA: ");
        gpa = keyboard.nextFloat();
        
        System.out.println("            Your information is: ");
        System.out.println("            Login: " + login);
        System.out.println("            ID: " + id);
        System.out.println("            Name:  " + lastname + " , " + firstname );
        
        System.out.println("            Grade: " + grade);
        System.out.println("            GPA: " + gpa);
        
        
    }
    
}
