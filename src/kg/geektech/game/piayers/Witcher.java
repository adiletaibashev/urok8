package kg.geektech.game.piayers;

public class Witcher extends Hero {
    public Witcher(int helth, int damage, String name) {
        super(helth, damage, SuperAbility.REVIVES_THE_HERO, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (heroes[7].getHelth() < 50) {
            heroes[7].setHelth(heroes[5].getHelth() - 100);
        } else if (heroes[7].getHelth() > 50) {
            if (heroes[3].getHelth() == 0) {
                heroes[3].setHelth(heroes[3].getHelth() + 20);
            }


        }
    }
}

