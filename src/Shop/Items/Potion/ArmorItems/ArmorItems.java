package Shop.Items.Potion.ArmorItems;

public class ArmorItems {
    private int hp;
    private int armor;
    private String nameItems;
    private int monyCost;
    private int rbCoinCost;

    public void itemsArmor(int hp, int armor,String nameArmor, int monyCost, int rbCoinCost){
        this.hp = hp;
        this.armor = armor;
        this.nameItems = nameArmor;
        this.monyCost = monyCost;
        this.rbCoinCost = rbCoinCost;
    }

    public void itemsInfo(){
        System.out.println("_________________________________");
        System.out.print(this.nameItems);
        System.out.print(" Защита "+ this.armor);
        System.out.print(" Здоровь "+ this.hp);
        System.out.print(" Стоимость: "+ this.monyCost);
        System.out.println(" БоссКоинов: "+ this.rbCoinCost);
        System.out.println("_________________________________");
    }

    public int getArmor() {
        return armor;
    }

    public int getHp() {
        return hp;
    }

    public int getMonyCost() {
        return monyCost;
    }
    public int getRbCoinCost(){
        return rbCoinCost;
    }
}
