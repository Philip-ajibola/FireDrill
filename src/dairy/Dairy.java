package dairy;

import bank.AccountNotFoundException;
import bank.InvalidPinException;

import java.util.ArrayList;

public class Dairy {
    private String userName;
    private String password;
    private boolean islocked = true;
    private final ArrayList<Entry> entries;
    private  int idNumber;

    public Dairy(String userName, String password) {
        this.userName = userName;
        this.password = password;
        entries = new ArrayList<>();
    }

    public void unlockDairy(String password) {
        if(isPinNotValid(password))throw new InvalidPinException("Invalid Password");
        islocked = false;
    }

    public  boolean isPinNotValid(String password) {
        return !this.password.equals(password);
    }

    public boolean isLocked() {
        return islocked;
    }

    public void lockDairy() {
        islocked = true;
    }

    public void createEntry(String title, String body) {
       int id =  generateEntryId();
       Entry entry = new Entry(id,title,body);
       entries.add(entry);

    }

    private int generateEntryId() {
      return ++idNumber;
    }
    public ArrayList<Entry> getNumberOfEntry(){
        return entries;
    }

    public void deleteEntry(int idNumber) {
        Entry entry = findEntry(idNumber);
        entries.remove(entry);
    }

    public Entry findEntry(int i) {
        Entry expectedEntry = null;
        for(Entry entry: entries) {
            if(entry.isIdValid(i)) expectedEntry = entry;
        }
        if(expectedEntry==null) throw new AccountNotFoundException("Entry not found");
        return expectedEntry;

    }

    public void updateEntry(int idNumber, String updatedTitle, String updatedBody) {
        Entry entry = findEntry(idNumber);
        for(Entry entry1: entries) {
            if(entry==entry1) {
                entry1.updateTitle(updatedTitle);
                entry1.updateBody(updatedBody);
            }
        }
    }

    public String getUserName() {
        return userName;
    }
    public int getIdNumber(String title){
        int entryId = 0;
        for(Entry entry: entries) if(title.equals(entry.getTitle()))entryId = entry.getId();
        return entryId;
    }
}
