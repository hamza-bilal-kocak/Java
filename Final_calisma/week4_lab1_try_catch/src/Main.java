import java.util.Scanner;
import java.util.InputMismatchException;
public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer value: ");
        try {
            int value = scanner.nextInt();
            if(value>10){
                //IllegalArgumentException da denebilir Exception yerine
                throw new Exception("Out of bond");
            }
        }catch(InputMismatchException ex){
            System.err.println("NOT A INTEGER..");
        }catch(Exception e){
            System.err.println(e.getMessage());
        }finally{
            System.out.println("Done");
        }
    }
}