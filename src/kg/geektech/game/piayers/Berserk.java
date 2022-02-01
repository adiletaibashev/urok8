package kg.geektech.game.piayers;

public class Berserk extends Hero{
    public Berserk(int helth, int damage,String name) {
        super(helth, damage,
                SuperAbility.SAVE_DAMAGE_AND_REVERT,name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int revertDamage = 25;
        if (heroes[3].getHelth() < 50) {
            heroes[3].setHelth(heroes[5].getHelth() - 100);
        }else if (heroes[3].getHelth() > 50) {
            boss.setHelth(boss.getHelth() - revertDamage);
            System.out.println("Berserk save damage and revert " + 35);
        }

    }
}
