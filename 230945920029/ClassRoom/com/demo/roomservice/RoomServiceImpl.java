package com.demo.roomservice;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.MeetingRoom;
import com.demo.beans.Room;
import com.demo.beans.TrainingRoom;
import com.demo.roomDao.RoomDao;
import com.demo.roomDao.RoomDaoImpl;

public class RoomServiceImpl implements RoomService {

	RoomDao rdao=new RoomDaoImpl();
	Scanner sc=new Scanner(System.in);
	@Override
	public void addNewRoom() {
		
		System.out.println("Enter a RoomId");
		int rid=sc.nextInt();
		
		System.out.println("Enter a RoomName");
		
		String roomName=sc.next();
		
		System.out.println("Enter a room capacity");
		int cap=sc.nextInt();
		
		
		System.out.println("Enter a room price");
		double price=sc.nextInt();
		
		System.out.println("Enter a room status available/unavailable");
		String status=sc.next();
		
		int ch;
		System.out.println("1.Meeting Room.\n2.Training Room");
		System.out.println("Enter a room choice");
		ch=sc.nextInt();
		Room r=null;
		if(ch==1) {
			
			System.out.println("Enter Tv brand/company name");
			String tv_make=sc.next();
			
			System.out.println("Enter a Tv model name");
			String tv_model=sc.next();
			
			 r=new MeetingRoom(rid,roomName,cap,price,status,tv_make,tv_model);
		}else if(ch==2) {
			
			System.out.println("Enter Telephone Number for audio/video call");
			
			String phone=sc.next();
			
			
			 r=new TrainingRoom(rid,roomName,cap,price,status,phone);
		}else {
			System.out.println("Enter a valid Choice");
		}
		
	   if(r!=null) {
		   rdao.addNewRoom(r);
	   }
		
	}

	@Override
	public void cancelRoomBooking() {
		
		System.out.println("Enter a RoomId fro that u want to cancel booking");
		int id=sc.nextInt();
		
		rdao.cancelRoomBooking(id);
		
	}

	@Override
	public Room BookRoom() {
		
		System.out.println("Enter a choice from below which type of room u want");
		System.out.println("1.Meeting Room.\n2.Training Room");
		
		System.out.println("Enter a choice");
		int ch=sc.nextInt();
		
		
		if(ch==1) {
			System.out.println("Enter your capacity");
			int cap=sc.nextInt();
			Room r=new MeetingRoom();
			return rdao.BookRoom(r, cap);
			
		}else if(ch==2) {
			System.out.println("Enter your capacity");
			int cap=sc.nextInt();
			Room r=new TrainingRoom();
			return rdao.BookRoom(r, cap);
		}
		else {
			System.out.println("Plz entered valid choice");
		}
		return null;
	}

	@Override
	public Set<Room> displayAll() {
		return rdao.displayAll();
		
		
		
	}

	
	
	
}
