package com.demo.service;

import java.util.List;

import com.demo.beans.AcceptString;

public interface StringService {

	
     void addString();
    
    void addToNewString();
    
    void readFromFile();
    void writeToFile();
    
    List<AcceptString> displayAll();
	
    List<AcceptString> displayAllTemp();
}
