package Shop.Items.Potion;

public class Potion {
    private int hpPotion;
    private String namePotion;
    private int monyCost;

    public void potion(int hpPotion, String namePotion, int monyCost){
        this.hpPotion = hpPotion;
        this.namePotion = namePotion;
        this.monyCost = monyCost;
    }

    public int getHpPotion() {
        return hpPotion;
    }

    public void setHpPotion(int hpPotion) {
        this.hpPotion = hpPotion;
    }

    public String getNamePotion() {
        return namePotion;
    }

    public void setNamePotion(String namePotion) {
        this.namePotion = namePotion;
    }
    public int getmonyCost(){
        return  monyCost;
    }

    public void infoPotion(){
        System.out.println("_________________________________");
        System.out.println(namePotion);
        System.out.println("Востанавливает здоровья: "+ hpPotion);
        System.out.println("Стоимость: "+ this.monyCost);
        System.out.println("_________________________________");
    }
}
