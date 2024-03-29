package Task3;

public class SteelDoor {

    private boolean isOpen;

    public SteelDoor(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void open() {
        System.out.println("Steel door was opened");
        isOpen = true;
    }

    public void close() {
        System.out.println("Steel door was closed");
        isOpen = false;
    }
}
