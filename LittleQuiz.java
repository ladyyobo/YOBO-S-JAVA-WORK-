import java.util.Scanner;
public class LittleQuiz {
    
    public static void main(String[] args){
        Scanner keyboard =new Scanner(System.in);
        int answer, total = 3;
        
        System.out.print("Are you ready for the quiz? ");
        System.out.println("Okay here, it comes!");
        System.out.println("Q1) What is the capial of Alaska?");
        System.out.println("\t 1)Melbourge \n\t 2)Anchorge \n\t 3)Juneau");
        answer = keyboard.nextInt();
        if (answer == 3){
            System.out.println("That's right!");
        }
        else {
            total  -= 1;
        }
       System.out.println(" Can you store the value \"cat\" in a variable of type int?");
       System.out.println("\t 1) yes \n\t 2)no ") ;
       answer  = keyboard.nextInt();
       if (answer == 1){
       System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
       total -= 1;
       }
       else{
           System.out.println("That's right!");
       }
       System.out.println("What is the result of 9+6/3? \n\t 1)5 \n\t 2)11 \n\t 3)15/3");
       answer = keyboard.nextInt();
       if (answer == 2){
        System.out.println("That's correct");
       }
       else{
       System.out.print("Wrong");
       total -=1;
               }
       
       
       System.out.println("Overall, you got " + total +" out of 3 correct;");
       System.out.println("Thanks for playing!");
       
}
    
}
