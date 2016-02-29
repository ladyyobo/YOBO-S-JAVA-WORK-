import java.util.Scanner;

 public class ForgetfulMachine
 {
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Give me a word");
        keyboard.next();
        
        System.out.println("Give me a second word");
        keyboard.next();
        
        System.out.println("Now give me your favourite number");
        keyboard.next();
        
        System.out.println("And your second favourite number?");
        keyboard.next();
        
        
    }
    
}
