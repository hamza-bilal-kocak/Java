
public class Main {
    public static void main(String[] args) {
        Akademisyen ak1 = new Akademisyen("Yusuf Semih", "5452351232",
                "yusuf@gmail.com","Doktor","Acil Uzmani",
                "Anatomy");
        Ogretmen o1 = new Ogretmen("Hamza Bilal ","05458721332 ",
                "hamza.nusir@gmail.com ","Yaşlı Bilgisayar Mühendisi ",
                "Model yapmaya çalışmaya çalışmayı düşünmeyi istemek ",
                "Data,OOp,Dif ", "Modelist " );
        Memur m1 = new Memur("Ali Murtaza", "5452351232",
                "ali@gmail.com"," müh fakültesi", "10 saat");


        System.out.println(ak1.giris());
        System.out.println(o1.giris());
        //Polimorphism üst sınıf kullanarak alt sınıf objeleri üretilebilir.
        // Ve bunun Akademisyen c = new Akademisyen(); bir farkı yoktur.
        //Aşşağıda örnek verilmiştir
        Calisan c = new Akademisyen("Yusuf Semih", "5452351232",
                "yusuf@gmail.com","Doktor","Acil Uzmani",
                "Anatomy");

        // c.giris() = ak1.giris() aynıdır (Çok biçimlilik) eeeeee aynı ise bu tırşigi neden kullanıyoruz.???
        System.out.println(c.giris());
        //aşağıda açıklıyorum
        //Akademisyen[] girislistesi = {ak1,o1,m1}; ak1 ve o1 alt liste olduğu için sınıtı olmaz fakat
        // bu liste tanımlamada farklı sınıf olan m1 tanımlanamaz. O yüzden burda polimorfizimi kullanıyoruz.
        // Ayrıca tek seferde farklı sınıflardan farklı giris çıktıları alınabiliyor
        Calisan[] girislistesi = {ak1,o1,m1};
        System.out.println();
        // Tek bir çağırma ile yukarıda yaptığım bütün çıktıları çıkarabiliyoruz Output a bak ve anala :D
        Calisan.listele(girislistesi);

    }
}