import java.util.*;

class GurangoLoop{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first whole number: ");
	int first = input.nextInt();
	System.out.print("Enter second whole number: ");
	int sec = input.nextInt();
	int val = 0;
	int sum = 0; 


	System.out.println("Choose the output you want to have:\n[1]\t Output all odd numbers between the first and second number\n[2]\t Output sum of all even numbers between the first and second number\n[3]\t Output all the numbers and their square between the first and second number");
	System.out.print("\nChoice: ");
	int choice = input.nextInt();

	if (choice == 1){
		System.out.println("All odd numbers between the first and second number");
		for (val = first; val <= sec; val++)
			if (val % 2 == -1 || val % 2 == 1)
				System.out.println(val);
	}
	
	else if (choice == 2){
		for(val = first; val <= sec; val++)
		{
			if (val % 2 ==0){
				sum +=val;
			}
		}
		System.out.println("Sum of all even numbers between the first and second number is " + sum );
	}

	else if (choice == 3){
		System.out.println("Number\t Square of Number");
	{
		for (val = first; val <= sec; val++)
			System.out.println(val + "\t" + val*val);
	}
	}
}
}
	

