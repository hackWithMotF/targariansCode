package com.dbs.mq26.entities;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "queue")
public class Queue {

    @Id
    @Column(name="queueid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name = "createdtime")
    @CreationTimestamp
    private Timestamp createdtime;

    @Column(name="creator")
    private String creator;

    @Column(name="status",columnDefinition = "varchar(255) default 'open'")
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Timestamp createdtime) {
        this.createdtime = createdtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdtime=" + createdtime +
                ", creator='" + creator + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
