package com.demo.beans;

import java.util.Objects;

public class Room {

	private int roomid;
	private String roomName;
	private int capacity;
	private double price;
	private String status;
	
	public Room() {
		super();
	}

	public Room(int roomid, String roomName, int capacity, double price, String status) {
		super();
		this.roomid = roomid;
		this.roomName = roomName;
		this.capacity = capacity;
		this.price = price;
		this.status = status;
	}

	public int getRoomid() {
		return roomid;
	}

	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ClassRoom [roomid=" + roomid + ", roomName=" + roomName + ", capacity=" + capacity + ", price=" + price
				+ ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(roomid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		return roomid == other.roomid;
	}
	
	
	
}
