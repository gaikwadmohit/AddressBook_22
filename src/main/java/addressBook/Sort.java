package addressBook;

import java.util.Comparator;

public class Sort {
	PersonContact contacts = new PersonContact();
    static Comparator<PersonContact> compareCity = new Comparator<>() {
        public int compare(Contacts one, Contacts two) {
            return one.getCity().compareTo(two.getCity());
        }
    };
    static Comparator<PersonContact> compareState = new Comparator<>() {
        public int compare(Contacts one, Contacts two) {

            return one.getState().compareTo(two.getState());
        }
    };
    static Comparator<PersonContact> compareFirstName = new Comparator<>() {
        public int compare(Contacts one, Contacts two) {
            return one.getFirstName().compareTo(two.getFirstName());
        }
    };
    static Comparator<PersonContact> compareZip = new Comparator<>() {
        public int compare(Contacts one, Contacts two) {
            return one.getZip().compareTo(two.getZip());
        )
 


