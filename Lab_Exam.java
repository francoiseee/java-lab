import java.util.*;

public class Lab_Exam{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		char continueP = ' ';

		do{
		System.out.println("Menu");
		System.out.print("[1]\tConverts Minutes to Hour and Minutes\n[2]\tComputes summer salary computation and expenses\n[3]\tExit\nEnter choice: ");
		int choice = input.nextInt();
			if (choice == 1){
				wan();
			}

			else if(choice == 2){
				tu();
			}

			else if (choice == 3){
				System.out.println("Thank you for using my program.");
				break; 
			}

			input.nextLine();
			System.out.print("Do you want to repeat again? Answer [Y]: ");
			continueP = input.next().charAt(0);
		}
		while(continueP == 'Y'||continueP == 'y');
	}

	public static void wan(){
		System.out.print("Enter the minutes worked: ");
		double enter = input.nextDouble();
		int hours = (int)enter/60;
		int mins = (int)enter%60;
		int secs = (int)(enter*60)%60; 

		System.out.println(enter + " minutes is equivalent to:\n" + hours + " hours, "+ mins + " minutes, and " + secs + " seconds.");
	}

	public static void tu(){
		System.out.print("Enter the number of hours worked per week: ");
		double num = input.nextDouble();

		double before = num*4*80;
		double tax_before = before*.15;
		double after = before - tax_before;
		double clothes = after *.10;
		double school = after *.02;
		double bonds = (after - (clothes + school)) * .25;
		double parents = bonds*0.5; 
		double remain = after - clothes - school - bonds - parents; 

		System.out.println("Results: ");
		System.out.println("Income before taxes: \tPhp\t" + before);
		System.out.println("Income after taxes: \tPhp\t" + after);
		System.out.println("Money spent on clothes and accessories: \tPhp\t" + clothes);
		System.out.println("Money spent on school supplies: \tPhp\t" + school);
		System.out.println("Money spent to buy saving bonds: \tPhp\t" + bonds);
		System.out.println("Money parents spend to buy additional saving bonds: \tPhp\t" + parents);
		System.out.println("Remaining money after saving and parent bonds: \tPhp\t" + remain);
	}
}