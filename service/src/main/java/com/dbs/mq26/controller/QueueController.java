package com.dbs.mq26.controller;

import com.dbs.mq26.entities.Message;
import com.dbs.mq26.entities.Queue;
import com.dbs.mq26.service.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/queue")
public class QueueController {

    @Autowired
    QueueService queueService;

    @GetMapping
    List<Queue> getAllQueues(){
        return queueService.getAllQueues();
    }

    @PostMapping("/create")
    Queue createQueue(@RequestParam("name") String name){
        Queue queue = queueService.createQueue(name);
        return queue;
    }

    @DeleteMapping("/delete")
    String deleteQueue(@RequestParam("name") String name){
        queueService.deleteQueue(name);
        return "success";
    }

    /*@GetMapping("/{queueId}/messages")
    List<Message> getQueueMessages(@PathVariable String queueId){
        return
    }*/
}
