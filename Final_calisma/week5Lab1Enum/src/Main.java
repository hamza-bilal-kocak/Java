public class Main{
    public static void main(String[] args){
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Circle c3 = new Circle(15);
        Circle[] array = {c1,c2,c3};

        for(Circle iter : array ){
            System.out.println(iter.computeArea());
        }
    }
}

