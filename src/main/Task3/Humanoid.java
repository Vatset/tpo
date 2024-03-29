package main.Task3;

public class Humanoid {

    private final int strength;
    private final String name;

    public int getStrength() {
        return strength;
    }

    public Humanoid(int strength, String name) {
        this.strength = strength;
        this.name = name;
    }

    public void beGrabbed() {
        System.out.println(name + " was grabbed by the neck!");
    }
}
