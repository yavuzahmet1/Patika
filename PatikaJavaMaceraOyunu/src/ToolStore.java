public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Mağazaya");
    }
    @Override
    boolean onLocation() {
        System.out.println("------Mağazaya hoş gelsiniz.------");
        System.out.println("1-Silahlar");
        System.out.println("2-Zırhlar");
        System.out.println("3-Çıkış yap");
        System.out.print("Seçiminiz\t: ");
        int selectCase=input.nextInt();
        while (selectCase<1&&selectCase>3){
            System.out.println("Geçersiz bir değer girdiniz, tekrar giriniz\t: ");
            selectCase=input.nextInt();
        }
        switch (selectCase){
            case 1:
                printWeapon();
                break;
            case 2:
                printArmor();
                break;
            default:
                System.out.println("Bir daha bekleriz.");
                return true;
        }

        return true;
    }
    public void printWeapon(){
        System.out.println("------------Silahlar----------");
        for (Weapon w:Weapon.weapons()){
            System.out.println("ID\t: "+w.getId()+" Silah Adı\t:"+w.getName()+" Para\t: "+w.getPrice()+" Hasar\t: "+w.getDamage());
        }
        System.out.print("Bir silah seçiniz\t: ");
        int selectWeaponID=input.nextInt();
        while (selectWeaponID<1||selectWeaponID>Weapon.weapons().length){
            System.out.print("Geçersiz değer, tekrar giriniz\t: ");
            selectWeaponID=input.nextInt();
        }
        Weapon selectedWeapon=Weapon.getWeaponObjById(selectWeaponID);
        if (selectedWeapon!=null){
            if(selectedWeapon.getPrice()>this.getPlayer().getMoney()){
                System.out.println("Yeterli bakiyeniz bulunmamaktadır! ");
            }else {
                System.out.println(selectedWeapon.getName()+" silahı aldınız!");
                int balance=this.getPlayer().getMoney()-selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan bakiyeniz\t: "+this.getPlayer().getMoney());
            }
        }

    }
    public void printArmor(){
        System.out.println("Zırhlar");
    }
}
