package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.AcceptString;
import com.demo.dao.StringDao;
import com.demo.dao.StringDaoImpl;

public class StringServiceImpl implements StringService {

	Scanner sc=new Scanner(System.in);
	StringDao sdao=new StringDaoImpl();
	@Override
	public void addString() {
		
		System.out.println("Enter a string");
		String str=sc.next();
		
		AcceptString s=new AcceptString(str);
		sdao.addString(s);
		
	}

	@Override
	public void addToNewString() {
		
		sdao.addToNewString();
		
	}

	@Override
	public void readFromFile() {
		sdao.readFromFile();
		
	}

	@Override
	public void writeToFile() {
		// TODO Auto-generated method stub
		sdao.writeToFile();
	}

	@Override
	public List<AcceptString> displayAll() {
		
		return sdao.displayAll();
	}

	@Override
	public List<AcceptString> displayAllTemp() {
		// TODO Auto-generated method stub
		return sdao.displayAllTemp();
	}

}
