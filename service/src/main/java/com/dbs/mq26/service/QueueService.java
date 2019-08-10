package com.dbs.mq26.service;

import com.dbs.mq26.entities.Queue;
import com.dbs.mq26.exception.QueueAlreadyExistsException;
import com.dbs.mq26.repository.QueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Component
public class QueueService {
    @Autowired
    private QueueRepository queueRepository;

    public List<Queue> getAllQueues() {
        return queueRepository.findAll();
    }

    @Transactional
    public void deleteQueue(String name){
        Optional<Queue> queueExists = queueRepository.findByName(name);
        if(queueExists.isPresent()){
            queueRepository.deleteByName(name);
        }

    }

    public Queue createQueue(String name){
        Optional<Queue> queueExists = queueRepository.findByName(name);
        if(queueExists.isPresent()){
            System.out.println("=====already present===");
            throw new QueueAlreadyExistsException("this queue name already exists");
        }
        Queue queue = new Queue();
        queue.setName(name);
        return queueRepository.save(queue);
    }


}