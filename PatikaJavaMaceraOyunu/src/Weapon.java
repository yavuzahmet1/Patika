public class Weapon {
    private int id;
    private int damage;
    private int price;
    private String name;

    public Weapon(int id, int damage, int price, String name) {
        this.id = id;
        this.damage = damage;
        this.price = price;
        this.name = name;
    }

    public static Weapon[] weapons(){
        Weapon[] weaponList=new Weapon[4];
        weaponList[0]=new Weapon(1,2,23,"Tabanca");
        weaponList[1]=new Weapon(2,3,35,"Kılıç");
        weaponList[2]=new Weapon(3,7,45,"Tabanca");
        weaponList[3]=new Weapon(4,1,10,"Bıçak");
        return weaponList;
    }
    public static Weapon getWeaponObjById(int id){

        for (Weapon w:Weapon.weapons()){
            if (w.getId()==id){
                return w;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
