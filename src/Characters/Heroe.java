package Characters;

import java.util.TreeSet;

public class Heroe {
    private String nameHeroes;
    private int helch = 100;
    private int maxHeltch = 100;
    private int expiriensHeroe = 0;
    private int lvl = 1;
    private int lvlUp = 500;
    private int damage;
    private int money = 0;
    private int rbCoin = 0;
    private int armorBody;
    private int armorLegs;
    private int allArmor;

    private TreeSet<String> damageItemsInventory = new TreeSet<>();
    private TreeSet<String> armorBodyInventory = new TreeSet<>();
    private TreeSet<String> armotLegsInventory = new TreeSet<>();


    public void setDamageItemsInventory(String weapons) {
        damageItemsInventory.clear();
        damageItemsInventory.add(weapons);
    }

    public void setArmorBodyInventory(String weapons) {
        armorBodyInventory.clear();
        armorBodyInventory.add(weapons);
    }

    public void stateHeroes(int damage, String nameHeroes) {
        this.damage = damage;
        this.nameHeroes = nameHeroes;
    }

    public int getHelch() {
        return helch;
    }

    public void setHelch(int helch) {
        this.helch += helch;
    }

    public void setHelchPotion(int potionHp) {
        this.helch = potionHp;
    }

    public void setHelchMax(int hpMax) {
        this.maxHeltch += hpMax;
    }

    public int getMaxHeltch() {
        return this.maxHeltch;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public void attack(int mobHp, int mobDamage, String name, int money, int expiriensMobe) throws InterruptedException {
        boolean start = true;
        System.out.println("Здоровье " + name + " " + mobHp);
        System.out.println("Здоровье героя " + this.helch);
        while (start) {
            mobHp -= this.damage;
            System.out.println("Здоровье " + name + " " + mobHp);
            if (mobHp <= 0) {
                this.money += money;
                this.expiriensHeroe += expiriensMobe;
                System.out.println("Моб умер");
                start = false;


            }
            this.helch -= (mobDamage - allArmor);
            System.out.println("Здоровье героя " + this.helch);
            if (this.helch <= 0) {
                start = false;
            }
            Thread.sleep(300);
        }
        if (expiriensHeroe >= lvlUp) {
            expiriensHeroe = 0;
            lvlUp *= 2;
            lvl++;
        }
    }

    public void infoHeroes() {
        System.out.println("\n" +
                "          ¶¶¶              <-----      " + this.nameHeroes + "      ----->\n" +
                "         ¶¶¶¶¶             <-----      Атака героя: " + this.damage + "      -----> \n" +
                "        ¶¶¶¶¶¶¶            <-----      Здоровье героя: " + this.helch + "/" + this.maxHeltch + "      -----> \n" +
                "         ¶¶¶¶¶             <-----      Золото: " + money + "  БоссКоин: " + rbCoin + "      ----->\n" +
                "          ¶¶¶              <-----      Опыт: " + expiriensHeroe + "/" + lvlUp + "      ----->\n" +
                "        ¶¶¶¶¶¶¶            <-----      Уровень игрока: " + lvl + "----->\n" +
                "       ¶¶¶¶¶¶¶¶¶      \n" +
                "      ¶¶¶¶¶¶¶¶¶¶¶          <-----      Руки: " + damageItemsInventory + "\n" +
                "     ¶¶ ¶¶¶¶¶¶¶ ¶¶         <-----      Тело: " + armorBodyInventory + "\n" +
                "     ¶¶ ¶¶¶¶¶¶¶ ¶¶     \n" +
                "     ¶¶  ¶¶¶¶¶  ¶¶         <-----      Защита игрока:" + allArmor + " ----->\n" +
                "         ¶¶ ¶¶         \n" +
                "         ¶¶ ¶¶         \n" +
                "         ¶¶ ¶¶              <-----     Ноги: " + armotLegsInventory + "\n");

    }

    public int getMoney() {
        return money;
    }

    public int setMonyShop(int money) {
        return this.money -= money;
    }
    public int getRbCoin(){
        return this.rbCoin;
    }
    public void setRbCoindShop(int rbCoindShop){
        this.rbCoin -= rbCoindShop;
    }

    public void setRbCoin(int rbCoin) {
        this.rbCoin += rbCoin;
    }

    public int getArmorBody() {
        return armorBody;
    }

    public void setArmorBody(int armorBody) {
        this.armorBody = armorBody;
        this.allArmor += armorBody;
    }

    public int getArmorLegs() {
        return armorLegs;
    }

    public void setArmorLegs(int armorLegs) {
        this.armorLegs = armorLegs;
    }

}
