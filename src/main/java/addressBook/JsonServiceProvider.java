package addressBook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class JsonServiceProvider {

	 public void writeData(PersonContact person, String path) {
	        try {
	            Gson gson = new Gson();
	            BufferedReader br = new BufferedReader(new FileReader(path));
	            List<PersonContact> contacts = gson.fromJson(br, new TypeToken<List<PersonDetails>>() {}.getType());
	            if(contacts == null) {
	                contacts = new ArrayList<>();
	                contacts.add(person);
	            }
	            else contacts.add(person);
	            String json = gson.toJson(contacts);
	            System.out.println(json);
	            FileWriter writer = new FileWriter(path);
	            writer.write(json);
	            writer.close();
	        }
	        catch(IOException e) {
	            e.printStackTrace();
	        }

	    }

	    public long readData(String path) {
	        long count =0;
	        try {
	            Gson gson = new Gson();
	            BufferedReader br = new BufferedReader(new FileReader(path));
	            PersonContact[] usrObj = gson.fromJson(br, PersonContact[].class);
	            List<PersonContact> csvUSerList = Arrays.asList(usrObj);
	            System.out.println(csvUSerList);
	            count = csvUSerList.size();
	        }
	        catch(IOException e) {
	            e.printStackTrace();
	        }
	        return count;
	    }
	}

