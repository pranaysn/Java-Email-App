package emailapp;

import java.util.Scanner;

public class Email {
	// user need to hv access on below data i.e declaring as private means
	// encapsulation
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String company;
	private int mailBoxCapacity = 500;
	private String alternetEmail;
	private int defaultPasswordLength = 10;
	private String email;
	private String companyName = "prlimited.com";
	private int enter = 0;

	// Constructor to receive first and last names
	//
	public Email() {
		System.out.println("Welcome to email generator application. \nPress 1 to continue.");

//		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);



		// call method asking for department - return department

		// this.department = setDepartment();
		// System.out.println("Department: " + this.department);

		// call randompassword method which return password
		// this.password = randomPassword(defaultPasswordLength);
//		System.out.println("Your new password : " + this.password);

		// combine elements to generate email

//		System.out.println("Your new email : " + email);

		// return mailbox capacity
//		System.out.println("Mail Box Capacity : " + mailBoxCapacity);

		// return alternet mail

		// System.out.println(al);
	}

	// Ask for department
//	public void workFlow() {
//
//		Scanner in = new Scanner(System.in);
//		if (this.enter == 1) {
//
//			System.out.println("Enter first name: ");
//			this.firstName = in.nextLine();
//			System.out.println("Enter last name: ");
//			this.lastName = in.nextLine();
//
//
//		}
//	}

	public int flow() {
		int c = 0;
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();

		if (c == 1) {
			work();
		}
		return 0;
	}

	public void work() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter last name: ");
		String lastName = sc.nextLine();

		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "."
				+ companyName;

	}

	private String setDepartment() {
		System.out.println(
				"DEPARTMENT CODES: \n1. Sales \n2. Developement \n3. Accounts \n4. None \nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int departChoice = in.nextInt();
		switch (departChoice) {
		case 1:
			return "Sales";
		case 2:
			return "Dev";
		case 3:
			return "Accounts";
		default:
			return "";
		}

	}

	// Generate random password

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ1234567890!@$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
//			System.out.println(rand);
//			System.out.println(passwordSet.charAt(rand));
		}

		return new String(password);
	}

	// mailbox capacity

	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;

	}

	// set alternate email
	public void setAltMail(String altMail) {
		this.alternetEmail = altMail;
	}

	// change password
	public void changePassword(String password) {
		this.password = password;
	}

	// getters for setters methods
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public String getAltMail() {
		return alternetEmail;
	}

	public String getChangePassword() {
		return password;
	}
// printing all info namem, email, mailbox capacity

	public String showInfo() {
		return "NAME: " + firstName + " " + lastName + "\nDEPARTMENT: " + department + "\nCOMPANY E-mail: " + email
				+ "\nMAIL BOX CAPACITY: " + mailBoxCapacity;
	}



//

}
