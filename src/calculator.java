import java.util.Scanner;
public class calculator
{
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        addition add = new addition();
        subtraction subtract = new subtraction();
        division divide = new division();
        multiplication multiply = new multiplication();

        boolean validation = true;
        while (validation)
        {
            System.out.println("What would you like to do? Please enter the number of one of the following options:");
            System.out.println("1. Add numbers");
            System.out.println("2. Subtract numbers");
            System.out.println("3. Divide numbers");
            System.out.println("4. Multiply numbers");
            System.out.println("5. Exit Calculator");

            // Takes the user input as an integer
            String optionPicked = keyboard.next();

            if (optionPicked.equals("1"))
            {
                add.add();
            }
            else if (optionPicked.equals("2"))
            {
                subtract.subtract();
            }
            else if (optionPicked.equals("3"))
            {
                divide.divide();
            }
            else if (optionPicked.equals("4"))
            {
                multiply.multiply();

            }
            else if (optionPicked.equals("5"))
            {
                validation = false;
                System.out.println("Goodbye.");
            }
            else
            {
                System.out.println("Please only enter a number 1 through 4.");
            }
        }
    }
}

//WANWANWAN