package com.demo.roomservice;

import java.util.Set;

import com.demo.beans.Room;

public interface RoomService {

	void addNewRoom();
	
	void cancelRoomBooking();
	
	Room BookRoom();
	
	Set<Room> displayAll();
}
