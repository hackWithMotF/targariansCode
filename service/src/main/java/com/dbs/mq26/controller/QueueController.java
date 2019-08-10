package com.dbs.mq26.controller;

import com.dbs.mq26.entities.Queue;
import com.dbs.mq26.payload.QueueDetails;
import com.dbs.mq26.service.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/queue")
public class QueueController {

    @Autowired
    QueueService queueService;

    @GetMapping
    List<Queue> getAllQueues(){
        return queueService.getAllQueues();
    }

    @PostMapping(value = "/create",consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    Queue createQueue(@RequestBody QueueDetails queuePayload){
        String name = queuePayload.getName();
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
