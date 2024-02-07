public class Worker {
    private String name;
    private int salary;
    public static int counter=0;

    public Worker(String name, int salary){
        setSalary(salary);
        setName(name);
        counter++;
    }
    public String getName(){
        return this.name;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
}
