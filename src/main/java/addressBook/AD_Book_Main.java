package addressBook;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class AD_Book_Main {
	

    static Scanner sc = new Scanner(System.in);
    static List<PersonContact> list = new ArrayList<PersonContact>();

    //Created method for adding contact
    public static void addContact()
    {
        System.out.println("Enter your firstName : ");
        String firstName = sc.nextLine();
        System.out.println("Enter your lastName : ");
        String lastName = sc.nextLine();
        System.out.println("Enter your address : ");
        String address = sc.nextLine();
        System.out.println("Enter your city : ");
        String city = sc.nextLine();
        System.out.println("Enter your state : ");
        String state = sc.nextLine();
        System.out.println("Enter your zipCode : ");
        String zip = sc.nextLine();
        System.out.println("Enter your phoneNo : ");
        long phoneNo = sc.nextLong();
        System.out.println("Enter your emailId : ");
        String email = sc.nextLine();
        PersonContact obj = new PersonContact(firstName, lastName, address, city, state, zip, phoneNo, email);
        list.add(obj);
    }

  /*  //Created method for editing contact details
    public static void editContact() {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                list.remove(i);
                addContact();
            } else {
                System.out.println("No data found in Address Book");
            }
        }
    }*/

 /*   //Creating deleteContact() for deleting contact details using first name
    public static void deleteContact() {
        System.out.println("Enter first name : ");
        String firstName = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                list.remove(i);
            } else {
                System.out.println("No data found");
            }
        }
    }*/

    //Adding Multiple persons i.e contacts in address book
    public static void addPersons() {
        System.out.println("Enter number of persons added to be in address book : ");
        int noOfPersons = sc.nextInt();
        int count  = 1;
        while (count <= noOfPersons) {
            addContact();
            count++;
        }
    }

    public static void main(String[] args) {

    	AD_Book_Main addressBook = new AD_Book_Main();
        //Displaying the welcome message
        System.out.println("WELCOME TO ADDRESS BOOK PROBLEM");
        //adding multiple persons
        addPersons();
        System.out.println(list); //printing list
    }

}     