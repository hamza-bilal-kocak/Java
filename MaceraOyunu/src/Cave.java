public class Cave extends BattleLoc{
    public Cave(Player player) {
        super(player, "Cave", new Zombie());
    }

    /* Bunu yazmaya gerek yok zaten bütün ölüm kalım olayları
    battle locationda gerçekleşeceği için metot ezmeye gerek yok
    @Override
    public boolean getLoc() {
        return false;
    }
     */
}
