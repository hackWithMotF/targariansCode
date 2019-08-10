package com.dbs.mq26.service;

import com.dbs.mq26.entities.Message;
import org.springframework.stereotype.Component;

@Component
public interface MessageService {

    public Message addMessage(Message message);
    //public Response deleteMessage(Message message);
    public void getMessage(int QueueNo);//todo
}
