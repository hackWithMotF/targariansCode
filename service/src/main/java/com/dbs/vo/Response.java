package com.dbs.vo;

public class Response {
	
	int requestId;
	int returnCode;
	String returnMessage;
	
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public int getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnMessage() {
		return returnMessage;
	}
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}
	@Override
	public String toString() {
		return "Response [requestId=" + requestId + ", returnCode=" + returnCode + ", returnMessage=" + returnMessage
				+ "]";
	}
	
}

