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
	    for (int i=0;i<numfriends; i++){
		    friends[i].printContact();
		  }
    }
    public int numContacts(){
        return numfriends;
    }
    public int haveContact(String s){
        for (int i = 0; i<numfriends; i++)
        {
            if(friends[i].getName().equals(s))
               {
                   return i;
               }
        }
        return -1;
    }
    public int delete(String s){
                    int temp = haveContact(s);
                    friends[temp] = friends[friends.length-1];
                    numfriends -- ;
                    return haveContact(s);

                  
        
     }
   
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        AddressBook syrup = new AddressBook();
        syrup.menu();
        int choice = scan.nextInt();
        while (choice!= 5){
        if(choice == 1) {
            
            System.out.println("What's the name?");
                String name = scan.next();
            System.out.println("What's the age?");
                int age = scan.nextInt();
            System.out.println("What's the phone number?");
                int number = scan.nextInt();
            System.out.println("What's the birthday month?");
                int month = scan.nextInt();
            System.out.println("What's the birthday day?");
                int day = scan.nextInt();
                
            Contact c = new Contact(name, age, number, month, day);
            
            syrup.addContact(c);
            
            
        }
        if(choice == 2) {
            System.out.println("Which contact would you like to delete?");
                String delname = scan.next();
            syrup.delete(delname);
        }
        if(choice == 3) {
            System.out.println("You have " + syrup.numContacts() + " friends");
        }
        if(choice == 4) {
            syrup.printContacts();  
        }
        syrup.menu();
        choice = scan.nextInt();
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
}
