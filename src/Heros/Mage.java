package src.Heros;

public class Mage extends Hero {

    public Mage(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    protected void firePrimary() {
        mana -=15;
    }

    @Override
    protected void fireSecondary() {
        mana -=40;
    }

    @Override
    protected void receiveHit() {
        hp -=30;
    }
}
