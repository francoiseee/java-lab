import java.util.*;

class Overloading_Gurango{
	static Scanner input = new Scanner(System.in);

	public static void main (String[] args){
		System.out.println("Enter the Employees Data: ");
		System.out.print("Hours Worked: "); int hour = input.nextInt();
		System.out.print("Rate per Hour: "); double rate = input.nextDouble();
		System.out.print("Withholding Rate (%) : "); double withholding = input.nextDouble();
		System.out.println(" ");

		add(hour, rate, withholding);
		add(hour, rate);
		add(hour);
	}
	static void add(int hour, double rate, double withholding){
		double meow = hour*rate;
		double meower = meow*(withholding/100); 
		double meowest = meow - meower;
		System.out.println("Computation 1: The Net Pay of Employee : Php " + meowest);
	}
	static void add(int hour, double rate){
		double meow = hour*rate;
		double meower = meow*.15 ;
		double meowest = meow - meower;
	System.out.println("Computation 2: The Net Pay of Employee : Php " + meowest);
	}
		static void add(int hour){
		double meow = hour*585;
		double meower = meow*.15 ;
		double meowest = meow - meower;
	System.out.println("Computation 3: The Net Pay of Employee : Php " + meowest);
	}
}