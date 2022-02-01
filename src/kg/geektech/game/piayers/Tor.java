package kg.geektech.game.piayers;

public class Tor extends Hero {
    public Tor(int helth, int damage, String name) {
        super(helth, damage,
                SuperAbility.STAN, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (heroes[5].getHelth() < 50) {
            heroes[5].setHelth(heroes[5].getHelth() - 100);
        } else if (heroes[5].getHelth() > 50) {
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[5].getDamage() == 14) {
                    heroes[i].setHelth(heroes[i].getHelth() + 50);


                }

            }
            if (heroes[5].getDamage() == 14) {
                System.out.println("Tor give stan for Boss");
            }


        }
    }
}

