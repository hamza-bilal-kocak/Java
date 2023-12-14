
public class SafeHouse extends NormalLoc{
    SafeHouse(Player player){
        super(player,"Safe House");
    }
    
    public boolean getLoc(){
        player.setHealthy(player.getrHealthy());
        System.out.println("Healthy is fulled!!!");
        return true;
    }
}