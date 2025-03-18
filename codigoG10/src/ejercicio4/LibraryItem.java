package ejercicio4;

public class LibraryItem {
    protected String title;
    protected int itemId;
    protected String isLoaned;

    public LibraryItem(String title, int itemId, String isLoaned) {
        this.title = title;
        this.itemId = itemId;
        this.isLoaned = isLoaned;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getIsLoaned() {
        return isLoaned;
    }

    public void setIsLoaned(String isLoaned) {
        this.isLoaned = isLoaned;
    }

    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemId);
        System.out.println("IsLoaned: " + isLoaned);
    }
}
