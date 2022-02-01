package kg.geektech.game.piayers;

public abstract class Hero extends GamemEntity implements HavingSuperAbility{
    private SuperAbility superAbility;
    private String name;

    public Hero(int helth, int damage ,
                SuperAbility superAbility,String name) {
        super(helth, damage);
        this.superAbility =  superAbility;
        this.name = name;

    }

    public SuperAbility getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(SuperAbility superAbility) {
        this.superAbility = superAbility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
