package uz.chat.chatapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.chat.chatapp.entity.Message;

@Repository
public interface ChatRepository extends JpaRepository<Message, Long> {
}
