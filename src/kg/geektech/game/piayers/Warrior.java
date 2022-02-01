package kg.geektech.game.piayers;

import kg.geektech.game.general.RPG_Game;

public class Warrior extends Hero{
    public Warrior(int helth, int damage,String name) {
        super(helth, damage, SuperAbility.CRITICAL_DAMAGE,name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (heroes[0].getHelth() < 50) {
            heroes[0].setHelth(heroes[5].getHelth() - 100);
        } else if (heroes[0].getHelth() > 50) {
            int coeff = RPG_Game.random.nextInt(5) + 1;
            boss.setHelth(boss.getHelth() - this.getDamage() * coeff);
            System.out.println("Warior hits critically " + this.getDamage() * coeff);
        }
    }
}
