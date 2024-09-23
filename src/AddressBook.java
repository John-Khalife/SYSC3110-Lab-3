import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddyList;

    public AddressBook() {
        buddyList = new ArrayList<BuddyInfo>();
    }

    public static void main(String[] args) {
        //Objects that will be necessary
        BuddyInfo buddy = new BuddyInfo();
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        System.out.println("Address Book");
    }

    public boolean removeBuddy(int index) {
        if (index >= 0 && index < buddyList.size()) {
            buddyList.remove(index);
            return true;
        }
        return false;
    }

    public boolean addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddyList.add(buddy);
            return true;
        }
        return false;
    }
}
