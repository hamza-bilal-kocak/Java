
public class ToolStore extends NormalLoc {

    public ToolStore(Player player) {
        super(player,"Store");
    }

    public boolean getLoc(){
        //player.getMoney() = getPlayer().getMoney()
        System.out.println("Your Money : " + getPlayer().getMoney() );
        System.out.println("1- Wepons \n2- Armors\n3- Exit");
        System.out.print("Choice your tools: ");
        int selTool = scan.nextInt();
        while(selTool<1 || selTool>3){
            System.out.println("Please choice again!");
            selTool = scan.nextInt();
        }
        int selItemID;
        switch (selTool){
            case 1:
                selItemID = weponMenu();
                buyWepon(selItemID);
                break;
            case 2:
                selItemID = armorMenu();
                buyArmor(selItemID);
                break;
            case 3:
                break;
            default:
                System.out.println("Insufficient balance...");
        }
        return true;
    }

    public int armorMenu(){
        System.out.println("1- Dear Armor----> Damage Prevention = 1 ------> Money = 15");
        System.out.println("2- Wolf Armor----> Damage Prevention = 3 ------> Money = 25");
        System.out.println("3- Bear Armor----> Damage Prevention = 5 ------> Money = 40");
        System.out.println("4- Exit");
        System.out.print("Please select your Armor or leave:");
        int armorID = scan.nextInt();
        while(armorID<1 || armorID>4){
            System.out.println("Wrong Choice : Please select your Armor again!");
            armorID = scan.nextInt();
        }
        return armorID;
    }

    public int weponMenu(){
        System.out.println("1-Pistol----> Damage = 2 ------> Money = 25");
        System.out.println("2-Sword-----> Damage = 3 ------> Money = 35");
        System.out.println("3-Rifle-----> Damage = 7 ------> Money = 45");
        System.out.println("4-Exit");
        System.out.print("Please select your wepon or leave:");
        int weponID = scan.nextInt();
        while (weponID<1 || weponID>4){
            System.out.println("Wrong Choice : Please select your wepon again!");
            weponID = scan.nextInt();
        }
        return weponID ;
    }
    public void buyArmor(int itemID){
        String aName= null;
        int price=0,avoid=0;
        switch (itemID){
            case 1:
                avoid=1;
                aName="Dear Armor";
                price=15;
                break;
            case 2:
                avoid=3;
                aName="Wolf Armor";
                price=25;
                break;
            case 3:
                avoid=5;
                aName="Bear Armor";
                price=40;
                break;
            case 4:
                System.out.println("Exited");
                break;
            default:
                System.out.println("Invalid Transaction");
                break;
        }
        if (itemID != 4 ) {
            if (player.getMoney() > price) {
                player.getInv().setArmor(avoid);
                player.getInv().setaName(aName);
                player.setMoney(player.getMoney() - price);
                System.out.println(aName + "\nOld Damage Prevention : " + 0 + "\nNew Damage Prevention : " + player.getTotalArmor());
                System.out.println("Remaining Money : " + player.getMoney());
            }
            else{
                System.out.println("Insufficient balance...");
            }
        }

    }
    public void buyWepon(int itemID){
        String wName=null;
        int damage=0,price=0;
        switch (itemID){
            case 1:
                damage=2;
                wName="Pistol";
                price=25;
                break;
            case 2:
                damage=3;
                wName="Sword";
                price=35;
                break;
            case 3:
                damage=7;
                wName="Rifle";
                price=45;
                break;
            case 4:
                System.out.println("Exited");
                break;
            default:
                System.out.println("Invalid Transaction");
                break;
        }
        if (itemID != 4 ) {
            if (player.getMoney() > price) {
                player.getInv().setDamage(damage);
                player.getInv().setwName(wName);
                player.setMoney(player.getMoney() - price);
                System.out.println(wName + "\nOld damage : " + player.getDamage() + "\nNew damage : " + player.getTotalDamage());
                System.out.println("Remaining Money : " + player.getMoney());
            }
            else
                System.out.println("Insufficient balance...");
        }

    }

}