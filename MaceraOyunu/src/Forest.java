public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(player, "Forest", new Vampir());
    }

    /* Bunu yazmaya gerek yok zaten bütün ölüm kalım olayları
    battle locationda gerçekleşeceği için metot ezmeye gerek yok
    @Override
    public boolean getLoc() {
        return false;
    }
     */
}
