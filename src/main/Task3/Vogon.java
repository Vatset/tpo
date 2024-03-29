package main.Task3;

public class Vogon extends Humanoid {

    public Vogon(int strength, String name) {
        super(strength, name);
    }
    public void bow(Captain captain) {
        captain.satisfy(10);
    }

    public boolean grab(Humanoid first, Humanoid second) {
        if (super.getStrength() > first.getStrength() + second.getStrength()) {
            first.beGrabbed();
            second.beGrabbed();
            return true;
        }
        return false;
    }
}
