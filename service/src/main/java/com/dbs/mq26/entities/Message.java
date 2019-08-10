package com.dbs.mq26.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class Message {
	@Id
	@Column(name = "messageid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int messageid;

	@Column(name = "queueid")
	int queueid;
	@Column(name = "deletedtime")
	Timestamp deletedtime;
	@Column(name = "message")
	String message;
	@Column(name = "createdtime")
	Timestamp createdtime;
	public int getMessageid() {
		return messageid;
	}
	@Override
	public String toString() {
		return "Message [messageid=" + messageid + ", queueid=" + queueid + ", deletedtime=" + deletedtime
				+ ", message=" + message + ", createdtime=" + createdtime + "]";
	}
	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}
	public int getQueueid() {
		return queueid;
	}
	public void setQueueid(int queueid) {
		this.queueid = queueid;
	}
	public Timestamp getDeletedtime() {
		return deletedtime;
	}
	public void setDeletedtime(Timestamp deletedtime) {
		this.deletedtime = deletedtime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Timestamp getCreatedtime() {
		return createdtime;
	}
	public void setCreatedtime(Timestamp createdtime) {
		this.createdtime = createdtime;
	}
}
