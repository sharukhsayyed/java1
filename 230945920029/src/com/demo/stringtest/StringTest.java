package com.demo.stringtest;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.AcceptString;
import com.demo.service.StringService;
import com.demo.service.StringServiceImpl;

public class StringTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		StringService ss=new StringServiceImpl();
		
		int ch;
		
		do {
			
			System.out.println("1.Add String.\n2.Add to the new String array whose length is greater than 5.\n3.Read from file.\n4.Write to the file.\n5.Display all strings.\n6.Display strings whose length is greater than 5.\n7.Exit");
			System.out.println("Enter a choice");
			ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:
				ss.addString();
				break;
			
			case 2:
				ss.addToNewString();
				break;
			case 3:
				ss.readFromFile();
				break;
				
			case 4:
				ss.writeToFile();
				break;
				
			case 5:
				List<AcceptString> ls=ss.displayAll();
				ls.stream().forEach(System.out::println);
				break;
			case 6:
				List<AcceptString> ls2=ss.displayAllTemp();
				ls2.stream().forEach(System.out::println);
				break;
			case 7:
				System.out.println("Thank You....");
				System.exit(0);
			}
			
		}while(ch!=7);

	}

}
