package week6;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static boolean flag;
    public static int B;
    public static int H;
    
    if(B > 0 && H > 0) {
        flag = true;
    }
    
    else {
        System.out.println("Breadth and height must be positive");
    }
    
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class



