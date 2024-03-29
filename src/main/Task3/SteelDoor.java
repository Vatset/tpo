package main.Task3;

public class SteelDoor {

    private boolean isOpen;

    public boolean isOpen() {
        return isOpen;
    }

    public SteelDoor(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void open() {
        if (isOpen) throw new IllegalStateException();
        System.out.println("Steel door was opened");
        isOpen = true;
    }

    public void close() {
        if (!isOpen) throw new IllegalStateException();
        System.out.println("Steel door was closed");
        isOpen = false;
    }
}
