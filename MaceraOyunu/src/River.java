public class River extends BattleLoc{

    public River(Player player){
        super(player,"River",new Bear());
    }
    /* Bunu yazmaya gerek yok zaten bütün ölüm kalım olayları
    battle locationda gerçekleşeceği için metot ezmeye gerek yok
    @Override
    public boolean getLoc() {
        return false;
    }
     */
}
