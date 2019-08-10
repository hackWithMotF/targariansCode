package com.dbs.mq26.service;

import com.dbs.mq26.entities.Queue;
import com.dbs.mq26.exception.MaxQueuesException;
import com.dbs.mq26.exception.QueueAlreadyExistsException;
import com.dbs.mq26.repository.QueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class QueueService {
    @Autowired
    private QueueRepository queueRepository;

    public List<Queue> getAllQueues() {
        return queueRepository.findAll();
    }

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
        long maxQueues = queueRepository.count();
        if(maxQueues>100)
        {
        	throw new MaxQueuesException("Max no of queues is 100 and is reached. Please clear queue to create new ones.");
        }
        Queue queue = new Queue();
        queue.setName(name);
        return queueRepository.save(queue);
    }


}
