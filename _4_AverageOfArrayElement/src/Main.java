import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Array a1 = new Array("Note",2023);
    Array a2 = new Array(2023);
    Array a3 = new Array();

    a1.EnterNots();
    a1.setAvg(5);
    System.out.println(a1.getAvg());
    System.out.println(a1.toString(a1));
    a2.EnterNots();
    a2.setAvg(5);
    System.out.println(a2.getAvg());
    System.out.println(a2.toString(a2));
    a3.EnterNots();
    a3.setAvg(5);
    System.out.println(a3.getAvg());
    System.out.println(a3.toString(a3));
    }
}

class Array{
    private String name;
    private int year;
    int avg;
    int[] notlar = new int[5];
    public Array(){
        this.name = "Hayalet Okulu Notu";
        this.year= 1000;
    }
    public Array(int year){
        this.name = "Zaman Okulu Notu";
        this.year = year;
    }
    public Array(String Not, int year){
        this.year=year;
        this.name=Not;
    }
    Scanner scan = new Scanner(System.in);
    int i=0;
    public void EnterNots(){
        System.out.println("Enter a value : ");
        for(int i=0; i<5;i++){
            notlar[i]=scan.nextInt();
        }
    }

    public void setAvg(int Number){
        int Sum =0;
        for(int iter:notlar){
            Sum += iter;
        }
        this.avg = Sum/Number;
    }
    public int getAvg(){
        return this.avg;
    }

    public String toString(Array x){
        return "Not Name : " + this.name
                    + "\nYear : " + this.year + "\nAvg : "
                    + this.avg + "\nAvg : " + x.getAvg();
    }

}