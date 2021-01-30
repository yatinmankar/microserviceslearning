package com.springmvc.editor;

import java.beans.PropertyEditorSupport;

public class NameBinder extends PropertyEditorSupport{
	
	 public void setAsText(String studentName) throws java.lang.IllegalArgumentException {
		 
	        if (studentName.contains("Mr.") || studentName.contains("Ms.") ) {
	            setValue(studentName);
	            
	        }else{
	        	studentName="Ms. "+studentName;
	        	 setValue(studentName);
	        }
	        
	    }

}
