package src.Heros;

public abstract class Hero {
    String name;
    int hp;
    int mana;

    public Hero(String name, int hp, int mana) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mana=" + mana +
                '}';
    }

    protected abstract void firePrimary();
    protected abstract void fireSecondary();
    protected abstract void receiveHit();

}
