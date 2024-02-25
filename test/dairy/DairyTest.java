package dairy;

import bank.AccountNotFoundException;
import bank.InvalidPinException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DairyTest {
    private Dairy myDairy;
    @BeforeEach
    public void initializeDairy(){
        myDairy = new Dairy("userName", "password");
    }

    @Test
    public void testThatDiaryCanUnlockDiary() {
        myDairy.unlockDairy("password");
        assertFalse(myDairy.isLocked());
    }

    @Test
    public void testThatDiaryCanLockDiary() {
        Dairy myDairy = new Dairy("userName", "password");
        myDairy.lockDairy();
        assertTrue(myDairy.isLocked());
    }

    @Test
    public void testThatWhenDiaryIsTriedToBeUnlockWithWrongPinErrorIsThrown() {
        assertThrows(InvalidPinException.class,()->myDairy.unlockDairy("wrongPassword"));
        myDairy.lockDairy();
        assertTrue(myDairy.isLocked());
    }
    @Test
    public void testThatEntryCanBeCreated(){
        myDairy.createEntry("Title","Body");
        assertEquals(1, myDairy.getNumberOfEntry().size());
    }
    @Test
    public void testThatICanFindAccount(){
        myDairy.createEntry("Title","Body");
        Entry entry = myDairy.getNumberOfEntry().get(0);
        Entry expectedEntry = myDairy.findEntry(1);
        assertEquals(entry,expectedEntry);
    }
    @Test
    public void testThatICanDeleteEntry(){
        myDairy.createEntry("Title","Body");
        myDairy.deleteEntry(1);
        assertEquals(0, myDairy.getNumberOfEntry().size());
    }
    @Test
    public void testThatICanFindAccountAfterRemovingOneFromEntry(){
        myDairy.createEntry("Title","Body");
        myDairy.createEntry("Title","Body");
        myDairy.deleteEntry(1);
        myDairy.createEntry("Title","Body");
        Entry expectedEntry = null;
        for(Entry entry : myDairy.getNumberOfEntry()){
            entry.isIdValid(3);
            expectedEntry = entry;
        }
        assertEquals(expectedEntry,myDairy.findEntry(3));
    }
    @Test
    public void testThatEntryThatIsDeletedCantBeFound(){
        myDairy.createEntry("Title","Body");
        myDairy.createEntry("Title","Body");
        myDairy.deleteEntry(1);
        assertThrows(AccountNotFoundException.class,()->myDairy.findEntry(1));
    }
    @Test
    public void testThatICanUpdateEntry(){
        myDairy.createEntry("Title","Body");
        Entry entry = myDairy.findEntry(1);
        myDairy.updateEntry(1,"updatedTitle","updatedBody");
        Entry entry1 = myDairy.findEntry(1);
        assertEquals(entry1,entry);
    }

}