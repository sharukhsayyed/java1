package com.demo.beans;

public class TrainingRoom extends Room {

	private String teleNumber;

	public TrainingRoom() {
		super();
	}

	public TrainingRoom(int roomid, String roomName, int capacity, double price, String status,String teleNumber) {
		super( roomid,  roomName,  capacity,  price,  status);
		this.teleNumber = teleNumber;
	}

	public String getTeleNumber() {
		return teleNumber;
	}

	public void setTeleNumber(String teleNumber) {
		this.teleNumber = teleNumber;
	}

	@Override
	public String toString() {
		return super.toString()+"TrainingRoom [teleNumber=" + teleNumber + "]";
	}
	
	
	
	
}
