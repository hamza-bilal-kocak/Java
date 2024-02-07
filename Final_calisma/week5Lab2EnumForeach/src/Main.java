public class Main{
    public static void main(String[] args){
        Teacher t1 = new Teacher(Branch.MATH,1);
        Teacher t2 = new Teacher(Branch.PHYSICH,2);
        Teacher t3 = new Teacher(Branch.CS,3);
        Teacher t4 = new Teacher(Branch.ENG,4);

        Teacher[] array = {t1,t2,t3,t4};
        for(Teacher iter : array){
            System.out.println(iter.getID() + " Teacher -> " + iter.getBranch());
        }
    }
}