package com.dbs.mq26.repository;

import com.dbs.mq26.entities.Queue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QueueRepository extends JpaRepository<Queue, Long> {

    Optional<Queue> findByName(String name);

    void deleteByName(String name);
    
    long  count();

}
