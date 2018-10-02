package com.project.SpringBootFirstWebApp;

import java.util.ArrayList;
import java.util.List;

public class ContactBussiness {
    public List<Contact> getContactList(){
        List<Contact> listContact = new ArrayList<>();
        listContact.add(new Contact("Mateusz Adamowicz","mateusz.adamowicz.1994@gmail.com","Poland"));
        listContact.add(new Contact("Jan Kowalski","j.kowalski@gmail.com","Poland"));
        listContact.add(new Contact("Krzysztof Nowak","k.nowak@gmail.com","Germany"));
        return listContact;
    }
}
