package oopos;

import java.io.File;

public class RenameFile {
	   public static void main(String[] args) {
	        String downloadDir = "C:\\Users\\HP\\Downloads\\"; // change this to the directory where your file is located
	        File dir = new File(downloadDir);
	        File[] files = dir.listFiles();
	        for (File file : files) {
	            if (file.isFile()) {
	                String fileName = file.getName();
	                // check if the file name matches your criteria for the recently downloaded unknown file
	                if (fileName.startsWith("SSC") && fileName.endsWith(" .pdf")) {
	                    // specify the new file name
	                    String newFileName = "new_file_name.pdf"; // change this to your desired file name and extension
	                    File newFile = new File(downloadDir + newFileName);
	                    if (file.renameTo(newFile)) {
	                        System.out.println("File renamed successfully");
	                    } else {
	                        System.out.println("File renaming failed");
	                    }
	                }
	            }
	        }
	    }
		
		 
		
	}

