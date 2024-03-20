import java.util.*;
import java.text.*;
class intro{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        student coise = new student(); //create object
        student neriah = new student(); //another object
        cs venice = new cs();

        System.out.println("Enter Venice details");
        System.out.print("Enter student no: ");venice.setSNO(input.nextInt()); input.nextLine();
        System.out.print("Enter student name: ");venice.setSNAME(input.nextLine());
        System.out.print("Enter student address: ");venice.setADD(input.nextLine());
        System.out.print("Enter student year level: ");venice.setYL(input.nextInt());
        System.out.print("Enter student birthyear: ");venice.setBY(input.nextInt()); input.nextLine();
        System.out.print("Enter student course: ");venice.setC(input.nextLine()); 

        System.out.println("\n**********************");
        System.out.println("Student CS-Venice Details");
        venice.display();

/*         System.out.println("Enter neriah details");
        System.out.print("Enter student no: ");neriah.setSNO(input.nextInt()); input.nextLine();
        System.out.print("Enter student name: ");neriah.setSNAME(input.nextLine());
        System.out.print("Enter student address: ");neriah.setADD(input.nextLine());
        System.out.print("Enter student year level: ");neriah.setYL(input.nextInt());
        System.out.print("Enter student birthyear: ");neriah.setBY(input.nextInt()); */

/*         System.out.println("**********************");
        System.out.println("Student coise Details");
        coise.display(); */

/*         System.out.println("**********************");
        System.out.println("Student neriah Details");
        neriah.display(); */


    }
}