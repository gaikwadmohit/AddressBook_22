import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import addressBook.AD_Book_Main;
import addressBook.IOService;
import addressBook.PersonContact;





	public class AddressBookTest {
	    PersonContact person1;
	    PersonContact person2;
	    @Before
	    public void initialize() {
	        person1 = new PersonContact();
	        person1.setFirstName("Mohit");
	        person1.setLastName("Gaikwad");
	        person1.setAddress("Nagpur");
	        person1.setCity("Nagpur");
	        person1.setState("Maharashtra");
	        person1.setPinCode(411043);
	        person1.setPhoneNumber("8830602356");
	        person1.setEmail("mohitgaikwad@gmail.com");

	        person2 = new PersonContact();
	        person2.setFirstName("Monu");
	        person2.setLastName("Sonu");
	        person2.setAddress("Nagpur");
	        person2.setCity("Ahmednagar");
	        person2.setState("Maharashtra");
	        person2.setPinCode(416307);
	        person2.setPhoneNumber("8856043932");
	        person2.setEmail("abc@gmail.com");
	    }


	    @Test
	    public void givenAContact_WhenAddedToList_ShouldReturnCorrectSize() {
	    	AD_Book_Main addressBook = new AD_Book_Main();
	        addressBook.addPerson(person1, IOService.LIST_DS_IO);
	        addressBook.addPerson(person2, IOService.LIST_DS_IO);
	        Assert.assertEquals(2,addressBook.referenceBook.size());
	    }

	    @Test
	    public void givenAContact_WhenAddedToFile_ShouldReturnCorectSize() {
	    	AD_Book_Main addressBook = new AD_Book_Main();
	        addressBook.addPerson(person1, IOService.LIST_DS_IO);
	        addressBook.addPerson(person2, IOService.LIST_DS_IO);
	        long size = 0;
	        try {
	            size = Files.lines(Paths.get("AddressBook-file.txt")).count();
	        }
	        catch(Exception e) {
	            e.printStackTrace();
	        }
	        Assert.assertEquals(2,size);
	    }

	    @Test
	    public void whenCalled_ReadFromListMethod_ShouldPrintList() {
	    	AD_Book_Main addressBook = new AD_Book_Main();
	        addressBook.addPerson(person1, IOService.LIST_DS_IO);
	        addressBook.addPerson(person2, IOService.LIST_DS_IO);
	        long size  = addressBook.readData(IOService.LIST_DS_IO);
	        Assert.assertEquals(2,size);
	    }

	    @Test
	    public void whenCalled_ReadFromFileMethod_ShouldPrintFile() {
	        AD_Book_Main addressBook = new AD_Book_Main();
	        addressBook.addPerson(person1, IOService.LIST_DS_IO);
	        addressBook.addPerson(person2, IOService.LIST_DS_IO);
	        long size  = addressBook.readData(IOService.LIST_DS_IO);
	        Assert.assertEquals(2,size);
	    }
	
	

}
