package com.demo.roomTest;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Room;
import com.demo.roomservice.RoomService;
import com.demo.roomservice.RoomServiceImpl;

public class RoomTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		RoomService rs=new RoomServiceImpl();
		int ch;
		
		do {
			System.out.println("1.Add room.\n2.Cancel Room Booking.\n3.Book Room.\n4.DisplayALL rooms\n5.Exit");
			
			System.out.println("Enter  a choice");
			ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:
				rs.addNewRoom();
				break;
			
			case 2:
				rs.cancelRoomBooking();
				break;
			case 3:
				Room r=rs.BookRoom();
				System.out.println(r);
				break;
			case 4:
				Set<Room> st=rs.displayAll();
				st.stream().forEach(System.out::println);
				break;
			case 5:
				System.out.println("Thank You...");
				System.exit(0);
			}
			
		}while(ch!=5);

	}

}
