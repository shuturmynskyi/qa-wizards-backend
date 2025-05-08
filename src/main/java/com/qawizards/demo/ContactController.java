package com.qawizards.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ContactController {

    private final MessageRepository messageRepository;

    // Через конструктор передається репозиторій (інʼєкція залежності)
    public ContactController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @PostMapping("/contact")
    public String handleContact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message
    ) {
        // Створюємо обʼєкт
        Message newMessage = new Message(name, email, message);

        // Зберігаємо в базу
        messageRepository.save(newMessage);

        return "Message received and saved!";
    }
}
