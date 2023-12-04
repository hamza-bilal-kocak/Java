
public class Main {
    public static void main(String[] args) {
        char[] str = {'K','O','C','A','K'};
        String metin = new String(str);
        System.out.println(metin);


        String a = "Canım patates cekti";
        System.out.println(a);
        System.out.println(a.indexOf('p'));
        System.out.println(a.charAt(6));
        System.out.println(a.contains("ita"));
        System.out.println(a.endsWith("dtan"));
        System.out.println(a.replace("t","f"));
    }
}