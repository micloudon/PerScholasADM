package week8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	
	
	public static void createDir() {
		
		try {

		    Path path1 = Paths.get("/home/mic/Desktop/PlayGround/parkOne");
		    
//		    new folder
		    Path path2 = Paths.get("/home/mic/Desktop/PlayGround/parkThree");
		    
//		    new folder
		    Path path3 = Paths.get("/home/mic/Desktop/PlayGround/parkTwo");
		    

		    //java.nio.file.Files;
		    Files.createDirectories(path1);
		    Files.createDirectories(path2);
		    Files.createDirectories(path3);
		   

		    System.out.println("Directory is created!");

		  } catch (IOException e) {

		    System.err.println("Failed to create directory!" + e.getMessage());

		  }
		
		}
	
	public static void createFiles() {
		
		try {
//			folder
		      File myObj1 = new File("/home/mic/Desktop/PlayGround/parkOne/Emma.txt");
		      File myObj2 = new File("/home/mic/Desktop/PlayGround/parkOne/Olivia.txt");
		      
//		      folder
		      File myObj3 = new File("/home/mic/Desktop/PlayGround/parkThree/Joe.txt");
		      File myObj4 = new File("/home/mic/Desktop/PlayGround/parkThree/Rob.txt");
		      
		      if (myObj1.createNewFile()) {
		        System.out.println("File created: " + myObj1.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		      if (myObj2.createNewFile()) {
			        System.out.println("File created: " + myObj2.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
		      
		      if (myObj3.createNewFile()) {
			        System.out.println("File created: " + myObj3.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
		      if (myObj4.createNewFile()) {
			        System.out.println("File created: " + myObj4.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	public static void main(String[] args) {
		
		createDir();
		createFiles();
	
	

	

	}

}
