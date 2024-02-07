import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Worker w1 = new Worker("empty",0000);
        Worker w2 = new Worker("empty",0000);
        Worker w3 = new Worker("empty",0000);
        Scanner scanner = new Scanner(System.in);
        int salary;
        String name;
        int i=1;
        try{
            do {
                System.out.println("Enter your name: ");
                name = scanner.next();
                System.out.println("Enter a your salary: ");
                salary = scanner.nextInt();
                i++;
                if(salary<0){
                    throw new Exception("Salary cannot be less than zero...");
                }
                switch(i){
                    case 1:
                        w1.setName(name);
                        w1.setSalary(salary);
                        break;
                    case 2:
                        w2.setName(name);
                        w2.setSalary(salary);
                        break;
                    case 3:
                        w3.setName(name);
                        w3.setSalary(salary);
                        break;
                    default:
                        break;
                }
            }while(i<=3);
        }catch(Exception ex)
        {
            System.err.println(ex.getMessage());
        }
        System.out.println("Total number of worker -> " + Worker.counter);
    }
}