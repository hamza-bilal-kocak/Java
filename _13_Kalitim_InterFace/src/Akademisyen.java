
public class Akademisyen implements ICalisan {
    private String adSoyad,bolum,gorevler;

    public Akademisyen(String adSoyad, String bolum, String gorevler) {
        this.adSoyad = adSoyad;
        this.bolum = bolum;
        this.gorevler = gorevler;
        this.giris();
    }
    @Override
    public boolean yemek  (int saat){
        System.out.println("yemek yendi!");
        return false;
    }
    @Override
    public void giris(){
        System.out.println("Giriş yapıldı");
    }
    @Override
    public void cikis(){
        System.out.println("çıkış yapıldı");
    }


    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGorevler() {
        return gorevler;
    }

    public void setGorevler(String gorevler) {
        this.gorevler = gorevler;
    }
}
