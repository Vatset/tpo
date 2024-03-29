package Task3;

public class Captain extends Vogon {

    private int satisfaction = 0;
    private Notebook notebook;

    public Captain(int strength, String name, Notebook notebook) {
        super(strength, name);
        this.notebook = notebook;
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    public void satisfy(int value) {
        satisfaction += value;
    }

    public void purr() {
        System.out.println("purr");
        satisfy(5);
    }

    public void scrollNotebook(int pages) {
        for (int i = 0; i < pages; i++) {
            notebook.scroll();
        }
    }
}
