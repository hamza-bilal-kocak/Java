public class Circle {
    final private double PI = 3.141519;
    private double r;
    Circle(double r) {
        this.r = r;
    }

    public double computeArea(){
        double area;
        area =PI*r*r;
        return area;
    }
}
