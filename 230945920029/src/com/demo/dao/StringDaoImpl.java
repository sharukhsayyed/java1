package com.demo.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.AcceptString;

public class StringDaoImpl implements StringDao {

	List<AcceptString> lst=new ArrayList<>();
	List<AcceptString> resList=new ArrayList<>();
	@Override
	public void addString(AcceptString str) {
	
		
		lst.add(str);
		
	}

	@Override
	public void addToNewString() {
		
		for(AcceptString s:lst) {
			String str=s.getStr();
			if(str.length()>5) {
				resList.add(s);
			}
		}
	}

	@Override
	public void readFromFile() {
		
		try(BufferedReader br=new BufferedReader(new FileReader("Data.txt"));){
			
			String str=br.readLine();
			while(str!=null) {
				String[] strarr=str.split("\n");
				AcceptString ob=new AcceptString(strarr[0]);
				lst.add(ob);
				
				str=br.readLine();
			}
			
		}
		catch(IOException  e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void writeToFile() {
		
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("Data.txt"));){
			
			for(AcceptString str:resList) {
				bw.write(str.getStr()+"\n");
			}
			
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public List<AcceptString> displayAll() {
		
		return lst;
	}

	@Override
	public List<AcceptString> displayAllTemp() {
		// TODO Auto-generated method stub
		return resList;
	}

	
}
