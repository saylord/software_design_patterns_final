import bridge.Line;
import decorator.components.IComponentBootsOfSpeed;
import decorator.concreteComponents.ComponentBootsOfSpeed;
import decorator.concreteDecorators.arcaneBoots.DecoratorEnergyBooster;
import decorator.concreteDecorators.bootsOfTravel.DecoratorRecipeBootsOfTravel;
import decorator.concreteDecorators.phaseBoots.DecoratorBladesOfAttack;
import decorator.concreteDecorators.phaseBoots.DecoratorChainmail;

import decorator.concreteDecorators.powerTreads.DecoratorBeltOfStrength;
import decorator.concreteDecorators.powerTreads.DecoratorGlovesOfHaste;
import decorator.concreteDecorators.tranquilBoots.DecoratorRingOfRegen;
import decorator.concreteDecorators.tranquilBoots.DecoratorWindLace;
import facade.ItemType;
import facade.facade.Courier;
import factory.creators.HeroFactory;
import factory.creators.heroes.DrowRangerFactory;
import factory.creators.heroes.InvokerFactory;
import factory.creators.heroes.LegionCommanderFactory;
import factory.products.IHero;
import factory.products.heroes.DrowRangerHero;
import factory.products.heroes.InvokerHero;
import factory.products.heroes.LegionCommanderHero;
import observer.observables.GameSystem;
import observer.observers.Dire;
import observer.observers.Radiant;
import strategy.bases.Hero;
import strategy.types.HeroDrowRanger;
import strategy.types.HeroInvoker;
import strategy.types.HeroLegionCommander;
import strategy.types.defaultHeroes.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {

    private Scanner sc = new Scanner(System.in);

    public void start() {

        // Creating the game
        GameSystem gameSystem = new GameSystem();

        Hero hero;
        HeroFactory hero2;
        IHero hero3;

        System.out.println("Welcome to Dota 2.");
        System.out.println("Random Draft.");
        System.out.println("You are Dire team.");
        System.out.println("You can choose one of the given 3 heroes:");
        System.out.println("1. Drow Ranger");
        System.out.println("2. Invoker");
        System.out.println("3. Legion Commander");
        System.out.println("0. Exit");
        System.out.println();

        System.out.println("Enter option (1-3): ");
        int option = sc.nextInt();
        if (option == 1) {

            hero = new HeroDrowRanger();
            hero2 = new DrowRangerFactory();
            hero3 = new DrowRangerHero();
            createHero(gameSystem, hero);

        } else if (option == 2) {

            hero = new HeroInvoker();
            createHero(gameSystem, hero);
            hero2 = new InvokerFactory();
            hero3 = new InvokerHero();

        } else if (option == 3) {

            hero = new HeroLegionCommander();
            createHero(gameSystem, hero);
            hero2 = new LegionCommanderFactory();
            hero3 = new LegionCommanderHero();

        } else {
            System.out.print("Error, please reload the game.");
            return;
        }

        createTeams(gameSystem);

        while(true) {

            System.out.println("What to do:");
            System.out.println("1. Show my information.");
            System.out.println("2. Select a line to go.");
            System.out.println("3. Buy items.");
            System.out.println("0. Exit");
            System.out.println();

            try {
                System.out.println("Enter option (1-3): ");
                int option2 = sc.nextInt();
                if (option2 == 1) {
                    getHeroInformation(hero, hero2, hero3);
                } else if (option2 == 2) {
                    selectLine(hero3);
                } else if (option2 == 3) {
                    buyItem(hero3);
                } else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Input must be integer!!!");
                System.out.println("Error, please reload the game.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error, please reload the game.");
                System.out.println(e.getMessage());
            }

        }

        //gameSystem.addDireNotification("Your top tower is under attack.");
        //gameSystem.removeDireNotification("Your top tower is under attack.");

    }

    private void createTeams(GameSystem gameSystem) {

        Hero heroLuna = new HeroLuna();
        Hero heroBristleback = new HeroBristleback();
        Hero heroDazzle = new HeroDazzle();
        Hero heroBountyHunter = new HeroBountyHunter();
        Hero heroTiny = new HeroTiny();

        Hero heroLich = new HeroLich();
        Hero heroOgreMagi = new HeroOgreMagi();
        Hero heroPhantomLancer = new HeroPhantomLancer();
        Hero heroArcWarden = new HeroArcWarden();

        // Creating commands: DIRE - 4 & RADIANT - 5
        Radiant radiant1 = new Radiant(heroLuna);
        Radiant radiant2 = new Radiant(heroBristleback);
        Radiant radiant3 = new Radiant(heroDazzle);
        Radiant radiant4 = new Radiant(heroBountyHunter);
        Radiant radiant5 = new Radiant(heroTiny);

        Dire dire1 = new Dire(heroLich);
        Dire dire2 = new Dire(heroOgreMagi);
        Dire dire3 = new Dire(heroPhantomLancer);
        Dire dire4 = new Dire(heroArcWarden);

        // Register them to the game
        gameSystem.registerRadiantHero(radiant1); gameSystem.registerDireHero(dire1);
        gameSystem.registerRadiantHero(radiant2); gameSystem.registerDireHero(dire2);
        gameSystem.registerRadiantHero(radiant3); gameSystem.registerDireHero(dire3);
        gameSystem.registerRadiantHero(radiant4); gameSystem.registerDireHero(dire4);
        gameSystem.registerRadiantHero(radiant5);

    }

    private void createHero(GameSystem gameSystem, Hero hero) {

        hero.display();
        System.out.println("Game starts.");
        // Creating hero: DIRE - 1
        Dire dire5 = new Dire(hero);
        // Register picked hero to the game
        gameSystem.registerDireHero(dire5);

    }

    private void getHeroInformation(Hero hero, HeroFactory heroFactory, IHero ihero) {

        System.out.println("=======================================");
        System.out.println("-----------HERO INFORMATION-----------");
        hero.response();
        hero.performAttribute();
        hero.performAttackType();
        hero.performComplexity();

        //IHero heroInformation = heroFactory.getHero();
        heroFactory.getHero();
        System.out.println("Money: " + ihero.getMoney());

        System.out.println("=======================================");

    }

    private void buyItem(IHero hero) {

        while(true) {

            System.out.println("What to do:");
            System.out.println("1. Buy an item with courier.");
            System.out.println("2. Buy an item without courier.");
            System.out.println("3. Back.");
            System.out.println();

            try {
                System.out.println("Enter option (1-3): ");
                int option3 = sc.nextInt();
                if (option3 == 1) {
                    System.out.println("What to buy:");
                    System.out.println("1. Arcane Boots.");
                    System.out.println("2. Boots of Travel.");
                    System.out.println("3. Phase Boots.");
                    System.out.println("4. Belt of Strength.");
                    System.out.println("5. Ring of Regen.");
                    System.out.println("6. Gloves of Haste.");
                    System.out.println("7. Back.");
                    System.out.println();

                    int option4 = sc.nextInt();
                    if (option4 == 1) {
                        System.out.println(Courier.deliverItem(ItemType.ARCANEBOOTS, hero));
                    } else if (option4 == 2) {
                        System.out.println(Courier.deliverItem(ItemType.BOOTSOFTRAVEL, hero));
                    } else if (option4 == 3) {
                        System.out.println(Courier.deliverItem(ItemType.PHASEBOOTS, hero));
                    } else if (option4 == 4) {
                        System.out.println(Courier.deliverItem(ItemType.BELTOFSTRENGTH, hero));
                    } else if (option4 == 5) {
                        System.out.println(Courier.deliverItem(ItemType.RINGOFREGEN, hero));
                    } else if (option4 == 6) {
                        System.out.println(Courier.deliverItem(ItemType.GLOVESOFHASTE, hero));
                    } else if (option4 == 7) {
                        break;
                    } else {
                        return;
                    }

                } else if (option3 == 2) {
                    System.out.println("What to buy:");
                    System.out.println("1. Arcane Boots.");
                    System.out.println("2. Boots of Travel.");
                    System.out.println("3. Phase Boots.");
                    System.out.println("4. Power Treads.");
                    System.out.println("5. Tranquil Boots.");
                    System.out.println("6. Boots of Speed.");
                    System.out.println("7. Back.");
                    System.out.println();

                    int option4 = sc.nextInt();
                    if (option4 == 1) {

                        IComponentBootsOfSpeed arcaneBoots = new DecoratorEnergyBooster(new ComponentBootsOfSpeed());
                        int money = hero.getMoney();
                        int buy = arcaneBoots.cost();
                        if (money >= buy) {
                            hero.setMoney(money - buy);
                            System.out.println("Name of a purchased item: Arcane Boots.");
                            System.out.println("Money: " + hero.getMoney());
                        } else {System.out.println("Not enough money to buy this item.");}

                    } else if (option4 == 2) {

                        IComponentBootsOfSpeed bootsOfTravel = new DecoratorRecipeBootsOfTravel(new ComponentBootsOfSpeed());
                        int money = hero.getMoney();
                        int buy = bootsOfTravel.cost();
                        if (money >= buy) {
                            hero.setMoney(money - buy);
                            System.out.println("Name of a purchased item: Boots of Travel.");
                            System.out.println("Money: " + hero.getMoney());
                        } else {System.out.println("Not enough money to buy this item.");}

                    } else if (option4 == 3) {

                        IComponentBootsOfSpeed phaseBoots = new DecoratorBladesOfAttack(new DecoratorChainmail(new ComponentBootsOfSpeed()));
                        int money = hero.getMoney();
                        int buy = phaseBoots.cost();
                        if (money >= buy) {
                            hero.setMoney(money - buy);
                            System.out.println("Name of a purchased item: Phase Boots.");
                            System.out.println("Money: " + hero.getMoney());
                        } else {System.out.println("Not enough money to buy this item.");}

                    } else if (option4 == 4) {

                        IComponentBootsOfSpeed powerTreads = new DecoratorBeltOfStrength(new DecoratorGlovesOfHaste(new ComponentBootsOfSpeed()));
                        int money = hero.getMoney();
                        int buy = powerTreads.cost();
                        if (money >= buy) {
                            hero.setMoney(money - buy);
                            System.out.println("Name of a purchased item: Power Treads.");
                            System.out.println("Money: " + hero.getMoney());
                        } else {System.out.println("Not enough money to buy this item.");}

                    } else if (option4 == 5) {

                        IComponentBootsOfSpeed tranquilBoots = new DecoratorRingOfRegen(new DecoratorWindLace(new ComponentBootsOfSpeed()));
                        int money = hero.getMoney();
                        int buy = tranquilBoots.cost();
                        if (money >= buy) {
                            hero.setMoney(money - buy);
                            System.out.println("Name of a purchased item: Tranquil Boots.");
                            System.out.println("Money: " + hero.getMoney());
                        } else {System.out.println("Not enough money to buy this item.");}

                    } else if (option4 == 6) {
                        IComponentBootsOfSpeed bootsOfSpeed = new ComponentBootsOfSpeed();
                        int money = hero.getMoney();
                        int buy = bootsOfSpeed.cost();
                        if (money >= buy) {
                            hero.setMoney(money - buy);
                            System.out.println("Name of a purchased item: Boots of Speed.");
                            System.out.println("Money: " + hero.getMoney());
                        } else {System.out.println("Not enough money to buy this item.");}

                    } else if (option4 == 7) {
                        break;
                    } else {

                        return;
                    }

                } else if (option3 == 3) {
                    break;
                } else {
                    return;
                }

            } catch (InputMismatchException e) {
                System.out.println("Input must be integer!!!");
                System.out.println("Error, please reload the game.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error, please reload the game.");
                System.out.println(e.getMessage());
            }

        }
    }

    private void selectLine(IHero hero) {

            System.out.println("Where to go:");
            System.out.println("1. Top.");
            System.out.println("2. Mid.");
            System.out.println("3. Bottom.");
            System.out.println("4. Home.");
            System.out.println("0. Exit");
            System.out.println();

            Line line = new Line();

            System.out.println("Enter option (1-4): ");
                int option = sc.nextInt();
                if (option == 1) {
                    hero.setLine(line);
                    hero.goTop();
                } else if (option == 2) {
                    hero.setLine(line);
                    hero.goMid();
                } else if (option == 3) {
                    hero.setLine(line);
                    hero.goBottom();
                } else if (option == 4) {
                    hero.setLine(line);
                    hero.goHome();
                } else {
                    System.out.println("Error");
                }

    }

}
