// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Calisan c1 = new Calisan();
        Akademisyen a1 = new Akademisyen();
        Memurlar m1 = new Memurlar();
        c1.giris();
        a1.giris();
        m1.giris();
        //Static değer çağırma..
        System.out.println(Calisan.girissayisi);
        //Static metot çağırma
        System.out.println(Calisan.giris2());
        System.out.println(Memurlar.giris2());
        //Calisandaki Protected alt sınıf olarak eriştim fakat
        // yan sınıflar olarak erişlemem.
        m1.protected1();
        a1.protected1();
        c1.protected1();


    }
}