package dairy;

import bank.AccountNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DairiesTest {
    private Dairies dairies;

    @BeforeEach
    public void initializeDairies(){
        dairies = new Dairies();
    }
    @Test
    public void testThatICanAddDiary(){
        dairies.add("userName","password");
        assertEquals(1,dairies.getNumberOfDiaries().size());
    }
    @Test
    public void testThatICanFindDairyWithUserName(){
        dairies.add("userName","password");
        Dairy dairy = dairies.findByUserName("userName");
        assertEquals(dairy,dairies.getNumberOfDiaries().get(0));
    }
    @Test
    public void testThatICanDeleteDairy(){
        dairies.add("userName","password");
        dairies.add("username1","password");
        assertEquals(2,dairies.getNumberOfDiaries().size());
        dairies.delete("username1","password");
        assertEquals(1,dairies.getNumberOfDiaries().size());
    }
    @Test
    public void testWhenFindingDiaryThatHasBeenDeletedErrorMessageIsThrown(){
        dairies.add("userName","password");
        dairies.add("username1","password");
        assertEquals(2,dairies.getNumberOfDiaries().size());
        dairies.delete("username1","password");
        assertThrows(AccountNotFoundException.class,()->dairies.findByUserName("userName1"));
    }

}