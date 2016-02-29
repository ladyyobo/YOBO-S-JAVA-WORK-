import javax.swing.*;
public class UsingSwingForInput {
    
    public static void main(String[] args){
        String s="";
       s = JOptionPane.showInputDialog("What is your name?");
        String name = s;
       s = JOptionPane.showInputDialog("How old are you?");
       int age  = Integer.parseInt(s);
       
       System.out.print("Hello  "+ name +" ");
       System.out.println("Next year, you'll be " +(age+1));
       System.exit(0);
    }
}

