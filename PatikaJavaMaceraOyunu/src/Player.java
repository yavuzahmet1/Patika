import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public void selectChar() {
        GameChar[] charList = {new Samurai(), new Knight(), new Archer(), new Test()};
        System.out.println("*************************************************");
        for (GameChar gameChar : charList) {
            System.out.println("ID\t: " + gameChar.getId() + "\tKarakter\t " + gameChar.getName() + "\t\tHasar\t: " + gameChar.getDamage() + "\tSağlık\t:" + gameChar.getHealth() + "\tPara\t:" + gameChar.getMoney());
        }
        System.out.println("************");
        System.out.print("Lütfen bir karakter giriniz ! : ");

        System.out.println();
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Knight());
                break;
            case 3:
                initPlayer(new Archer());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("Karakter\t: " + this.getCharName() + " Hasar\t: " + this.getDamage() + " Sağlık\t: " + this.getHealth() + " Para\t: " + this.getMoney());

    }

    public void selectLoc() {


    }

    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

}
