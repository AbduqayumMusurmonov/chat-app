package uz.chat.chatapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private String senderName;
    private String message;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    public Message(String sender, String message) {
        this.senderName = sender;
        this.message = message;
        this.date = new Date();
    }
}

