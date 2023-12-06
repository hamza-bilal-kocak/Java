import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row;
        int column;
        Scanner scan = new Scanner(System.in);
        System.out.println("Mayın tarlasına hoş geldiniz !");
        System.out.println("İstediğiniz boyutları giriniz !");
        row = scan.nextInt();
        column = scan.nextInt();
        MayinTarlasi mayin = new MayinTarlasi(row,column);
        mayin.Run();
    }
}