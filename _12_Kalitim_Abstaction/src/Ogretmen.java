public class Ogretmen extends Akademisyen {
    private String unvan;

    public Ogretmen(String adSoyad, String telefon,
                    String eposta, String bolum, String gorevi,
                    String dersler, String unvan) {
        super(adSoyad, telefon, eposta, bolum, gorevi, dersler);
        this.unvan = unvan;
    }

    @Override
    public String giris(){
        return this.unvan + super.giris() ;
    }
    @Override
    public void dersGiris(int dersSaati){
        System.out.println(getUnvan() + getAdSoyad() + "saat "+ dersSaati + " " + getDersler() + "Dersine Asistan olararak girdi");
    }


    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
}
