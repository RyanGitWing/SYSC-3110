import java.util.*;

public class AddressBook {

    private ArrayList<BuddyInfo> addressBook;

    public static void main(String[] args) {

        BuddyInfo buddy1 = new BuddyInfo("Darron", "Gatineau", 6134204);
        BuddyInfo buddy2 = new BuddyInfo("Laquifa", "Brampton", 819555);

        System.out.println("Book Address"); // this was not here before

        AddressBook book = new AddressBook();
        book.addBuddy(buddy1);
        book.removeBuddy(buddy1);

    }

    public AddressBook() {

        addressBook = new ArrayList<>();

    }

    public void addBuddy(BuddyInfo buddy){

        if (buddy != null)
            addressBook.add(buddy);


    }

    public void removeBuddy(BuddyInfo buddy){

        addressBook.remove(buddy);

    }

    public void changeNumber (int Number){

    }

}
