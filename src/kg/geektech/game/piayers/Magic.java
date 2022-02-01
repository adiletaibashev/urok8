package kg.geektech.game.piayers;

public class Magic extends Hero {
    public Magic(int helth, int damage, String name) {
        super(helth, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        if (heroes[2].getHelth() < 50) {
            heroes[2].setHelth(heroes[5].getHelth() - 100);
        }else if(heroes[2].getHelth() > 50) {
            for (int i = 0; i < heroes.length; i++) {

                heroes[i].setDamage(heroes[i].getDamage() + 2);
            }
        }

        System.out.println("Magic boost " + 2);

    }

}

