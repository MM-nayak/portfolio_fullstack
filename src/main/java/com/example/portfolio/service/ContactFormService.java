package com.example.portfolio.service;

import com.example.portfolio.model.ContactForm;
import com.example.portfolio.repository.ContactFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactFormService {
    @Autowired
    private ContactFormRepository contactFormRepository;

    public ContactForm saveForm(ContactForm contactForm) {
        return contactFormRepository.save(contactForm);
    }
}

