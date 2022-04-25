package addressBook;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OpenCSVServiceProvider {

	 List<PersonContact> myUsers = new ArrayList<>();
	    public void writeData(PersonContact person, String path)  {
	        List<PersonContact> contactList = new ArrayList<>();
	        try(Reader reader = Files.newBufferedReader(Paths.get(path));){
	            CsvToBean<PersonContact> csvToBean = new CsvToBeanBuilder(reader)
	                    .withType(PersonContact.class)
	                    .withIgnoreLeadingWhiteSpace(true)
	                    .build();

	            Iterator<PersonContact> csvUserIterator = csvToBean.iterator();

	            while (csvUserIterator.hasNext()) {
	            	PersonContact contact = csvUserIterator.next();
	                System.out.println(contact.toString());
	                contactList.add(contact);
	            }
	        }
	        catch( Exception e) {
	            e.printStackTrace();
	        }
	        try(Writer writer = Files.newBufferedWriter(Paths.get(path));) {
	            contactList.add(person);
	            StatefulBeanToCsv<PersonContact> beanToCsv = new StatefulBeanToCsvBuilder(writer)
	                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
	                    .build();

	            beanToCsv.write(contactList);
	        }
	        catch( Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public long readData(String path) {
	        long count  =0;
	        try (
	                Reader reader = Files.newBufferedReader(Paths.get(path));
	        ) {
	            CsvToBean<PersonContact> csvToBean = new CsvToBeanBuilder(reader)
	                    .withType(PersonContact.class)
	                    .withIgnoreLeadingWhiteSpace(true)
	                    .build();

	            Iterator<PersonContact> csvUserIterator = csvToBean.iterator();

	            while (csvUserIterator.hasNext()) {
	            	PersonContact Person = csvUserIterator.next();
	                System.out.println(Person);
	                count++;
	            }
	        }
	        catch( IOException e) {
	            e.printStackTrace();
	        }
	        return count;
	    }
	}

