package ejercicio4;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items;
    private ArrayList<LibraryUser> users;

    public Library() {
        items = new ArrayList<>();
        users = new ArrayList<>();
    }

    public ArrayList<LibraryItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<LibraryItem> items) {
        this.items = items;
    }

    public ArrayList<LibraryUser> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<LibraryUser> users) {
        this.users = users;
    }
}
