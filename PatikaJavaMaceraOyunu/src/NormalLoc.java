public class NormalLoc extends Location{
    public NormalLoc(Player player,String name) {
        super(player,name);
    }

    @Override
    boolean onLocation() {
        return false;
    }
}
