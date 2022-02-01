package kg.geektech.game.piayers;

public abstract class GamemEntity {
    private int helth;
    private int damage;

    public GamemEntity(int helth, int damage) {
        this.helth = helth;
        this.damage = damage;
    }

    public int getHelth() {
        return helth;
    }

    public void setHelth(int helth) {
        if (helth < 0) {
            this.helth = 0;

        }else {
            this.helth = helth;
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
