import java.util.*;

public class Comparison {

    public static void main(String[] args) {
        
        String value_a = "";
        String value_b = "";

        Scanner userInput = new Scanner(System.in);

        //Ask user for first word
        System.out.println("Enter your first word: ");
        value_a = userInput.nextLine();
        //Ask user for second word
        System.out.println("Enter your second word: ");
        value_b = userInput.nextLine();

        //comparative logic
        if (value_a.equals(value_b)){
            System.out.println("OUTPUT:    ");
            System.out.println("- First word: " + value_a);
            System.out.println("-- Second word: " + value_b);

            System.out.println("==== Comparison: " + value_a.compareTo(value_b));
            System.out.println(" Same words were entered");
        }
        else{
            System.out.println("OUTPUT:    ");
            System.out.println("- First word: " + value_a);            
            System.out.println("-- Second word: " + value_b);

            System.out.println("==== Comaprison: " + value_a.compareTo(value_b));
            System.out.println(" Not The same");
        }




    }
}
