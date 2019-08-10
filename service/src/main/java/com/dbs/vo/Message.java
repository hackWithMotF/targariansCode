package com.dbs.vo;

public class Message {
	
	int QueueNo;
	String Message;
	
	@Override
	public String toString() {
		return "Message [QueueNo=" + QueueNo + ", Message=" + Message + "]";
	}
	public int getQueueNo() {
		return QueueNo;
	}
	public void setQueueNo(int queueNo) {
		QueueNo = queueNo;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	

	
	
}
