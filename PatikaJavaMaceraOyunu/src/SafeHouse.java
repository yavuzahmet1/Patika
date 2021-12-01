public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(player, "Güvenli ev");
    }
    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz");
        System.out.println("Canınız yenilendi");
        return true;
    }
}
