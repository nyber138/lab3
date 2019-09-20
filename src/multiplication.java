import java.util.Scanner;
public class multiplication
{
    Scanner userInput = new Scanner(System.in);

    public void multiply()
    {
        System.out.println("Please enter the first number.");

        // Takes the user input as an integer
        long num1 = userInput.nextLong();

        System.out.println("Please enter the second number.");

        long num2 = userInput.nextLong();

        //Returns final result
        float multiplyTotal = num1 * num2;
        System.out.println("The result of " + num1 + " * " + num2 + " is " + multiplyTotal);
    }
}
