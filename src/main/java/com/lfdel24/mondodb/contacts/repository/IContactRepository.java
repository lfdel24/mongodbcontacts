package com.lfdel24.mondodb.contacts.repository;

import com.lfdel24.mondodb.contacts.entity.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author leo
 */
@Repository
public interface IContactRepository extends MongoRepository<Contact, String>{
    
}
