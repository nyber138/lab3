import java.util.Scanner;
public class division
{
    Scanner userInput = new Scanner(System.in);

    public void divide()
    {
        System.out.println("Please enter the first number.");

        // Takes the user input as an integer
        float num1 = userInput.nextLong();

        System.out.println("Please enter the second number.");

        float num2 = userInput.nextLong();

        //Returns final result
        float divideTotal = num1 / num2;
        System.out.println("The result of " + num1 + " / " + num2 + " is " + divideTotal);
    }
}
