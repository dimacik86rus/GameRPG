import Characters.Heroe;
import Characters.Mob;
import Images.ImagesWorld;
import InstallationInstalSetingsGme.InformationWorld;
import InstallationInstalSetingsGme.Time;
import Shop.Items.Potion.ArmorItems.ArmorItems;
import Shop.Items.Potion.Potion;
import Shop.Items.Potion.DamageItems.DamageItems;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        boolean start = true;

        Heroe heroes = new Heroe();
        Time time = new Time();
        Time timeSetting = new Time();
        InformationWorld informationWorld = new InformationWorld();

        //Текстуры
        ImagesWorld castle = new ImagesWorld();

        //Обьвление мобов
        Mob slizen = new Mob();
        Mob snail = new Mob();
        Mob leech = new Mob();
        Mob fallenWanderer = new Mob();
        Mob skileton = new Mob();
        Mob butcher = new Mob();


        //обьявление оружи
        DamageItems knife = new DamageItems();
        DamageItems axe = new DamageItems();
        DamageItems dubina = new DamageItems();
        DamageItems cep = new DamageItems();
        DamageItems bulava = new DamageItems();
        DamageItems bulavaFalc = new DamageItems();
        DamageItems chestoper = new DamageItems();
        DamageItems molot = new DamageItems();
        DamageItems catana = new DamageItems();
        DamageItems rapier = new DamageItems();
        DamageItems sekira = new DamageItems();

        //обьявление брони
        ArmorItems woodenBreastplate = new ArmorItems();
        ArmorItems akhiles = new ArmorItems();
        ArmorItems beovulf = new ArmorItems();
        ArmorItems aivaOdra = new ArmorItems();
        ArmorItems diodema = new ArmorItems();
        ArmorItems goldKalchuga = new ArmorItems();
        ArmorItems goldDospex = new ArmorItems();


        //Обьявление зелья
        Potion hpPotionLvl1 = new Potion();


        //Создание мобов Болото
        slizen.mobSate(100, 5, "Слизень", 47, 0, 230);
        snail.mobSate(150, 13, "Улитка", 59, 0, 270);
        leech.mobSate(470, 33, "Босс Пиявка", 118, 1, 500);

        //Создание мобов Кладбище
        fallenWanderer.mobSate(400, 56, "Падший Странник", 222, 0, 870);
        skileton.mobSate(720, 64, "Скилет послушник", 350, 0, 870);
        butcher.mobSate(1460, 101, "Босс Мясник", 567, 13, 1770);

        //Создание оружия
        knife.stateItems(25, "Нож", 150, 0);
        axe.stateItems(43, "Топор обычный", 370, 0);
        dubina.stateItems(50, "ДУбина", 490, 0);
        cep.stateItems(59, "Цепь", 580, 0);
        bulava.stateItems(66, "Булава", 790, 3);
        bulavaFalc.stateItems(74, "Булава с фальцем", 920, 5);
        chestoper.stateItems(82, "Шестопер", 1270, 3);


        //Создание брони
        woodenBreastplate.itemsArmor(250, 2, "Деревянный нагрудник", 150, 0);
        akhiles.itemsArmor(290,4,"Доспехи Ахилеса",330,0);
        beovulf.itemsArmor(370,7,"Доспехи Беовульфа",540,0);
        aivaOdra.itemsArmor(570,12,"Доспехи Эрвар-Оддра", 940,0);
        diodema.itemsArmor(790,17,"Доспехи Диодема", 1270, 5);
        goldKalchuga.itemsArmor(1640,25,"Золотая Кальчуга", 4380,24);
        goldDospex.itemsArmor(2340,37,"Золотые Доспехи", 8760,56);

        //Создание зелий
        hpPotionLvl1.potion(70, "Зелье здоровья LvL1", 65);


        System.out.println("Добро пожаловать в РПГ консоль");
        System.out.println("Назовите своего героя");
        System.out.println("Имя героя должно состоять не более 8 символов");
        String nameHeroes = scanner.nextLine();
        while (true) {
            if (nameHeroes.length() > 8) {
                System.out.println("Имя героя превышает количество символов");
                nameHeroes = scanner.nextLine();
            } else {
                System.out.println("Герой успешно создан");
                heroes.stateHeroes(17, nameHeroes);
                break;
            }

        }
        System.out.println("Выберите скорость игры");
        System.out.println("1)Быстрая (В игре герой по локациям ходит быстро)");
        System.out.println("2)Обычная (В игре герой ходит по локациям по времени)");
        int inputSpeedGame = scanner.nextInt();
        switch (inputSpeedGame){
            case 1:
                time.timeSetting(false);
                break;
            case 2:
                time.timeSetting(true);
                break;
        }


        while (start) {
            castle.castle();
            System.out.println("<------------------------Вы в Замке Рагнит------------------------>");
            System.out.println("<------------------------Центральная площадь---------------------->");
            heroes.infoHeroes();
            System.out.println("1)Выйти за стену с Южной стороны Рагнита  2)Пойти к Римусу(кузнец оружия) 3)Идти к Антонидосу(Лекарь) 4)Идти к Фалрику(Кузнес брони) 10)Информация о замке 0)выход из игры");
            int infoMeny = scanner.nextInt();
            switch (infoMeny) {
                case 0:
                    start = false;
                    break;
                case 10:
                    informationWorld.info();
                    break;
                case 1:
                    time.runLocation2();
                    System.out.println("<------------------------Южная сторона Рагнита------------------------>");
                    System.out.println("1)Болото 2)Кладибещ");
                    int inputLocation = scanner.nextInt();
                    switch (inputLocation) {
                        case 0:
                            System.out.println("Идем в замок");
                            time.runLocation4();
                        case 1:
                            time.runLocation4();
                            System.out.println("<------------------------Болото------------------------>");
                            System.out.println("1)Слизень 2)Улитка 3)Босс Пиявка 0)Вернутся в Рагнит(Замок) 10)Обитатели");

                            int inputatack = scanner.nextInt();
                            switch (inputatack) {
                                case 0:
                                    System.out.println("Идем в замок");
                                    time.runLocation4();
                                    break;
                                case 10:
                                    slizen.infoMob();
                                    snail.infoMob();
                                    leech.infoMob();
                                    break;
                                case 1:
                                    time.fightTime();
                                    slizen.infoMob();
                                    heroes.attack(slizen.getHelch(), slizen.getDamage(), slizen.getName(), slizen.getMony(), slizen.getExpiriens());
                                    break;
                                case 2:
                                    time.fightTime();
                                    snail.infoMob();
                                    heroes.attack(snail.getHelch(), snail.getDamage(), snail.getName(), snail.getMony(), snail.getExpiriens());
                                    break;
                                case 3:
                                    time.fightTime();
                                    leech.infoMob();
                                    heroes.attack(leech.getHelch(), leech.getDamage(), leech.getName(), leech.getMony(), leech.getExpiriens());
                                    heroes.setRbCoin(leech.getRbCoin());
                                    break;
                            }
                            break;

                        case 2:
                            time.runLocation7();
                            System.out.println("<------------------------Кладбище------------------------>");
                            System.out.println("1)Падший странник 2)Скилет послушник 3)Босс Мясник 0)Вернутся в Рагнит(Замок) 10)Обитатели");
                            int kladbishe = scanner.nextInt();
                            switch (kladbishe) {
                                case 0:
                                    time.runLocation7();
                                    break;
                                case 10:
                                    fallenWanderer.infoMob();
                                    skileton.infoMob();
                                    butcher.infoMob();
                                    break;
                                case 1:
                                    fallenWanderer.infoMob();
                                    heroes.attack(fallenWanderer.getHelch(), fallenWanderer.getDamage(), fallenWanderer.getName(), fallenWanderer.getMony(), fallenWanderer.getExpiriens());
                                    break;
                                case 2:
                                    skileton.infoMob();
                                    heroes.attack(skileton.getHelch(), skileton.getDamage(), skileton.getName(), skileton.getMony(), skileton.getExpiriens());
                                    break;
                                case 3:
                                    butcher.infoMob();
                                    heroes.attack(butcher.getHelch(), butcher.getDamage(), butcher.getName(), butcher.getMony(), butcher.getExpiriens());
                                    break;
                            }
                            break;
                    }
                    break;
                case 2:
                    time.runLocation2();
                    System.out.println("<------------------------Замок Рагнит ------------------------>");
                    System.out.println("<------------------------Лавка Римуса------------------------>");
                    System.out.println("1)Нож 2)Топор 3)Дубина 4)Цепь 5)Булава \n" +
                            "6)Булава с фальцем 7)Шестопер  0)Вернутся на площадь");
                    knife.itemsInfo();
                    axe.itemsInfo();
                    dubina.itemsInfo();
                    cep.itemsInfo();
                    bulava.itemsInfo();
                    bulavaFalc.itemsInfo();
                    chestoper.itemsInfo();


                    int inputItemsRimus = scanner.nextInt();
                    switch (inputItemsRimus) {
                        case 0:
                            time.runLocation2();
                            break;
                        case 1:
                            if (heroes.getMoney() >= knife.getMonyCost()) {
                                heroes.setDamage(knife.getDamage());
                                heroes.setMonyShop(knife.getMonyCost());
                                System.out.println("Куплен");
                                knife.itemsInfo();
                                heroes.setDamageItemsInventory("Нож");
                            } else {
                                System.out.println("У вас не достаточно денег");
                            }

                            break;
                        case 2:
                            if (heroes.getMoney() >= axe.getMonyCost()) {
                                heroes.setMonyShop(axe.getMonyCost());
                                heroes.setDamage(axe.getDamage());
                                System.out.println("Куплен");
                                axe.itemsInfo();
                                heroes.setDamageItemsInventory("Топор");
                            } else {
                                System.out.println("у вас недостаточно денег");
                            }
                            break;
                        case 3:
                            if (heroes.getMoney() >= dubina.getMonyCost()) {
                                heroes.setMonyShop(dubina.getMonyCost());
                                heroes.setDamage(dubina.getDamage());
                                dubina.itemsInfo();
                                heroes.setDamageItemsInventory("Дубина");
                            } else {
                                System.out.println("У вас не достаточно денег или БоссКоинов");
                            }
                            break;
                        case 4:
                            if (heroes.getMoney() >= cep.getMonyCost()) {
                                heroes.setMonyShop(cep.getMonyCost());
                                heroes.setDamage(cep.getDamage());
                                cep.itemsInfo();
                                heroes.setDamageItemsInventory("Цепь");
                            } else {
                                System.out.println("У вас не достаточно денег или БоссКоинов");

                            }
                            break;
                        case 5:
                            if (heroes.getMoney() >= bulava.getMonyCost() && heroes.getRbCoin() >= bulava.getRbCost()) {
                                heroes.setMonyShop(bulava.getMonyCost());
                                heroes.setRbCoindShop(bulava.getRbCost());
                                heroes.setDamage(bulava.getDamage());
                                bulava.itemsInfo();
                                heroes.setDamageItemsInventory("Булава");
                            } else {
                                System.out.println("У вас не достаточно денег");
                            }
                            break;
                        case 6:
                            if (heroes.getMoney() >= bulavaFalc.getMonyCost() && heroes.getRbCoin() >= bulava.getRbCost()) {
                                heroes.setMonyShop(bulavaFalc.getMonyCost());
                                heroes.setRbCoindShop(bulava.getRbCost());
                                heroes.setDamage(bulavaFalc.getDamage());
                                bulavaFalc.itemsInfo();
                                heroes.setDamageItemsInventory("Булава с Фальцем или Босскоинов");
                            } else {
                                System.out.println("Не достаточно денег");
                            }
                            break;
                        case 7:
                            if (heroes.getMoney() >= chestoper.getMonyCost() && heroes.getRbCoin() >= chestoper.getRbCost()) {
                                heroes.setMonyShop(chestoper.getMonyCost());
                                heroes.setRbCoindShop(chestoper.getRbCost());
                                heroes.setDamage(chestoper.getDamage());
                                chestoper.itemsInfo();
                                heroes.setDamageItemsInventory("Шестопер");
                            } else {
                                System.out.println("Недостаточно денег или Босскоинов");
                            }
                            break;
                    }

                    break;
                case 3:
                    time.runLocation2();
                    System.out.println("<------------------------Замок Рагнит ------------------------>");
                    System.out.println("<------------------------Жилище Антонидоса------------------------>");
                    System.out.println("1)Зелье 0)Идти на площадь");
                    hpPotionLvl1.infoPotion();
                    int inputItemsAntinidas = scanner.nextInt();
                    switch (inputItemsAntinidas) {
                        case 0:
                            time.runLocation2();
                            break;
                        case 1:
                            if (heroes.getMoney() >= hpPotionLvl1.getmonyCost()) {
                                heroes.setMonyShop(hpPotionLvl1.getmonyCost());
                                heroes.setHelch(hpPotionLvl1.getHpPotion());
                                if (heroes.getHelch() >= heroes.getMaxHeltch()) {
                                    heroes.setHelchPotion(heroes.getMaxHeltch());
                                    hpPotionLvl1.infoPotion();
                                    System.out.println("Использованно");
                                }


                            } else {
                                System.out.println("Недостаточно денег");
                            }
                            break;
                    }

                    break;
                case 4:
                    time.runLocation2();
                    System.out.println("<------------------------Замок Рагнит ------------------------>");
                    System.out.println("<------------------------Кузня Фалрика------------------------>");
                    System.out.println("1)Деревянный Нагрудник 2)Доспехи Ахилеса 3)Доспехи Беовульфа 4)Доспехи Эрвар-Оддра\n" +
                            "5)Доспехи Диодема 6)Золотая Кальчуга 7)Золотые доспехи 0)Идти на площадь");
                    woodenBreastplate.itemsInfo();
                    akhiles.itemsInfo();
                    beovulf.itemsInfo();
                    aivaOdra.itemsInfo();
                    goldKalchuga.itemsInfo();
                    goldDospex.itemsInfo();
                    int inputFalrik = scanner.nextInt();
                    switch (inputFalrik) {
                        case 0:
                            time.runLocation2();
                            break;
                        case 1:
                            if (heroes.getMoney() >= woodenBreastplate.getMonyCost()) {
                                heroes.setMonyShop(woodenBreastplate.getMonyCost());
                                heroes.setHelchMax(woodenBreastplate.getHp());
                                heroes.setHelch(woodenBreastplate.getHp());
                                heroes.setArmorBody(woodenBreastplate.getArmor());
                                heroes.setArmorBodyInventory("Деревянный Нагрудник");
                                woodenBreastplate.itemsInfo();

                            } else {
                                System.out.println("Недостаточно денег");
                            }

                            break;
                        case 2:
                            if (heroes.getMoney() >= akhiles.getMonyCost()){
                                heroes.setMonyShop(akhiles.getMonyCost());
                                heroes.setHelchMax(beovulf.getHp());
                                heroes.setHelch(akhiles.getHp());
                                heroes.setArmorBody(akhiles.getArmor());
                                heroes.setArmorBodyInventory("Доспехи Ахилеса");
                                akhiles.itemsInfo();
                            }
                            else {
                                System.out.println("Недостаточно денег");
                            }
                            break;
                        case 3:
                            if (heroes.getMoney()>= beovulf.getMonyCost()){
                                heroes.setMonyShop(beovulf.getMonyCost());
                                heroes.setHelchMax(beovulf.getHp());
                                heroes.setHelch(beovulf.getHp());
                                heroes.setArmorBody(beovulf.getArmor());
                                heroes.setArmorBodyInventory("Доспехи Беовульфа");
                                beovulf.itemsInfo();
                            }
                            else {
                                System.out.println("Недостаточно денег");
                            }
                            break;
                        case 4:
                                if (heroes.getMoney() >= aivaOdra.getMonyCost()){
                                    heroes.setMonyShop(aivaOdra.getMonyCost());
                                    heroes.setHelchMax(aivaOdra.getHp());
                                    heroes.setHelch(aivaOdra.getHp());
                                    heroes.setArmorBody(aivaOdra.getArmor());
                                    heroes.setArmorBodyInventory("Доспехи Эрвар-Оддра");
                                    aivaOdra.itemsInfo();
                                }
                                else {
                                    System.out.println("Недостаточно денег");
                                }
                            break;
                        case 5:
                            if (heroes.getMoney() >= diodema.getMonyCost()){
                                heroes.setMonyShop(diodema.getMonyCost());
                                heroes.setRbCoindShop(diodema.getRbCoinCost());
                                heroes.setHelchMax(diodema.getHp());
                                heroes.setHelch(diodema.getHp());
                                heroes.setArmorBody(diodema.getArmor());
                                heroes.setArmorBodyInventory("Доспехи Диодемы");
                            }
                            else {
                                System.out.println("Недостаточно денег или БоссКоинов");
                            }
                            break;
                        case 6:
                            if (heroes.getMoney() >= goldKalchuga.getMonyCost()){
                                heroes.setMonyShop(goldKalchuga.getMonyCost());
                                heroes.setRbCoindShop(goldKalchuga.getRbCoinCost());
                                heroes.setHelchMax(goldKalchuga.getHp());
                                heroes.setHelch(goldKalchuga.getHp());
                                heroes.setArmorBody(goldKalchuga.getArmor());
                                heroes.setArmorBodyInventory("Золотая кальчуга");
                            }
                            else {
                                System.out.println("Недостаточно денег или БоссКоинов");
                            }
                            break;
                        case 7:
                            if (heroes.getMoney() >= goldDospex.getMonyCost()){
                                heroes.setMonyShop(goldDospex.getMonyCost());
                                heroes.setRbCoindShop(goldDospex.getRbCoinCost());
                                heroes.setHelchMax(goldDospex.getHp());
                                heroes.setHelch(goldDospex.getHp());
                                heroes.setArmorBody(goldDospex.getArmor());
                                heroes.setArmorBodyInventory("Золотые доспехи");
                            }
                            else {
                                System.out.println("Недостаточно денег или БоссКоинов");
                            }
                            break;

                    }

                    break;


            }

            if (heroes.getHelch() <= 0) {
                System.out.println("Герой погиб");
                Thread.sleep(1000);
                System.out.println("Последний герой пал этому замку не устоять");
                Thread.sleep(500);
                System.out.println("Мы так и не узнаем кто замешан во всем этом.....");
                start = false;
            }

        }


    }


}









