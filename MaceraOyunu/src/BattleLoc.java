
public abstract class BattleLoc extends Location {

    //protected dersek getter ve stter metotlarına gerek kalmaz.
    //Zaten dışardaki sınıflardan buna ulaşmıyacaz.
    protected Obstacle obstacle;
    public BattleLoc(Player player, String name,Obstacle obstacle){
        super(player);
        this.name=name;
        this.obstacle=obstacle;
        
    }
    
    public boolean getLoc(){
        int obsCount = obstacle.Count();
        System.out.println("Now you are in " + this.getName() + " and " + obsCount + " " + obstacle.getoName() +  " live in here." );
        System.out.println("<A>ttack or <R>un");
        String selCase = scan.next();
        selCase = selCase.toUpperCase();
        if(selCase.equals("A")){
            if(combat(obsCount)){
                System.out.println("You killed all" + this.getName());
                return true;
            }
            else{
                System.out.println("You are dead!");
                return false;
            }
        }
        return true;
    }

    public boolean combat (int obsCount){
        for(int i = 0; i<obsCount; i++){
            playerStats();
            enemyStats();
        }
        return  true;
    }

    public void playerStats(){
        System.out.println("--------------Features of Player--------------");
        System.out.println("Health: " + player.getHealthy());
        System.out.println("Damage: " + player.getTotalDamage());
        System.out.println("Money: " + player.getMoney());
        if (player.getInv().getDamage()>0){
            System.out.println("You have this wepon:" + player.getInv().getwName());
        }
        if (player.getInv().getArmor()>0){
            System.out.println("You have this armor: " + player.getInv().getaName());
        }
    }

    public void enemyStats(){
        System.out.println("--------------Features of" + obstacle.getoName() + "--------------");
        System.out.println("Health: " + obstacle.getHealth());
        System.out.println("Damage: " + obstacle.getDamage());
        System.out.println("Award: " + obstacle.getAward());
    }
     
    
    
}