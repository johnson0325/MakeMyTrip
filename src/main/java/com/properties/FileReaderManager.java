package com.properties;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
public static FileReaderManager getInstansfilFileReaderManager() {
	FileReaderManager frm = new FileReaderManager();
	return frm;
}
public Configuration getIntansConfiguration() throws IOException {
	Configuration cf = new Configuration();
	return cf;
}

}
