package net.schastny.contactmanager.service;

import net.schastny.contactmanager.domain.Contact;

import java.util.List;

/**
 * Created by Никита on 28.01.2015.
 */
public interface ContactService {
    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}
