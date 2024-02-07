import java.util.Scanner;
public class Account{
    private double balance;
    private String ownerName;
    private int money;
    private int password;

    Scanner scan = new Scanner(System.in);
    public Account(double balance,String ownerName,int password){
        this.balance=balance;
        this.ownerName=ownerName;
        this.password=password;

    }

    public void add(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount) {
        System.out.println("Please enter 4-digit pass: ");
        int pass=0;
        int i=0;
        while(i!=3) {
            pass = scan.nextInt();
            if (pass == password) {
                System.out.println("Welcome");
                if (amount <= balance) {
                    System.out.println("You have in bank: " + (balance - amount));
                    double result= balance - amount;
                    setBalance(result);
                }
                else
                    System.out.println("You dont have this money...");
                break;
            }
            else{
                i++;
                System.out.println("TRY AGAİN PLS...last: " + (3-i));
            }
        }
        if (i==3){
            System.out.println("Your account has been blocked. pls get out my way...");
        }
    }

    public void setOwnerName(String name){
        this.ownerName=name;
    }
    public String getOwnerName(){
        return ownerName;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }


}