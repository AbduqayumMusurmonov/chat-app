package uz.chat.chatapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ChatUser {
    private String username;
    private String firstname;
    private String lastname;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
