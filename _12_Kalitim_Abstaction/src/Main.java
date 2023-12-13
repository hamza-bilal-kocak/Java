
public class Main {
    public static void main(String[] args) {
        //Akademisyen gibi ara sınıfları abstact yaptığım için onlardan obje tanımlayamıyorum.
        /*Akademisyen ak1 = new Akademisyen("Yusuf Semih", "5452351232",
                "yusuf@gmail.com","Doktor","Acil Uzmani",
                "Anatomy");*/
        Ogretmen o1 = new Ogretmen("Hamza Bilal ","05458721332 ",
                "hamza.nusir@gmail.com ","Yaşlı Bilgisayar Mühendisi ",
                "Model yapmaya çalışmaya çalışmayı düşünmeyi istemek ",
                "Data,OOp,Dif ", "Modelist " );
        Memur m1 = new Memur("Ali Murtaza", "5452351232",
                "ali@gmail.com"," müh fakültesi", "10 saat");
        Asistan a1 = new Asistan("Hamza Bilal ","05458721332 ",
                "hamza.nusir@gmail.com ","Yaşlı Bilgisayar Mühendisi ",
                "Model yapmaya çalışmaya çalışmayı düşünmeyi istemek ",
                "Data,OOp,Dif ", "5.sınıf " );

        o1.dersGiris(10 );
        a1.dersGiris(10);
    }
}