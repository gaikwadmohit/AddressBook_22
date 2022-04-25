package addressBook;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main_AB {
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		HashMap<String, AD_Book_Main> addressBooks = new HashMap<>();
		AD_Book_Main book1 = new AD_Book_Main();
		AD_Book_Main book2 = new AD_Book_Main();
		AD_Book_Main book3 = new AD_Book_Main();
		addressBooks.put("AddressBook1", book1);
		addressBooks.put("AddressBook2", book2);
		addressBooks.put("AddressBook3", book3);
		System.out.println("Choose your Address Book => AddressBook(1)/ AddressBook(2)/ AddressBook(3)");
		int chooseAddressBook = userInput.nextInt();
		System.out.println("Choose your Address Book => Add/Edit/Delete/DuplicateEntry/SearchPerson");
		while (chooseAddressBook >= 1) {
			System.out.println(
					"Enter Your Choice => Add Contacts (1)/Edit Contacts (2)/Delete Contacts (3)/ Check Duplicate Entry (4)/ Search person (5)");
			int choice = userInput.nextInt();
			switch (chooseAddressBook) {
			case 1:
				if (choice == 1) {
					book1.AddContactsDetails();
				} else if (choice == 2) {
					book1.editContact();
				} else if (choice == 3) {
					book1.deleteContact();
				} else if (choice == 4) {
					book1.checkDuplicateEntry();
				} else if (choice == 5) {
					book1.searchPerson();
				}
				break;
			case 2:
				if (choice == 1) {
					book2.AddContactsDetails();
				} else if (choice == 2) {
					book2.editContact();
				} else if (choice == 3) {
					book2.deleteContact();
				} else if (choice == 4) {
					book2.checkDuplicateEntry();
				} else if (choice == 5) {
					book2.searchPerson();
				}
				break;
			case 3:
				if (choice == 1) {
					book3.AddContactsDetails();
				} else if (choice == 2) {
					book3.editContact();
				} else if (choice == 3) {
					book3.deleteContact();
				} else if (choice == 4) {
					book3.checkDuplicateEntry();
				} else if (choice == 5) {
					book3.searchPerson();
				}
				break;
			default:
				System.out.println("Give proper input");
				break;
			}
			System.out.println("1) AddressBook 1");
			System.out.println("2) AddressBook 2");
			System.out.println("3) AddressBook 3");
			System.out.println("0) Exit");
			AD_Book_Main myobj = new AD_Book_Main();
//			
			try {
				myobj.IO_File();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			try {
				myobj.JSON_File();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			chooseAddressBook = userInput.nextInt();

		}
	}

}