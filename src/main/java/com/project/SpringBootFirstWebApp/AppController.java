package com.project.SpringBootFirstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("AppController->welcome");
        return "test";
    }

    @RequestMapping("/contacts")
    public String listContacts(Model model){
        ContactBussiness bussiness = new ContactBussiness();
        List<Contact> contactList = bussiness.getContactList();
        model.addAttribute("contactList", contactList);
        return "contacts";
    }
}
