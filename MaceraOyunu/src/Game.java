import java.util.Scanner;

public class Game {
    public Player player;
    public Location location;

    Scanner scanner = new Scanner(System.in);
    public void login(){
        System.out.println("Welcome To The Advanture Game");
        System.out.println("Plese enter your name before the game start:");
        String playerName = scanner.nextLine();
        player = new Player(playerName);
        player.selectCha();
        start();
    }
    public void start(){
        while(true){
            
            System.out.println();
            System.out.println("=======================================");
            System.out.println();
            System.out.println("Select a Safe Areas or Survival Zone...");
            System.out.println("1-Safe House ----> Your life points will be filled");
            System.out.println("2-Cave ----------> Zombies Area");
            System.out.println("3-Dark Forest ---> Vampires Area");
            System.out.println("4-River ---------> Bears Area");
            System.out.println("5-Store ---------> You can buy Armor and Weapons");
            System.out.println("Where you want to go?");
            System.out.print("->");
            int selloc = scanner.nextInt();
            while(selloc<1 || selloc>5){
                System.out.println("Please sellect correct Location");
                selloc = scanner.nextInt();
            }
            switch(selloc){
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 3:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new ToolStore(player);
                    break;
            }
            if(!location.getLoc()){
                    System.out.println("Oyun bitti!!!");
                    break;
            }
            
        }
    }
    

}
