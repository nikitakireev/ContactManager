package net.schastny.contactmanager.dao;

import net.schastny.contactmanager.domain.Contact;

import java.util.List;

/**
 * Created by Никита on 28.01.2015.
 */
public interface ContactDAO {

    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}
