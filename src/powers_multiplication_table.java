import java.util.Scanner;//import scanner

public class powers_multiplication_table {//Main method stuff auto generated
	
	public static void main(String[] args) {

	int userInput;//variables
	int a;
    int b;
	char decision;

	Scanner scnr = new Scanner(System.in);//assigning scnr as user input

	System.out.println("Learn your squares and cubes!");//shows what code does

	do {

		System.out.println("Please enter a positive integer: ");//asks for number
		userInput = scnr.nextInt();//gets number

			if (userInput <= 0)//makes sure number is positive
			{
				System.out.println("The number you entered isn't positive");//tells number isn't positive
			}
			
			else//if number is positive this runs
			{
				  System.out.printf("%-15s%-4s%17s%n", "Number", "Squared", "Cubed");//naming for table
				  System.out.printf("%-15s%-4s%17s%n", "======", "=======", "=====");
				  
				  for(int i = 1; i <= userInput; i++)//for loop for getting numbers 1 to user entered
				  { 
					  System.out.printf("%-15s%-4s%20s%n", i, i * i, i * i * i);//calculations and print
				  }
			}

			System.out.println("Multipication Table:");//name for table

			for (a = 1; a <= userInput; ++a) //multiplication table, formatting does not play well with large numbers EX: 100
			{
		        for (b = 1; b <= userInput; ++b) //for loop incrementing from 1 to user number
		        {
		            System.out.printf("%4d", (a*b));//output
		        }

		        System.out.println();//outputting on new lines
		    }

				System.out.println("Would you like to conintue (Y/N)?");//asks to continue
				decision = scnr.next().charAt(0);//gets decision

					if (decision == 'Y' )//if Y repeat loop
					{
						continue;
					}

					else// if not Y end
					{
						System.out.println("Goodbye!");
						break;
					}		
		
		}while (true);//end loop

	scnr.close();//scanner close
	
	}
}