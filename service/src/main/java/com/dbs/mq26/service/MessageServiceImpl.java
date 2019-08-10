package com.dbs.mq26.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbs.mq26.entities.Message;
import com.dbs.mq26.repository.MessageRepository;





@Component
public class MessageServiceImpl implements MessageService {

	@Autowired
	MessageRepository messageRepository;
	public Message addMessage(Message message) {
		// Response respons
		//return messageDao.addMessage(message);
		Message msg  = new Message();
		msg.setMessageid(message.getMessageid());
		msg.setQueueid(msg.getQueueid());
		msg.setMessage(message.getMessage());
		msg.setDeletedtime(message.getDeletedtime());
		msg.setCreatedtime(message.getCreatedtime());
		///
		return messageRepository.save(msg);
	}

	/*
	 * public Response deleteMessage(int QueueNo, String Message) { //return
	 * messageDao.deleteMessage(QueueNo, Message); }
	 */

	public void getMessage(int QueueNo) {
		// todo
		//messageDao.getMessage(QueueNo);
	}
}
