// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Yusuf", 2110213001, 100);
        System.out.println(s1.name + " " + s1.id + " " +Student.HowMuch());
        //Static olsada direkt class ismi ile classın instance değişkenlerine ulaşılamaz.
        //Student.counter; = yanlış  ,,,
        //Bu yüzden static bir metot oluşturup ordan classın instance değerlere ulaşmak mümkündür.
        //Student.Howmuch();
        Student s2 = new Student("Hamza", 2110213029, 90);
        System.out.println(s2.name + " " + s2.id + " " +Student.HowMuch());

        Student s3 = new Student("ALi", 2110213002, 95);
        //Static yapmadığın fonksiyonları dirtekt genel  class ismi ("Student") ile
        // çağıramazsın. Ürettiğin obje (s3) üzerinden çaırabilirsin..
        System.out.println(s3.name + " " + s3.id + " " +s3.Nekadar());
        int[] a = new int[3];
        a[0] =s1.point;
        a[1] =s2.point;
        a[2] =s3.point;
        //Kısadan direk sınıfın ortalamasına ulaşabiliyorum artık ve en önemlisi her
        // obje özel olmayan genel tüm objlerrin kullandığı değerlere static yapıp ulaşmak
        // gerekiyor. verilere
        System.out.println("Genel Ortalama : " + Student.CalculateOverallAvg(a));


    }
}