public class Worker{

    public String name;
    public int socialSecurityNumber;
    public float wage;
    public int workingHours;


    void displayInfo(){
        System.out.println("Name: " + name + "\nSecurity Number: "+ socialSecurityNumber );
    }
    void displaySalary(){
        System.out.println("Salary: " + (wage*workingHours));
    }

}