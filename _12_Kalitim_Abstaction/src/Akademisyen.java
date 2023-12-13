//abstracct  olarak tnaımladığın sınıfı mainde çağıramazsın fakat o sınıfa absrtact
// metot tanımlarsın. ve alt sınıflarında bu metodu zorunlu bir şekilde Override yaparsın
public abstract class Akademisyen extends Calisan{
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


    public String giris( ){
        return "Akademisyen"  + super.giris();
    };
    // abstrac metot içi boşda olsa bunu diğer alt sınıflar override etmek zorundalar.
    public abstract void dersGiris(int dersSaati);
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

