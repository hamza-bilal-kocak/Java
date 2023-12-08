public class Asistan extends Akademisyen{
    private String yuksekLisans;

    public Asistan(String adSoyad, String telefon,
                   String eposta, String bolum, String gorevi,
                   String dersler, String yuksekLisans) {
        super(adSoyad, telefon, eposta, bolum, gorevi, dersler);
        this.yuksekLisans = yuksekLisans;
    }


    public String getYuksekLisans() {
        return yuksekLisans;
    }

    public void setYuksekLisans(String yuksekLisans) {
        this.yuksekLisans = yuksekLisans;
    }
}
