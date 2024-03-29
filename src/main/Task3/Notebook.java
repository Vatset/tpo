package main.Task3;

public class Notebook {

    private int currentPage = 0;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void scroll(int pages) {
        currentPage += pages;
    }
}
