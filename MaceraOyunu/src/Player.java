import java.util.Scanner;

public class Player {
   private int damage,healthy,money;
   private String name,cName;
   private  Inventory inv;

   Scanner scanner = new Scanner(System.in);
    public Player(String name) {
        this.name = name;
    }

    public void selectCha(){
        System.out.println("Please select the character you want:");

        switch (chaMenu()){
            case 1:
                ccT("Samuray",5,21,15);
                break;
            case 2:
                ccT("Okcu",7,18,20);
                break;
            case 3:
                ccT("Sovalye",8,24,5);
                break;
            default:
                ccT("Okcu",7,18,20);
                break;
        }
        System.out.println("Character is being created...");
        System.out.println("\nKarakter: " + getcName() + "\nDamege: " + getDamage()
                + "\nHealty: " + getHealthy() + "\nMoney: " + getMoney());
    }
    public void ccT(String cN, int dmg, int hlty, int m){
        this.cName= cN;
        this.damage= dmg;
        this.healthy= hlty;
        this.money= m;
    }

    public int chaMenu(){
        System.out.println(" 1- Samuray:\n" + "Damage = 5\n" + "Healty = 21\n" + "Money = 15\n");
        System.out.println(" 2- Okcu:\n" + "Damage = 7\n" + "Healty = 18\n" + "Money = 20\n");
        System.out.println(" 3- Sovalye:\n" + "Damage = 8\n" + "Healty = 24\n" + "Money = 5\n");
        System.out.println("Your choice:");
        int chaId = scanner.nextInt();
        while(chaId<1 || chaId>3){
            System.out.println("Please try to choice between 1-3");
            chaId = scanner.nextInt();
        }
        return chaId;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }
}
