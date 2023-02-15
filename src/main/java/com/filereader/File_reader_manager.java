package com.filereader;


import Configuration.configuration_reader;

public class File_reader_manager {

	
	private  File_reader_manager() {
		
	}

	
	public static File_reader_manager getinstanceFRM() {
		File_reader_manager frm = new File_reader_manager();
		return frm ;
  }

	
	public  configuration_reader GetinstanceCR() throws Throwable {
		configuration_reader cr = new configuration_reader();
		return cr ;		
				
	}
	
}
