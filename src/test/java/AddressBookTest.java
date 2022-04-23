
import org.junit.Assert;
import org.junit.Test;

import addressBook.AD_Book_Main;
import addressBook.PersonContact;

import java.util.ArrayList;
import java.util.List;

public class AddressBookTest {
    private static final String PATH_TXT="./src/main/resources/temp.txt";
    @Test
    public void givenContactsEntries_WhenWrittenToFileShouldMatchAddressEntries() {
        List<PersonContact> contactsList = new ArrayList<>();
        contactsList.add(new PersonContact("Rajendra", "Gund", "Shirdi", "Ahmednagar", "Maharashtra", 414501l, 9604315270l, "rajendra@gmail.com"));
        contactsList.add(new PersonContact("Shushant", "lad", "pune", "Pune", "Maharashtra", 41414l, 888876453l, "shushant@gmail.com"));
        AD_Book_Main addressBook=new AD_Book_Main(contactsList);
        addressBook.writeFileData(PATH_TXT);
    }
    @Test
    public void givenContactsEntries_WhenReadingTotalFileShouldMatch(){
    	AD_Book_Main service=new AD_Book_Main();
        long entries=service.readFile(PATH_TXT);
        Assert.assertEquals(2,entries);
    }

}