import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddyList;

    public AddressBook() {
        buddyList = new ArrayList<>();
    }

    public static void main(String[] args) {
        //Objects that will be necessary
        BuddyInfo buddy = new BuddyInfo();
        AddressBook addressBook = new AddressBook();
        System.out.println("Adding a buddy. Size: " + addressBook.getSize());
        addressBook.addBuddy(buddy);
        System.out.println("Removing a buddy. Size: " + addressBook.getSize());
        addressBook.removeBuddy(0);
        System.out.println("Address Book");
    }

    public void removeBuddy(int index) {
        if (index >= 0 && index < buddyList.size()) {
            buddyList.remove(index);
        }
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddyList.add(buddy);
        }
    }

    public int getSize() {
        return buddyList.size();
    }
}