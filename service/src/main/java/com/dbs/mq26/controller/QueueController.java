package com.dbs.mq26.controller;

import com.dbs.mq26.entities.Message;
import com.dbs.mq26.entities.Queue;
import com.dbs.mq26.service.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.xml.ws.Response;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    ResponseEntity<Map<String,String>> deleteQueue(@RequestParam("name") String name){
        queueService.deleteQueue(name);
        Map<String,String> response = new HashMap();
        response.put("result","success");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /*@GetMapping("/{queueId}/messages")
    List<Message> getQueueMessages(@PathVariable String queueId){
        return
    }*/
}
