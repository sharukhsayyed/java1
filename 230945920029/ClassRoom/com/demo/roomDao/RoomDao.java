package com.demo.roomDao;

import java.util.Set;

import com.demo.beans.Room;

public interface RoomDao {

	void addNewRoom(Room r);
	
	void cancelRoomBooking(int roomId);
	
	Room BookRoom(Room r,int capacity);
	
	Set<Room> displayAll();
	
}
