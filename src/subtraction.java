import java.util.Scanner;
public class subtraction
{
    Scanner userInput = new Scanner(System.in);

    public void subtract()
    {
        System.out.println("Please enter the first number.");

        // Takes the user input as an integer
        long num1 = userInput.nextLong();

        System.out.println("Please enter the second number.");

        long num2 = userInput.nextLong();

        //Returns final result
        float subtractTotal = num1 - num2;
        System.out.println("The result of " + num1 + " - " + num2 + " is " + subtractTotal);
    }
}
