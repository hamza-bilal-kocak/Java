import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name ,tmp= "";
        Scanner scan = new Scanner(System.in);
        for (int i=0;i<10;i++) {
            name = scan.next();

            for (int j = name.length() - 1; j >= 0; j--) {
                tmp += name.charAt(j);
            }
            if (tmp.equals(name)) {
                System.out.println("Polidrom");
            }
            else {
                System.out.println("Not");
            }
            tmp="";
        }
    }
}