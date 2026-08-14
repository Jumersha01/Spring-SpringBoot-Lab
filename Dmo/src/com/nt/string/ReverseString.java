package com.nt.string;

public class ReverseString {

	public static void main(String[] args) {
		String str = IO.readln("Enter Any String:");
	         
		 String reverse ="";
		 String arr[] = str.split(" ");
//		 for(int i=arr.length-1;i>=0;i--) {
//			 reverse+=arr[i]+" ";
//		 }
		 
		 for(int i =0;i<arr.length;i++) {
			 
			 for(int j =arr[i].length()-1;j>=0;j--) {
				 reverse+=arr[i].charAt(j);
			 }
			 reverse+=" ";
			 
		 }
		 
		 IO.println(reverse);
	}

}
