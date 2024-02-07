import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int value1;
        int [] list= new int[5];
        try {
            for(int i=0; i<5;i++) {
                System.out.println("Enter a value: ");
                value1 = scan.nextInt();
                list[i]=value1;
            }
            for(int j=0; j<10;j++){
                System.out.println(list[j] + " ");
            }
        }catch(Exception ex){
            System.err.print("Exception >" + ex.getMessage());
        }
    }
}