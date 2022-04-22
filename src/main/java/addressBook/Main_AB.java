package addressBook;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main_AB {

	 static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        System.out.println("Welcome to Address Book");
	        AD_Book_Main ad = new AD_Book_Main();
	        while (true) {
	            System.out.println("Enter what you have to do");
	            System.out.println(""
	                    + " 1 Add Contact "
	                    + "\n 2 Edit Contact "
	                    + "\n 3 Delete Contact"
	                    + " \n 4 Display Contact "
	                    + "\n 5 Search Person on basis Of State or City "
	                    + "\n 6 View Person on basis Of State or City "
	                    + "\n 7 Count of Person on basis Of State or City"
	                    + "\n 8 Sort contact on basis of Person name "
	                    + "\n 9 Sort On the basis of city,state or Zip"
	                    + "\n 10 write data to file"
	                    + "\n 11 read file"
	                    + "\n 12 Quit"
	            );

	            int userChoice = scanner.nextInt();
	            switch (userChoice) {
	                case 1:
	                	ad.addContact();
	                    break;

	                case 2:
	                    System.out.println("Enter the Phone Number");
	                    String phoneNumber = scanner.next();
	                    System.out.println("Enter the Address Book name");
	                    String bookName = scanner.next();
	                    ad.editContact(bookName, phoneNumber);
	                    break;

	                case 3:
	                    System.out.println("Enter the Phone Number");
	                    String phoneNumberToDelete = scanner.next();
	                    System.out.println("Enter the Address Book name");
	                    String bookNameToUapdate = scanner.next();
	                    ad.deleteContact(phoneNumberToDelete, bookNameToUapdate);
	                    break;

	                case 4:
	                	ad.displayContact();
	                    break;

	                case 5:
	                    System.out.println("Enter the city or state which to be searched");
	                    String searchKey = scanner.next();
	                    ad.searchPerson(searchKey);
	                    break;

	                case 6:
	                    System.out.println("Enter the city or state which to be searched");
	                    String viewKey = scanner.next();
	                    ad.viewPerson(viewKey);
	                    break;

	                case 7:
	                    System.out.println("Enter the city or state which to be searched");
	                    String searchKeyForCount = scanner.next();
	                    int count = ad.searchPerson(searchKeyForCount);
	                    System.out.println("Total Contacts are : " + count + " in " + searchKeyForCount);
	                    break;

	                case 8:
	                	ad.sortContacts();
	                    break;

	                case 9:
	                    System.out.println("How you want to sort\n1 City \n2 State \n3 Zip");
	                    int sortByWhich = scanner.nextInt();
	                    ad.sortBY(sortByWhich);
	                    break;

	                case 10:
	                	ad.writingToFile();
	                    break;

	                case 11:
	                	ad.readFile();
	                    break;

	                case 12:
	                    System.out.println("Thanks For Using Us");
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("Please Enter Proper Option");
	            }
	        }
	    }

		}