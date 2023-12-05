import java.util.Random;
import java.util.Scanner;

public class Oyun {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int Robsayi = rand.nextInt(20);
        int[] tahminler = new int[5];
        int tahmin,can=5,i=0;
        boolean hata = false;
        System.out.println("\nSayı tahmin oyununa hoş geldin minnak kardeş!\n**********" +
                "*********************\n" +
                "\n1-20 arasında sayı tahmin etemeni istiyorum...");

        while(can>0){
            System.out.println("\nTahmin alayım :) : ");
            tahmin = scan.nextInt();
            if(tahmin<0 || tahmin>20){
                if(hata){
                    System.out.println("Yanlış aralık malesef can : " + --can);
                    hata = false;
                }
                else {
                    System.out.println("Yanlış aralıkta 2 den fazla sayı girmeniz yine" +
                            "canınızı düşürecektir.Dikkat edin!!!  ");
                    hata = true;
                }
                continue;
            }
            tahminler[i++]=tahmin;
            if(tahmin!=Robsayi){
                System.out.println("Canınız " + --can + " kaldi");
                if(tahmin>Robsayi)
                    System.out.println("Aşşağı in");
                else
                    System.out.println("Yukarı çık");
            }

            else {
                System.out.println("Tebrikler! Doğru tahmin ettiniz!!!");
                break;
            }
            if (can == 0) {

                System.out.println("You are lose :[");
                System.out.println("Benim tuttuğum sayı : " + Robsayi);
                System.out.println("Tahmin ettiğiniz sayılar:");
                for(int gezgin:tahminler){
                    System.out.println(gezgin);
                }
                break;
            }

        }
    }
}