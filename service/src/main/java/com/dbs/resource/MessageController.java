package com.dbs.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.mq26.entities.Message;
import com.dbs.service.MessageService;

@RestController
@RequestMapping("/Message/")
public class MessageController {
	
	@Autowired
	MessageService messageService;
	@PostMapping("addMessage")
	public Message addMessage(@RequestParam Message message) {
		
		 return  messageService.addMessage(message);
		 
	}
	@PostMapping("deleteMessage")
	public Message deleteMessage(@RequestParam Message message) {
		
		 return  messageService.addMessage(message);
		 
	}
	
	
	
	
}
