//İKİNÇİ SORU

public class StudentApp {
    public static void main(String[] args)
    {



    }
}
interface ArticleScoreBehavior{
    float articleScore();
}
interface ConferenceScoreBehaviour{
    float conferenceScore();
}
interface ProjectScoreBehaviour{
    float projectScore();
}


abstract class Student{
    private int id;
    private float mid;
    private float fin;
    public Student(int id , float mid , float fin)
    {
        this.id = id;
        this.mid = mid;
        this.fin = fin;
    }

    float computeTotalScore()
    {
        return 1;
    }
    float computeBaseScore()
    {
        return 1;
    }
}

class BachelorStudent extends Student implements ProjectScoreBehaviour{

    public BachelorStudent(int id, float mid, float fin) {
        super(id, mid, fin);
    }

    @Override
    float computeTotalScore() {
        return super.computeTotalScore();
    }
    @Override
    public float projectScore() {
        return 0;
    }
}

class MasterStudent extends Student implements ConferenceScoreBehaviour{

    protected int numberOfConf;
    public MasterStudent(int id, float mid, float fin , int numberOfConf) {
        super(id, mid, fin);
        this.numberOfConf = numberOfConf;
    }

    @Override
    public float conferenceScore() {
        return 0;
    }
}

class PhDStudent extends MasterStudent implements ArticleScoreBehavior{

    int numberOfArticles;
    public PhDStudent(int id, float mid, float fin, int conf , int numberOfArticles) {
        super(id, mid, fin, conf);
        this.numberOfArticles = numberOfArticles;
    }

    @Override
    float computeTotalScore() {
        return super.computeTotalScore();
    }

    @Override
    public float articleScore() {
        return 1;
    }
}