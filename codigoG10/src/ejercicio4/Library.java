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

    public void addItem(LibraryItem itemAdd) {
        boolean isFound = false;
        for(LibraryItem item: items) {
            if(itemAdd.getItemId() == item.getItemId()) {
                isFound = true;
                break;
            }
        }
        if(isFound) {
            System.out.println("Item already exists");
        } else {
            items.add(itemAdd);
        }
    }
}
