package net.schastny.contactmanager.dao;

import net.schastny.contactmanager.domain.Contact;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ContactDAOImpl implements ContactDAO {
 @Autowired
 private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void addContact(Contact contact) {
        sessionFactory.getCurrentSession().save(contact);
    }

    @SuppressWarnings("unchecked")
    public List<Contact> listContact() {
        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }

    @Override
    public void removeContact(Integer id) {
        Contact contact = (Contact) sessionFactory.getCurrentSession().load(Contact.class, id);
        if (null!= contact)
            sessionFactory.getCurrentSession().delete(contact);
    }
}
