package com.dbs.mq26.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.mq26.entities.Queue;

public interface QueueRepository extends JpaRepository<Queue, Long> {

    Optional<Queue> findByName(String name);

    void deleteByName(String name);
    
    long  count();

}
