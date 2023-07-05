package com.company;

public class MobilePhone {
    private final Contact contact = new Contact();

    public void printContacts() {


        System.out.println("Contact list have "
                + this.contact.getName().size() + " contacts");
        for(int i = 0; i < this.contact.getName().size(); i++) {
            System.out.println((i+1) + ". "
                    + this.contact.getName().get(i)
                    + " -> " + this.contact.getPhoneNumber().get(i));
        }
    }

    public boolean addContact(String name, String phoneNumber) {
        if(findContact(name) == 0) {
            this.contact.getName().add(name);
            this.contact.getPhoneNumber().add(phoneNumber);
            return false;
        }
        return true;
    }

    public int removeContact(String name) {
        if (findContact(name) == 1) {
            this.contact.getName().remove(name);
            return 1;
        }
        return 0;
    }

    public int findContact(String name) {
        if(this.contact.getName().contains(name)) {
            return 1;
        }
        return 0;
    }

    public Contact getContact() {
        return this.contact;
    }
}
