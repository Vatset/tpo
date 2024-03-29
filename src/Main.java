import main.Task3.*;

public class Main {
    public static void main(String[] args) {
        Vogon guard = new Vogon(30, "Guard");
        SteelDoor steelDoor = new SteelDoor(true);
        Notebook notebook = new Notebook();
        Captain captain = new Captain(50, "Captain", notebook);
        Humanoid arthur = new Humanoid(10, "Arthur");
        Humanoid ford = new Humanoid(15, "Ford");

        guard.grab(arthur, ford);
        guard.bow(captain);
        steelDoor.close();
        captain.purr();
        captain.scrollNotebook(5);
    }
}
