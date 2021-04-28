package com.lfdel24.mondodb.contacts.service;


import com.lfdel24.mondodb.contacts.entity.Contact;
import java.util.List;
import org.springframework.stereotype.Service;


/**
 *
 * @author leo
 */

public interface IContactService {
    
    Contact save (Contact contact) throws Exception;
    Contact get (Long id) throws Exception;
    List<Contact> findAll () throws Exception;
    Contact update (Contact contact) throws Exception;
    Contact delete (Long id) throws Exception;
    
    
}
