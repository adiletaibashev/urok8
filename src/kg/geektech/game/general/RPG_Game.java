package kg.geektech.game.general;

import kg.geektech.game.piayers.*;

import java.util.Random;

public class RPG_Game {
    public static Random random = new Random();
    public static void startGame() {
        Warrior warrior = new Warrior(290, 20, "Warrior");
        Medic medic1 = new Medic(250, 5, 20, "Medic1");
        Magic magic = new Magic(200, 15, "Megic");
        Berserk berserk = new Berserk(200, 10, "Berserk");
        Medic medic2 = new Medic(250, 10, 5, "Medic2");
        Tor tor = new Tor(250,10,"Tor");
        Golem golem = new Golem(280, 5,"Golem");
        Witcher witcher = new Witcher(350,0,"Witcher");



        Hero[] heroes = {warrior, medic1, magic, berserk, medic2,tor, golem,witcher};

        Boss boss = new Boss(3500, 50);


        printStatistics(boss, heroes);
        while (!isGameFinished(boss, heroes)) {
            round(boss, heroes);
        }

    }

    private static void round(Boss boss, Hero[] heroes) {
        bossHits(boss, heroes);
        heroesHit(boss, heroes);
        heroesApplyAbilities(boss, heroes );
        printStatistics(boss, heroes);
    }

    private static void bossHits(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHelth() > 0 && heroes[i].getHelth() > 0) {
                heroes[i].setHelth(heroes[i].getHelth() - boss.getDamage());

            }
        }
    }

    private static void heroesHit(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHelth() > 0 && boss.getHelth() > 0) {
                boss.setHelth(boss.getHelth() - heroes[i].getDamage());

            }
        }
    }
    private static void heroesApplyAbilities(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHelth() > 0 && boss.getHelth() > 0) {
                heroes[i].applySuperPower(boss, heroes);

            }
        }
    }

    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        boolean alHeroesDead = true;
        if (boss.getHelth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }

        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHelth() > 0) {
                alHeroesDead = false;
                break;
            }
        }
        if (alHeroesDead) {
            System.out.println("Boss won!!!");

        }
        return alHeroesDead;
    }

    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println("-----------------");
        System.out.println("Boss health: " + boss.getHelth() +
                " (" + boss.getDamage() + " )");

        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getName()
                    + " helth: " + heroes[i].getHelth()
                    + " [" + heroes[i].getDamage() + " ]");

        }
        System.out.println("-----------------");
    }


}
