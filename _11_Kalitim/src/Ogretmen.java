public class Ogretmen extends Akademisyen {
    private String unvan;

    public Ogretmen(String adSoyad, String telefon,
                    String eposta, String bolum, String gorevi,
                    String dersler, String unvan) {
        super(adSoyad, telefon, eposta, bolum, gorevi, dersler);
        this.unvan = unvan;
    }

    public String giris(){
        return this.unvan + super.giris() ;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
}
