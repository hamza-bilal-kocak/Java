import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Worker w1 = new Worker();
        Worker w2 = new Worker();
        Scanner scan = new Scanner(System.in);
        w1.name = "hfhgf";
        w1.socialSecurityNumber = 23423;
        w1.wage = 1312;
        w1.workingHours=3453;

        System.out.print("Enter your name: ");
        w2.name= scan.next();
        System.out.print("Enter your social number: ");
        w2.socialSecurityNumber = scan.nextInt();
        System.out.print("Enter you wage:");
        w2.wage=scan.nextFloat();
        System.out.print("Enter your working hours: ");
        w2.workingHours = scan.nextInt();

        w2.displayInfo();
        w2.displaySalary();

    }

}