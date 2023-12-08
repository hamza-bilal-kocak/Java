public class Akademisyen extends Calisan{
    private String bolum, gorevi, dersler;

    public Akademisyen(String adSoyad, String telefon,
                       String eposta, String bolum,
                       String gorevi, String dersler) {
        //Super anahtar kelimesi
        super(adSoyad, telefon, eposta);
        this.bolum = bolum;
        this.gorevi = gorevi;
        this.dersler = dersler;
    }
    //Metot Overriding Metot Ezme : giris burda üst sınıf
    // Calisan ile aynı metot oluşturulup onu ses geçiyor ve buna metot ezme deniyor.
    public String giris(){
        return super.giris() + " Akademisyen kapısından";
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    public String getDersler() {
        return dersler;
    }

    public void setDersler(String dersler) {
        this.dersler = dersler;
    }
}

