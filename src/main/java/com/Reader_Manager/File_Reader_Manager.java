package com.Reader_Manager;

import com.reader.Configuration_Reader;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {

	}
	
	public static File_Reader_Manager getInstanceFrm() {

		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
	}
	
	public Configuration_Reader getInstanceCr() throws Throwable {
		
		Configuration_Reader cr = new Configuration_Reader();
		
		return cr;
	}
	

}
