// birinçi soru

public class Main {
    public static void main(String[] args) {



    }
}

abstract class Animal{
    String name;
}
interface ISwimmable{
    void swim();
}
interface IFlyable{
    void fly();
}
interface IMoveable{
    void move();
}
class Duck extends Animal implements IFlyable, IMoveable, ISwimmable{

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void move() {

    }
}

class Cat extends Animal implements ISwimmable{

    @Override
    public void swim() {

    }
}
class Eagle extends Animal implements IFlyable{

    @Override
    public void fly() {

    }
}