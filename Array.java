package helloworld;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

	
	
//	public void arrayfor() {
//		String[] name= {"ajith","ajay","nithin","naveen"};
//		System.out.println(""+name.length);
//		for(int i=0;i<name.length;i++) {
//		System.out.println(""+name[i]);
//		
		
		
		public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 4, 5, 5, 6, 6, 7};
	        ArrayList<Integer>	list=new ArrayList<Integer>();		
		
	        
	        for(int i=0;i<arr.length;i++) {
	        	if(!list.contains(arr[i])) {
	        		list.add(arr[i]);
	        	}
	        	}
	        Integer[] value=list.toArray(new Integer[0]);
	        
	        System.out.println(Arrays.toString(value));
	        }
	        
		}

		
		

