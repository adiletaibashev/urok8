package kg.geektech.game.piayers;

public class Medic extends Hero{
    private int healPoints;
    public Medic(int helth, int damage,int healPoints, String name) {
        super(helth, damage, SuperAbility.HEAL,name);
        this.healPoints = healPoints;

    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (heroes[1].getHelth() < 50) {
            heroes[1].setHelth(heroes[5].getHelth() - 100);
        }else if(heroes[1].getHelth() > 50) {
            for (int i = 0; i < heroes.length; i++) {
                if (this != heroes[i]) {
                    heroes[i].setHelth(heroes[i].getHelth() + this.healPoints);
                }

            }
        }

    }
}
