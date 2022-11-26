package uz.chat.chatapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.chat.chatapp.dtos.MessageDto;
import uz.chat.chatapp.service.ChatService;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class ChatController {

    final ChatService service;

    @PostMapping("message")
    public String sendMessage(@RequestBody MessageDto message) {
        return service.sendMessage(message);
    }

    @PostMapping("message/receive")
    public String receiveMessage(@RequestBody MessageDto message) {
        return service.receiveMessage(message);
    }
}
