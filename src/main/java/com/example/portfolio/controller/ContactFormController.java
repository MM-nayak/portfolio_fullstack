package com.example.portfolio.controller;

import com.example.portfolio.model.ContactForm;
import com.example.portfolio.service.ContactFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
public class ContactFormController {
    @Autowired
    private ContactFormService contactFormService;
    @CrossOrigin(origins = "*")
    @PostMapping("/submit") // Make sure this annotation is present
    public ResponseEntity<ContactForm> submitContactForm(@RequestBody ContactForm contactForm) {
        ContactForm savedForm = contactFormService.saveForm(contactForm);
        return new ResponseEntity<>(savedForm, HttpStatus.CREATED);
    }
}


