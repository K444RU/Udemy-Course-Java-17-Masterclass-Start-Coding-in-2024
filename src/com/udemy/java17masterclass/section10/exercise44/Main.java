package java17masterclass.section10.exercise44;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("1234567890");

        Contact bob = Contact.createContact("Bob", "31415926");
        Contact alice = Contact.createContact("Alice", "16180339");
        Contact tom = Contact.createContact("Tom", "11235813");

        mobilePhone.addNewContact(bob);
        mobilePhone.addNewContact(alice);
        mobilePhone.addNewContact(tom);

        mobilePhone.printContacts(); // Should print the contacts in the list


        Contact foundContact = mobilePhone.queryContact("Alice");
        if (foundContact != null) {
            System.out.println("Found contact: " + foundContact.getName() + " -> " + foundContact.getPhoneNumber());
        } else {
            System.out.println("Contact not found.");
        }

        Contact jane = Contact.createContact("Jane", "98765432");
        mobilePhone.updateContact(bob, jane); // Update Bob to Jane

        mobilePhone.printContacts(); // Should print updated contact list

        mobilePhone.removeContact(tom); // Remove Tom

        mobilePhone.printContacts(); // Should print contact list without Tom
    }
}
