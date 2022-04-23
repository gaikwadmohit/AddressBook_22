package addressBook;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main_AB {

	 static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	 System.out.println("Welcome to Address Book System");
	         Map<String, AD_Book_Main> map = new HashMap<>();
	         System.out.println("Enter Number of address book you want to add");
	         Integer count = scanner.nextInt();
	         Integer i = 0;
	         while (i < count) {
	             System.out.println("Enter  book name");
	             String bookName = scanner.next();
	             AD_Book_Main addressBook = new AD_Book_Main();
	             addressBook.operation();
	             map.put(bookName, addressBook);
	             i++;
	         }
	         System.out.println(map);


	     }

	 }