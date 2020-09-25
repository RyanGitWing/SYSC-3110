import java.util.*;

public class AddressBook {

    private ArrayList<BuddyInfo> addressBook;

    public static void main(String[] args) {

        BuddyInfo buddy1 = new BuddyInfo("Darron");
        BuddyInfo buddy2 = new BuddyInfo("Laquifa");

        System.out.println("Address Book");

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

}
