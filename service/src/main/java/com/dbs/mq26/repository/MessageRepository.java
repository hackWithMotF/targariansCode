package com.dbs.mq26.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.dbs.mq26.entities.Message;



@Component
public interface MessageRepository extends JpaRepository<Message,Long> {
	
	 //Message save(Message message);
}
