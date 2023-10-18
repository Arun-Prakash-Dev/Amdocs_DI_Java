package com.training.adi;

import java.util.*;
import java.util.stream.Stream;


public class Phonebook {
	static Scanner scan = new Scanner(System.in);

	static Validate val = new Validate();
	
	static List<Contact> phoneBook = new ArrayList<>();
	public static void main(String[] args) {
		
		
		dummy();
		while(true) {
			
			System.out.println("-------------------------");
			System.out.println("--------PhoneBook--------");
			System.out.println("Press 1: To add a contact");
			System.out.println("Press 2: To search a Phonebook");
			System.out.println("Press 3: To update a contact");
			System.out.println("Press 4: To delete a contact");
			System.out.println("Press 5: To Exit");
			System.out.print("Choose your option: ");
			char choice = scan.next().charAt(0);
			if(choice == '5') {
				break;
			}
			
			switch(choice) {
			case '1': createContact();
			break;
			
			case '2': System.out.println(search().toString());
			break;
			
			case '3': update();
			break;
			
			case '4': delete();
			
			case '5': break;
			
			default: System.out.println("Invalid Choice!!");
			break;
			}
			
			System.out.println("-----CONTACTS-----");
			for(Contact c : phoneBook) {
				System.out.println(c.toString());
			}
			System.out.println("-----CONTACTS-----");
		}
	}
	
	static void dummy() {
		
		phoneBook.add(new Contact("Arun","9746557554","arunedappal5@gmail.com"));
		phoneBook.add(new Contact("Kannan","8848391312","arun.9746557554@gmail.com"));
		
	}
	
	static void createContact() {
		try {
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			String number;
			while(true) {
				System.out.print("Number: ");
				number = scan.nextLine();
				if(val.validateMobileNumber(number)) {
					break;
				}else {
					System.out.println("Invalid Mobile Number");
				}
			}
			System.out.print("Email: ");
			String email = scan.nextLine();
			phoneBook.add(new Contact(name, number, email));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	static Contact search() {
		try {
			System.out.print("Enter the name: ");
			scan.nextLine();
			String name = scan.nextLine();
			for(Contact c : phoneBook) {
				if(c.getName().equals(name)) {
					return c;
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		return null;
		
	}
	
	static void update() {
		try {
		
			while(true) {
				
				System.out.println("Press A: To update the name");
				System.out.println("Press B: To update the number");
				System.out.println("Press C: To update the email");
				
				char choice = scan.next().charAt(0);
				switch(choice) {
				case 'A': updateName();
				break;
				case 'B': updateNumber();
				break;
				case 'C': updateEmail();
				break;
				default: break;
				}
				break;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
	static void updateName() {
		try {
			Contact c = search();
			
			for(Contact i : phoneBook) {
				if(i.getName().equals(c.getName())) {
					System.out.print("Enter the new name to be updated: ");
					String name = scan.nextLine();
					i.setName(name);
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
	static void updateNumber() {
		try {
			Contact c = search();
			
			for(Contact i : phoneBook) {
				if(i.getName().equals(c.getName())) {
					
					String number;
					while(true) {
						System.out.print("Enter the new number to be updated: ");
						number = scan.nextLine();
						if(val.validateMobileNumber(number)) {
							break;
						}else {
							System.out.println("Invalid Mobile Number");
						}
					}
					i.setNumber(number);
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	static void updateEmail() {
		try {
			Contact c = search();
			
			for(Contact i : phoneBook) {
				if(i.getName().equals(c.getName())) {
					String email;
					while(true) {
						System.out.print("Enter the new email to be updated: ");
						email = scan.nextLine();
						if(val.validateEmail(email)) {
							break;
						}else {
							System.out.println("Invalid Email ID");
						}
					}
					i.setEmail(email);
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	static void delete() {
		try {
			System.out.print("Enter the name to be deleted: ");
			scan.nextLine();
			String name = scan.nextLine();
			for(Contact c : phoneBook) {
				if(c.getName().equals(name)) {
					phoneBook.remove(c);
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	

	
	
}
