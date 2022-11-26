package uz.chat.chatapp.service;

import uz.chat.chatapp.dtos.MessageDto;

public interface ChatService {
    String sendMessage(MessageDto message);
    String receiveMessage(MessageDto message);
}


