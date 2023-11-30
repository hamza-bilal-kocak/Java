public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;
    public Employee(String name, int salary, int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double taxMethod(){
        if(this.salary<1000){
            return 0.0;
        }
        else
            return 1000*0.3;
    }
    public double bonusMethod(){
        return this.workHours*30;
    }
    public double raiseSalary(){
        int year= 2023-this.hireYear;
        if(10>year){
            return this.salary*0.05;
        }
        else if(20>year){
            return this.salary*0.1;
        }
        else {
            return this.salary*0.15;
        }
    }
    public void toString(Employee worker){
         System.out.print("\n*********\n\n\nName = " + worker.name + "\nSalary = "
                + worker.salary + "\nWork Hours = " + worker.workHours
                + "\nHire Date = " + worker.hireYear + "\n\nTax = "
                 + worker.taxMethod() + "\nBonus = " + worker.bonusMethod()
                 + "\nRaise of Salary = " + worker.raiseSalary() );
    }

}
