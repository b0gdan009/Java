package src;

public class VetProgram {
    public static void main(String[] args) {
        Bear winnie = new Bear();
        Lion simba = new Lion();
        Chiken KFC= new Chiken();
        Vet marcel= new Vet();

        marcel.makeShot(simba);
        marcel.makeShot(KFC);
        marcel.makeShot(winnie);

    }
}
