import java.util.Random;

public class Obstacle {
    private String oName;
    private int damage, health,award,maxNumber;


    public Obstacle(String oName, int damage, int health, int award, int maxNumber) {
        this.oName = oName;
        this.damage = damage;
        this.health = health;
        this.award = award;
        this.maxNumber = maxNumber;
    }
    public int Count(){
        Random rand = new Random();
        return rand.nextInt(maxNumber) + 1;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
}