public class Student {
    public String name ;
    public int id;
    public int point;
    private static int counter=0;

    Student(String name, int id, int point){
        this.id=id;
        this.name=name;
        this.point=point;
        Student.counter++;
    }

    public static  int HowMuch(){
        return Student.counter;
    }
    public int Nekadar(){
        return Student.counter;
    }

    public static double CalculateOverallAvg(int[] arr){
        int Sum=0;
        for(int i=0; i<counter; i++){
           Sum +=arr[i];
        }
        return Sum/counter;
    }
}
