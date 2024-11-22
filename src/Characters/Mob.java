package Characters;

public class Mob {
    private int helch;
    private int damage;
    private  String name;
    private boolean dead = true;
    private int mony;
    private int expiriens;
    private int rbCoin;

    public void mobSate(int helch, int damage,String name, int mony,int rbCoin, int expiriens){
        this.helch = helch;
        this.damage = damage;
        this.name = name;
        this.mony= mony;
        this.expiriens  = expiriens;
        this.rbCoin = rbCoin;
    }

    public int getHelch() {
        return helch;
    }

    public void setHelch(int helch) {
        this.helch = helch;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void infoMob(){
        System.out.println("_________________________________");
        System.out.println(this.name);
        System.out.println("Урон: " + this.damage);
        System.out.println("Здоровья: " + this.helch);
        System.out.println("Золото за убийство: " + this.mony);
        System.out.println("БоссКоин за убийство: " + this.rbCoin);
        System.out.println("Опыта за убийство: " + this.expiriens);
        System.out.println("_________________________________");

    }

    public int getMony(){
        return mony;
    }

    public int getExpiriens() {
        return expiriens;
    }
    public int getRbCoin(){
        return rbCoin;
    }
}
