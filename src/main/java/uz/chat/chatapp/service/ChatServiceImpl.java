package uz.chat.chatapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uz.chat.chatapp.dtos.MessageDto;
import uz.chat.chatapp.entity.Message;
import uz.chat.chatapp.repository.ChatRepository;


@RequiredArgsConstructor
@Service
public class ChatServiceImpl implements ChatService {

    ChatRepository chatRepository;

    @Override
    public String sendMessage(MessageDto message) {
        RestTemplate template = new RestTemplate();
        template.postForObject("http://192.168.100.110:8080/api/message/receive", message, String.class);
        System.out.println("MESSAGE SENT TO " + message.getSenderName());
        return "Message sent";
    }

    @Override
    public String receiveMessage(MessageDto message) {
        Message msg = new Message(message.getSenderName(), message.getMessage());
        chatRepository.save(msg);
        System.out.println("MESSAGE: " + message.getMessage() + "\nFROM: " + message.getSenderName());
        return "SUCCESS";
    }
}
