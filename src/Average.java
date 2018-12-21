/*
   11/18/14
   JDK 1.7
   Find the average using a loop
 */
import javax.swing.JOptionPane;
public class Average {
    public static void main(String[] args) {
        double number=0;
        double sum=0;
        String input;
        int tally=0;
        do{
            input=JOptionPane.showInputDialog(null,"Enter a number (0 to stop)");
            number= Double.parseDouble(input);
            sum=sum+number;
            if(number !=0)
            tally++;
        }while(number != 0);    
        System.out.println("The sum is " + sum +
                "\nThe average is " + sum/tally);
    }
}