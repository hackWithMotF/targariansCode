package com.dbs.dao;

import com.dbs.mq26.entities.Message;

public interface MessageDao {
		public Message addMessage(int QueueNo, String Message);
		public Message deleteMessage(int QueueNo,String Message);
		public void getMessage(int QueueNo);//todo
}
