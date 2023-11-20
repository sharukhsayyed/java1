package com.demo.beans;

public class AcceptString {

	private String str;

	public AcceptString() {
		super();
	}

	public AcceptString(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public int getlength(String str) {
		return str.length();
				
	}

	@Override
	public String toString() {
		return "String is "+ str;
	}
}
