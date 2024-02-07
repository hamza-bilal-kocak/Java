// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        //Cat cat = new Animal(); ?? compiler
        Animal a = new Cat();
        //a.meow(); ?? compiler time error
        ((Cat)a).meow();
        Object o = new Animal();
        //o.eat(); ?? compiler time error
        //o.meow(); ?? same
        ((Animal)o).eat();
        //((Animal)o).meow(); ?? compile time error
        //((Cat)o).eat(); // ?????Run time error
    }
}