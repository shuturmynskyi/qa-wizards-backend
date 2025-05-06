
package com.qawizards.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ContactController {

    @PostMapping("/contact")
    public String handleContact(@RequestParam String name,
                                 @RequestParam String email,
                                 @RequestParam String message) {
        System.out.println("New message from: " + name + " <" + email + ">");
        System.out.println("Message: " + message);
        return "Message received!";
    }
}
