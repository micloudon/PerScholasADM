package com.persholas.cafe3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClubMemberApp {

	public static void main(String[] args) {
		SoftwareDeveloperClub w = new SoftwareDeveloperClub();
		System.out.println();
	}

}


class ClubMember {
	
}

class SoftwareDeveloperClub {
	SoftwareDeveloperClub() {
		List<String[]> m = new ArrayList<>(); 
		try {
			File members = new File("/home/mic/eclipse-workspace/PerscholasCafe/src/com/persholas/cafe3/members.txt");
			Scanner reader = new Scanner(members);
			while (reader.hasNextLine()) {
		        String data = reader.nextLine();
		        System.out.println(data);
		        String[] line = data.split("\\*\\*");
		        m.add(line);
//		       System.out.println(m);
		      }
			for(String[] l : m) {
				System.out.format("Member Name:%s\n Location:%s %s\n Favorite Language:%s\n" , l);

				
			}
		      reader.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		}
}

