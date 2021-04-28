package com.lfdel24.mondodb.contacts.service;

import com.lfdel24.mondodb.contacts.entity.Contact;
import com.lfdel24.mondodb.contacts.repository.IContactRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author leo
 */
@Service
public class ContactServiceImp implements IContactService{
    
    @Autowired
    private IContactRepository repository;
    
    
    @Override
    public Contact save(Contact contact) throws Exception {
        contact = repository.save(contact);
        return contact;
    }

    @Override
    public Contact get(Long id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Contact update(Contact contact) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Contact delete(Long id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Contact> findAll() throws Exception {
       return  this.repository.findAll();
    }
    
}
