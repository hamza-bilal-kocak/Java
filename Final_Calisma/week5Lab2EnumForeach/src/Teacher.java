public class Teacher {
    private int ID;
    public Branch branch;

    public Teacher(Branch branch, int ID){
        this.branch=branch;
        this.ID=ID;
    }
    public Branch getBranch(){
        return this.branch;
    }
    public int getID(){
        return this.ID;
    }
}
