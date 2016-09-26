package org.appsquad.util;

public class ArrayTest {
	
	public static void main(String[] args) {
	
		Student[] arr = new Student[10]; // creating student array of size 10
		
		/*arr[0] = new Student(); // creating student object and assigning first students id in this way 
		arr[0].id = 1;*/
		
		/**
		 * we can create several student object using for loop 
		 * 
		 * */
		
		for(int i= 0; i<arr.length; i++){
			arr[i] = new Student(); // creating student object
		}
		
		arr[0].id = 1;
		arr[0].name = "a";
		arr[0].subject = "phy";
		
		arr[0].id = 2;
		arr[0].name = "b";
		arr[0].subject = "chem";
		
		arr[0].id = 3;
		arr[0].name = "c";
		arr[0].subject = "math";
		
		arr[0].id = 4;
		arr[0].name = "d";
		arr[0].subject = "bios";
		
		arr[0].id = 5;
		arr[0].name = "e";
		arr[0].subject = "zoo";
		
		arr[0].id = 6;
		arr[0].name = "f";
		arr[0].subject = "bota";
		
		arr[0].id = 7;
		arr[0].name = "g";
		arr[0].subject = "ece";
		
		arr[0].id = 8;
		arr[0].name = "h";
		arr[0].subject = "cse";
		
		arr[0].id = 9;
		arr[0].name = "i";
		arr[0].subject = "it";
		
		arr[0].id = 10;
		arr[0].name = "j";
		arr[0].subject = "bt";
		
		/*arr[0].id = 1;
		arr[0].name = "a";
		arr[0].subject = "phy";*/
		
	}

}

class Student{
	int id;
	String name;
	String subject;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	/*public Student(int i, String n, String s) {
		id = i;
		name = n;
		subject = s;
	}*/

	
	/*@Override
	public String toString() {
		
		return "[ " +id  + " - " +name + " - " + subject +" ] "  ;
	}*/
}
