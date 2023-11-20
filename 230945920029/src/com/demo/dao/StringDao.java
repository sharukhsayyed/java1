package com.demo.dao;

import java.util.List;

import com.demo.beans.AcceptString;

public interface StringDao {

    void addString(AcceptString str);
    
    void addToNewString();
    
    void readFromFile();
    void writeToFile();
    
    List<AcceptString> displayAll();
	
    List<AcceptString> displayAllTemp();
}
