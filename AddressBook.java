import java.io.*;
import java.util.Scanner;

public class AddressBook {

    private Contact[] friends; // An array of Contacts - each stores info for one friend
    private int numfriends; // Number of friends currently in AddressBook

    // Create an empty AddressBook
    public AddressBook() {
		friends = new Contact[10];
		numfriends = 0;
    }
	public void addContact(Contact c) {
 		friends[numfriends] = c;
 		numfriends++;
 	}
 	public void printContacts(){
 		for(Contact cc: AddressBook)
 			friends[cc].printContact();
 	}
	public int numContacts(){
		return numfriends;
	}
	public int haveContact(String s){
		for (int i = 0; i<numfriends; i++)
		{
			if(friends[i].getName().equals(s)
			   {
				   return i;
			   }
		}
		return -1;
	}
	public int delete(String s){
		for (int i = 0; i<numfriends; i++)
		{
			if(friends[i].getName().equals(s)
			   {
				   return i;
				   int temp = friends[friends.length-1];
				   friends[friends.length-1] = friends[1];
				   friends[i] = temp;
				   numfriends --;
			   }
		}
	public static void main(String[] args){
		Scanner scan = new Scanner(system.in);
		AddressBook syrup = new AddressBook()
		syrup.menu();
		int choice = scan.nextInt();
		if(choice == 1) {
			syrup.addContact();
		}
		if(choice == 2) {
			syrup.delete();
		}
		if(choice == 3) {
			System.out.println("You have " + syrup.numContacts() + " friends");
		}
		if(choice == 4) {
			syrup.printContacts();	
		}
		if(choice == 5) {
		}
	}
			   
	public static void menu(){
		System.out.println("1. Add a contact");
		System.out.println("2. Delete a contact");
		System.out.println("3. Print the number of contacts");
		System.out.println("4. Print all contacts");
		System.out.println("5. Quit");
		System.out.println("Enter your choice: ");
	}





		
			   
		
