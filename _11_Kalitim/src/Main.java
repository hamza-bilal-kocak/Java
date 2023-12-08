
public class Main {
    public static void main(String[] args) {
        Akademisyen ak1 = new Akademisyen("Yusuf Semih", "5452351232",
                "yusuf@gmail.com","Doktor","Acil Uzmani",
                "Anatomy");
        Ogretmen o1 = new Ogretmen("Hamza Bilal ","05458721332 ",
                "hamza.nusir@gmail.com ","Yaşlı Bilgisayar Mühendisi ",
                "Model yapmaya çalışmaya çalışmayı düşünmeyi istemek ",
                "Data,OOp,Dif ", "Modelist " );


        System.out.println(ak1.giris());
        System.out.println(o1.giris());
        //Polimorphism üst sınıf kullanarak alt sınıf objeleri üretilebilir.
        // Ve bunun Akademisyen c = new Akademisyen(); bir farkı yoktur.
        //Aşşağıda örnek verilmiştir
        Calisan c = new Akademisyen("Yusuf Semih", "5452351232",
                "yusuf@gmail.com","Doktor","Acil Uzmani",
                "Anatomy");
        System.out.println(c.giris());

    }
}