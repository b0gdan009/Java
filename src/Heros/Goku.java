package src.Heros;

public class Goku extends Hero {

    public Goku(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    protected void firePrimary() {
        mana -=5;
    }


    @Override
    protected void fireSecondary() {
        mana-=40;
    }

    @Override
    protected void receiveHit() {
        hp -=5;
        mana +=3;
    }
}
