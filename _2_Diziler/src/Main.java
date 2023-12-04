import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // VeriTipi diziAdi[] = new VeriTipi[elemanSayisi];
        // VeriTipi[] diziAdi = new VeriTipi[elemanSayisi];
        // VeriTipi[] diziAdi = {v1,v2,v3,v4};
        int[] liste = {1, 2, 3, 4};
        // çağirma şekli
        Scanner scan = new Scanner(System.in);
        IkiliArrays b = new IkiliArrays();
        MultiSolo a = new MultiSolo();
        System.out.println("Bir değer gir:");
        liste[0] = scan.nextInt();
        System.out.println(liste[0]);

        b.bastir();
        a.bastir();
    }
}
class IkiliArrays {
    int[][] tablo = new int[][]{
        {1, 1, 1},
        {2, 2, 2},
        {3, 3, 3},
        {11, 11, 11},
        {22, 22, 22},
        {33, 33, 33}
    };
    public IkiliArrays(){}
    public void bastir(){
     /* for(int i=0; i<tablo.length; i++){
            for(int j=0; j<tablo[0].length; j++) {
                System.out.print(" " + tablo[i][j]);
            }
            System.out.println()
    */
        //forech()
        for(int[] satir : tablo){
            for(int value : satir)
                System.out.print(" " + value);
            System.out.println();
        }
    }

}

class MultiSolo{
    private int[] solo={1,2,3,4,5,6,7,8,9,10};
    private final int[][] multi= new int[][]{{1, 1, 1},
            {2, 2, 2},
            {3, 3, 3},
            {4, 4, 4},
            {5, 5, 5},
            {0, 0, 0}
    };


    //Constructor
    public MultiSolo(){
        multi[2][2] = 13;

        /**Yine Chatgpt den harika cevap....Soru: neden multi arrayi private ve final olarak
         * atadığım halde this.. yapısını kullanmadan bile değer değiştirebiliyorum? **/
        /*Java'da private ve final anahtar kelimeleri, değişkenlerin erişim düzeyi ve değişkenlerin
        yeniden atanabilirliği üzerinde farklı kontroller sağlar.private anahtar kelimesi bir değişkenin
        sadece aynı sınıf içinde erişilebilir olduğunu belirtir. Yani, sadece aynı sınıf içerisinden erişilebilir
        ve bu sınıfın dışından doğrudan erişilemez.final anahtar kelimesi bir değişkenin bir kez başlatıldıktan
        sonra yeniden atanamayacağını belirtir. Yani,bir kez değer atandıktan sonra o değer değiştirilemez.Ancak,
        bu durum, final olarak işaretlenen bir referans değişkeninin içindeki verilerin değiştirilemeyeceği
        anlamına gelmez. Yani, eğer bir nesnenin referansı final olarak işaretlendiyse, o nesnenin içindeki
        veriler (dizi elemanları gibi) değiştirilebilir.Örneğin, sizin kodunuzda multi adındaki değişken final
        olarak işaretlendi, yani multi değişkeni başka bir diziye veya nesneye referans edemez, ancak bu dizi
        veya nesnenin içindeki elemanlar değiştirilebilir.Bu nedenle, multi dizisinin elemanları değiştirilebilir
        çünkü final olan sadece multi değişkeninin referansıdır,dizinin kendisi değil. Bu durum, multi değişkeninin
        başka bir diziye referans etmesini engeller, ancak bu dizinin elemanlarının değiştirilememesi anlamına gelmez.*/
    }
    Scanner scan = new Scanner(System.in);

    /**iki saattir foreach döngüsü ile eleman almaya çalışıyorum ama Chatgpt ye sordum ve mükemmel ceap verdi..**/
    /* Evet, foreach döngüsü Java'da sadece koleksiyonlar üzerinde dolaşmak için kullanılır. Koleksiyonlar, dizilerin
    * aksine dinamik boyuta sahiptir ve Java'da foreach döngüsü bu tür veri yapıları üzerinde çalışırken kullanılabilir.
    *  Kullanıcıdan doğrudan foreach döngüsüyle giriş almak mümkün değildir; çünkü foreach döngüsü, koleksiyonların
    * elemanlarını tek tek gezinmek için kullanılır ve bu durumda kullanıcıdan giriş almak için for döngüsü veya while
    *  döngüsü gibi farklı bir döngü yapısı kullanmanız gerekebilir.
    * Kullanıcıdan giriş almak için Scanner sınıfı gibi araçlar kullanarak for döngüsü ile giriş alma işlemini
    * gerçekleştirebilirsiniz. Ancak foreach döngüsü sadece koleksiyonların elemanları üzerinde dolaşmak için
    * kullanılabilir.*/
    void bastir() {

        for (int row : solo){
            System.out.println(" " + row);
        }
        for(int[] row : multi){
            for(int cloumb : row){
                System.out.print(" " + cloumb);
            }
            System.out.println();
        }
    }

}






