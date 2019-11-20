package src.Heros;

public class Thanatos extends Hero {
    public Thanatos(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    protected void firePrimary() {
        mana-=25;
    }

    @Override
    protected void fireSecondary() {
        mana-=50;
    }

    @Override
    protected void receiveHit() {
        mana+=25;
        hp-=10;

    }
}
