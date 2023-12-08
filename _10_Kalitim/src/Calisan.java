public class Calisan {
    private String AdSoyad,eposta;
    private int Telefon;
    //Sanırım static başına public demen şart değil.
    // Yine class objesi olarak çağılabiliyor Calisan.girissayisi()..
    static int girissayisi=0;

    public void giris(){
        System.out.println("Giriş yapildi!");
        girissayisi++;
    }
    public static int giris2(){
        return ++girissayisi;
    }

    //metotların başına private yazarsan alt sınıflardan
    // bile ulaşamazsın sadecee bu iki kod bloğu arasında erişilebilir.
    //Ama protected dersek yan ve üst sınıflardan ulaşılmaz ama alt
    // sınıflardan ulaşabiliriz. işte protected şimdi anlamlı olmaya başlıyor.
    //Örnek))
    protected void protected1(){
        System.out.println("protexted olduğum için alt sınıftan bana ulaştınız..");
    }
}
