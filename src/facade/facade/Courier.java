package facade.facade;

import decorator.components.IComponentBootsOfSpeed;
import decorator.concreteComponents.ComponentBootsOfSpeed;
import facade.basicItems.BasicItem;
import facade.ItemType;
import facade.UpgradedItem;
import facade.interfaces.IItem;
import factory.products.IHero;

public class Courier {

    public static String deliverItem(ItemType itemType, IHero hero) {

        BasicItem basicItem = new BasicItem();
        IComponentBootsOfSpeed bootsOfSpeed = new ComponentBootsOfSpeed();

        switch (itemType) {
            case ENERGYBOOSTER:
                int money = hero.getMoney();
                int buy = basicItem.costEnergyBoosterItem();
                if (money >= buy) {

                    hero.setMoney(money - buy);
                    IItem item = new UpgradedItem();
                    String upgradedItemContains = basicItem.getEnergyBoosterItem();
                    item.purchaseItem(upgradedItemContains);
                    System.out.println("Money: " + hero.getMoney());
                    return item.deliverItem();

                } else {
                    System.out.println("Not enough money to buy this item.");
                    return null;
                }


            case RECIPEBOOTSOFTRAVEL:

                int money2 = hero.getMoney();
                int buy2 = basicItem.costRecipeBootsOfTravel();
                if (money2 >= buy2) {

                    hero.setMoney(money2 - buy2);

                    IItem item2 = new UpgradedItem();
                    String upgradedItemContains2 = basicItem.getRecipeBootsOfTravel();
                    item2.purchaseItem(upgradedItemContains2);
                    System.out.println("Money: " + hero.getMoney());
                    return item2.deliverItem();

                } else {
                    System.out.println("Not enough money to buy this item.");
                    return null;
                }


            case BLADESOFATTACK:

                int money3 = hero.getMoney();
                int buy3 = basicItem.costBladesOfAttack();
                if (money3 >= buy3) {

                    hero.setMoney(money3 - buy3);

                    IItem item3 = new UpgradedItem();
                    String upgradedItemContains3 = basicItem.getBladesOfAttack();
                    item3.purchaseItem(upgradedItemContains3);
                    System.out.println("Money: " + hero.getMoney());
                    return item3.deliverItem();

                } else {
                    System.out.println("Not enough money to buy this item.");
                    return null;
                }

            case CHAINMAIL:

                int money4 = hero.getMoney();
                int buy4 = basicItem.costChainmail();
                if (money4 >= buy4) {

                    hero.setMoney(money4 - buy4);

                    IItem item4 = new UpgradedItem();
                    String upgradedItemContains4 = basicItem.getChainmail();
                    item4.purchaseItem(upgradedItemContains4);
                    System.out.println("Money: " + hero.getMoney());
                    return item4.deliverItem();

                } else {
                    System.out.println("Not enough money to buy this item.");
                    return null;
                }

            case BELTOFSTRENGTH:

                int money5 = hero.getMoney();
                int buy5 = basicItem.costBeltOfStrength();
                if (money5 >= buy5) {

                    hero.setMoney(money5 - buy5);

                    IItem item5 = new UpgradedItem();
                    String upgradedItemContains5 = basicItem.getBeltOfStrength();
                    item5.purchaseItem(upgradedItemContains5);
                    System.out.println("Money: " + hero.getMoney());
                    return item5.deliverItem();

                } else {
                    System.out.println("Not enough money to buy this item.");
                    return null;
                }

            case GLOVESOFHASTE:
                int money6 = hero.getMoney();
                int buy6 = basicItem.costGlovesOfHaste();
                if (money6 >= buy6) {

                    hero.setMoney(money6 - buy6);

                    IItem item6 = new UpgradedItem();
                    String upgradedItemContains6 = basicItem.getGlovesOfHaste();
                    item6.purchaseItem(upgradedItemContains6);
                    System.out.println("Money: " + hero.getMoney());
                    return item6.deliverItem();

                } else {
                    System.out.println("Not enough money to buy this item.");
                    return null;
                }

            case RINGOFREGEN:
                int money7 = hero.getMoney();
                int buy7 = basicItem.costRingOfRegen();
                if (money7 >= buy7) {

                    hero.setMoney(money7 - buy7);

                    IItem item7 = new UpgradedItem();
                    String upgradedItemContains7 = basicItem.getRingOfRegen();
                    item7.purchaseItem(upgradedItemContains7);
                    System.out.println("Money: " + hero.getMoney());
                    return item7.deliverItem();

                } else {
                    System.out.println("Not enough money to buy this item.");
                    return null;
                }

            case WINDLACE:
                int money8 = hero.getMoney();
                int buy8 = basicItem.costWindLace();
                if (money8 >= buy8) {

                    hero.setMoney(money8 - buy8);

                    IItem item8 = new UpgradedItem();
                    String upgradedItemContains8 = basicItem.getWindLace();
                    item8.purchaseItem(upgradedItemContains8);
                    System.out.println("Money: " + hero.getMoney());
                    return item8.deliverItem();

                } else {
                    System.out.println("Not enough money to buy this item.");
                    return null;
                }

            case ARCANEBOOTS:
                int money9 = hero.getMoney();
                int buy9 = basicItem.costEnergyBoosterItem() + bootsOfSpeed.cost();
                if (money9 >= buy9) {

                    hero.setMoney(money9 - buy9);

                    IItem item9 = new UpgradedItem();
                    String upgradedItemContains9 =
                            bootsOfSpeed.getNotification() + ", " + basicItem.getEnergyBoosterItem();
                    item9.purchaseItem(upgradedItemContains9);
                    System.out.println("Money: " + hero.getMoney());
                    return item9.deliverItem();

                } else {
                    System.out.println("Not enough money to buy this item.");
                    return null;
                }

            case BOOTSOFTRAVEL:
                int money10 = hero.getMoney();
                int buy10 = basicItem.costRecipeBootsOfTravel() + bootsOfSpeed.cost();
                if (money10 >= buy10) {

                    hero.setMoney(money10 - buy10);

                    IItem item10 = new UpgradedItem();
                    String upgradedItemContains10 =
                            bootsOfSpeed.getNotification() + ", " + basicItem.getRecipeBootsOfTravel();
                    item10.purchaseItem(upgradedItemContains10);
                    System.out.println("Money: " + hero.getMoney());
                    return  item10.deliverItem();


                } else {
                    System.out.println("Not enough money to buy this item.");
                    return null;
                }

            case PHASEBOOTS:
                int money11 = hero.getMoney();
                int buy11 = basicItem.costBladesOfAttack() + basicItem.costChainmail() + bootsOfSpeed.cost();
                if (money11 >= buy11) {

                    hero.setMoney(money11 - buy11);

                    IItem item11 = new UpgradedItem();
                    String upgradedItemContains11 =
                            bootsOfSpeed.getNotification() + ", "  + basicItem.getBladesOfAttack() + ", " + basicItem.getChainmail();
                    item11.purchaseItem(upgradedItemContains11);
                    System.out.println("Money: " + hero.getMoney());
                    return  item11.deliverItem();

                } else {
                    System.out.println("Not enough money to buy this item.");
                    return null;
                }

            case POWERTREADS:
                int money12 = hero.getMoney();
                int buy12 = basicItem.costBeltOfStrength() + basicItem.costGlovesOfHaste() + bootsOfSpeed.cost();
                if (money12 >= buy12) {

                    hero.setMoney(money12 - buy12);

                    IItem item12 = new UpgradedItem();
                    String upgradedItemContains12 =
                            bootsOfSpeed.getNotification() + ", " + basicItem.getBeltOfStrength() + ", " + basicItem.getGlovesOfHaste();
                    item12.purchaseItem(upgradedItemContains12);
                    System.out.println("Money: " + hero.getMoney());
                    return  item12.deliverItem();

                } else {
                    System.out.println("Not enough money to buy this item.");
                    return null;
                }

            case TRANQUILBOOTS:
                int money13 = hero.getMoney();
                int buy13 = basicItem.costRingOfRegen() + basicItem.costWindLace() + bootsOfSpeed.cost();
                if (money13 >= buy13) {

                    hero.setMoney(money13 - buy13);

                    IItem item13 = new UpgradedItem();
                    String upgradedItemContains13 =
                            bootsOfSpeed.getNotification() + ", " + basicItem.getRingOfRegen() + ", " + basicItem.getWindLace();
                    item13.purchaseItem(upgradedItemContains13);
                    System.out.println("Money: " + hero.getMoney());
                    return  item13.deliverItem();

                } else {
                    System.out.println("Not enough money to buy this item.");
                    return null;
                }

            case BOOTSOFSPEED:
                int money14 = hero.getMoney();
                if (money14 >= bootsOfSpeed.cost()) {
                    hero.setMoney(money14 - bootsOfSpeed.cost());
                    System.out.println("Money: " + hero.getMoney());
                    return bootsOfSpeed.getNotification();
                } else {
                    System.out.println("Not enough money to buy this item.");
                    return null;
                }



        }

        return "Item does not exist in directory.";
    }
}
