import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Account a1 = new Account(500,"Hamza",1234);
        Scanner scan = new Scanner(System.in);

        System.out.println("Ne kadar para çekmek istersin?");
        int para = scan.nextInt();
        a1.withdraw(para);

    }

}