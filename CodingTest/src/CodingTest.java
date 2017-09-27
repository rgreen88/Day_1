import java.util.Scanner;


public class CodingTest
{
    public static void main(String[] args)
    {
        /* Problem 1
        create a function to check if the number
        is divisible by 3 then print "fizz"
        is divisible by 5 then print "buzz"
        is divisible by 3 and 5 print "fizzbuzz"
        otherwise print the number itself
        */

        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter number: ");
        int num3 = input.nextInt();

        if (num3 % 3 == 0 && num3 % 5 == 0)
            System.out.println("fizzbuzz");
        else if (num3 % 5 == 0)
            System.out.println("buzz");
        else if (num3 % 3 == 0)
            System.out.println("fizz");
        else
            System.out.println(num3);


        /*
        Problem 2
        Create a function to find duplicate strings
        in a list of string and then print them
        */

        String[] aStringArray = new String[5];
        aStringArray[0] = "duplicate";
        aStringArray[1] = "duplicate";
        aStringArray[2] = "pig";
        aStringArray[3] = "Mona";
        aStringArray[4] = "Equal";
        
        String text = aStringArray[0];
           
        for(int n = 0; n < 4; n++)
        {
          	if(aStringArray[n] == text)
           		System.out.println(aStringArray[n] + " " + text);
          	
           /* for(int i = 0; i < 4; i++)
            {
                if (aStringArray[i] == aStringArray[i+1])
                    System.out.println(aStringArray[i] + " " + aStringArray[i + 1]);
        	}*/
           
            input.close();
        }
    }
}