package com.example.devopesportfolio.service;

import com.example.devopesportfolio.model.ContactModel;
import org.springframework.stereotype.Service;


@Service
public class ContactService {

    public String printMessage(ContactModel message) {
        if (message == null) {
            throw new IllegalArgumentException("Kontaktdata saknas");
        }
        if (message.getFirstName() == null || message.getFirstName().isBlank()) {
            throw new IllegalArgumentException("Förnamn krävs");
        }
        if (message.getEmail() == null || message.getEmail().isBlank()) {
            throw new IllegalArgumentException("E-post krävs");
        }
        if (message.getMessage() == null || message.getMessage().isBlank()) {
            throw new IllegalArgumentException("Meddelande krävs");
        }

        System.out.printf(
                "Kontakt mottagen: %s %s <%s> - \"%s\"%n",
                message.getFirstName(),
                message.getLastName(),
                message.getEmail(),
                message.getMessage()
        );

        return "Tack för ditt meddelande!";
    }
}
