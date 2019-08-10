package com.dbs.mq26.controller;

import com.dbs.mq26.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.mq26.entities.Message;


@RestController
@RequestMapping("/api/message/")
public class MessageController {

    @Autowired
    MessageService messageService;

    @PostMapping("/add")
    public Message addMessage(@RequestParam Message message) {

        return  messageService.addMessage(message);

    }
    @PostMapping("/delete")
    public Message deleteMessage(@RequestParam Message message) {

        return  messageService.addMessage(message);

    }

}
