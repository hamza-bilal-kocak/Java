//Abstracterlar constracteklar ve diğer metotlar yazılıp çağırılabiliyor.
// fakat interface de interface class sadece kalıp olrak oluşturulur.
public interface ICalisan {
    final String okul = "TSK";

    public void giris();
    public void cikis();
    public boolean yemek(int saat);
}
