package java17masterclass.section10.exercise44;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact newContact) {
        if (findContact(newContact.getName()) >= 0) {
            return false;
        }
        myContacts.add(newContact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPositionOfContact = findContact(oldContact);
        if (foundPositionOfContact < 0) {
            return false;
        }
        myContacts.set(foundPositionOfContact, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPositionOfContact = findContact(contact);
        if (foundPositionOfContact < 0) {
            return false;
        }
        myContacts.remove(foundPositionOfContact);
        return true;
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
