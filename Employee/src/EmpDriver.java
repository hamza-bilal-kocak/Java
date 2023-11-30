
public class EmpDriver {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Hamza",1100, 30, 2021);
        Employee worker2 = new Employee("Yasir",900, 20, 2020);
        Employee worker3 = new Employee("Ahmet",1000, 10, 2019);

        worker1.toString(worker1);
        worker1.toString(worker2);
        worker1.toString(worker3);

    }
}