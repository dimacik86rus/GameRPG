package Shop.Items.Potion.DamageItems;

public class DamageItems {
    private int damage;
    private String nameItems;
    private int monyCost;
    private int rbCost;

    public void stateItems(int damage, String nameItems, int monyCost, int rbCost){
        this.damage = damage;
        this.nameItems = nameItems;
        this.monyCost = monyCost;
        this.rbCost = rbCost;

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getNameItems() {
        return nameItems;
    }
    public int getMonyCost(){
        return this.monyCost;
    }
    public int getRbCost(){
        return this.rbCost;
    }

    public void itemsInfo(){
        System.out.println("_________________________________");
        System.out.print(this.nameItems);
        System.out.print(" Урон: "+ this.damage);
        System.out.print(" Стоимость: "+ this.monyCost);
        System.out.println(" Требуется Босс коинов: "+ this.rbCost);
        System.out.println("_________________________________");
    }

}
