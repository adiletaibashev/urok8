package kg.geektech.game.piayers;

public class Golem extends Hero {
    public Golem(int helth, int damage, String name) {
        super(helth, damage,
                SuperAbility.HITS_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (heroes[6].getHelth() < 50) {
            heroes[6].setHelth(heroes[5].getHelth() - 100);
        } else if (heroes[6].getHelth() > 100) {


            for (int i = 0; i < heroes.length; i++) {

                if (heroes[5].getDamage() == 14) {
                    heroes[i].setHelth(heroes[i].getHelth() + 0);

                } else if (heroes[5].getDamage() != 14) {
                    heroes[i].setHelth(heroes[i].getHelth() + 10);
                }

            }
            if (heroes[5].getDamage() != 14) {
                System.out.println("Golem returns damage 1/5 ");
            }


        }
    }
}
