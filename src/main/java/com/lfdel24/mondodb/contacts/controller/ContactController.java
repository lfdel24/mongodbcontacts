package com.lfdel24.mondodb.contacts.controller;

import com.lfdel24.mondodb.contacts.entity.Contact;
import com.lfdel24.mondodb.contacts.service.IContactService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author leo
 */
@RestController
@RequestMapping("/")
public class ContactController {

    @Autowired
    private IContactService service;

    @GetMapping(path = "findAll")
    public ResponseEntity findAll() throws Exception {
        Map response = new HashMap<String, Object>();
        response.put("contacts", this.service.findAll());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(path = "save")
    public ResponseEntity save(@RequestBody Contact contact) throws Exception {
        Map response = new HashMap<String, Object>();
        Contact contactsave = this.service.save(contact);
        response.put("contact", contactsave);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
