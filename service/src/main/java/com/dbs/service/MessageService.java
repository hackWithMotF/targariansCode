package com.dbs.service;


import com.dbs.mq26.entities.Message;

public interface MessageService {

		public Message addMessage(Message message);
		//public Response deleteMessage(Message message);
		public void getMessage(int QueueNo);//todo
}
