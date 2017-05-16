
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by rahmirford on 5/16/17.
 */
public class Phonebook {
    private String name;
    private String phoneNumber;

    public Phonebook(){}


    Scanner scanner = new Scanner(System.in);

    public TreeMap<String, String> phonebookMap = new TreeMap<String, String>();

    public String lookUpNumber(String name){
        String entryNumber = phonebookMap.get(name);
        return entryNumber;
    }

    public void receiveContact(){
        name = scanner.nextLine();
        phoneNumber = scanner.nextLine();
    }

    public TreeMap<String, String> addContactInfo(String name, String phoneNumber){
        phonebookMap.put(name, phoneNumber);
        return phonebookMap;
    }

    public void removeNumber(String name){

    }

    public Map<String, String> listAllEntries(){
        return phonebookMap;
    }

    public TreeMap<String, String> getPhonebookMap() {
        return phonebookMap;
    }


//    public Map<String,String> sortPhonebookEntries(){
//        return phonebook;
//    }
}
