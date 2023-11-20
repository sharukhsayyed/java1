package com.demo.roomDao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.MeetingRoom;
import com.demo.beans.Room;
import com.demo.beans.TrainingRoom;

public class RoomDaoImpl implements RoomDao {

	Set<Room> st=new HashSet<>();
	Scanner sc=new Scanner(System.in);
	@Override
	public void addNewRoom(Room r) {
		if(st.add(r)) {
			System.out.println("New Room Added Successfully");
		}else {
			System.out.println("Room not added");
		}
		
	}

	@Override
	public void cancelRoomBooking(int roomId) {
		
		for(Room r:st) {
			if(r.getStatus().equals("available")) {
				System.out.println("Booking cancel Successfully");
				r.setStatus("available");
			}else {
				System.out.println("Booking not cancel Successfully");
			}
		}
		
	}

	@Override
	public Room BookRoom(Room r, int capacity) {
		
		for(Room r1:st) {
			if(r1 instanceof MeetingRoom && r instanceof MeetingRoom) {
				if(r1.getCapacity()==capacity && r1.getStatus().equals("available")) {
					System.out.println("You are allocated the following Room of type MeetingRoom");
					r1.setStatus("unavailable");
					return r1;
				}
			}else if(r1 instanceof TrainingRoom && r instanceof TrainingRoom) {
				if(r1.getCapacity()==capacity && r1.getStatus().equals("available")) {
					System.out.println("You are allocated the following Room of type TrainingRoom");
					r1.setStatus("unavailable");
					return r1;
				}
			}
			
		}
		
		return null;
	}

	@Override
	public Set<Room> displayAll() {
		
		return st;
	
	}

}
