import dataStructure.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    private ArrayList myList;

    @BeforeEach
    public void initializeArrayList(){
        myList = new ArrayList();
    }
    @Test
    public void testThatListIsNotEmpty(){
        assertTrue(myList.isEmpty());
    }
    @Test
    public void testThatICanAddToMyList(){
        assertTrue(myList.isEmpty());
        myList.add("dayo");
        assertFalse(myList.isEmpty());
    }
    @Test
    public void testThatICanAddElement(){
        assertTrue(myList.isEmpty());
        myList.add("philip");
        myList.add("dayo");
        assertFalse(myList.isEmpty());
    }
    @Test
    public void testThatICanRemoveElement(){
        assertTrue(myList.isEmpty());
        myList.add("dayo");
        myList.remove("dayo");
        assertTrue(myList.isEmpty());
    }
    @Test
    public void testThatICanRemoveAnElementOutOfListOfTwoELement(){
        assertTrue(myList.isEmpty());
        myList.add("dayo");
        myList.add("philip");
        myList.remove("dayo");
        assertFalse(myList.isEmpty());

    }
    @Test
    public void testThatResizeFunctionWorksWell(){
        String element = "philip";
        myList.add("philip");
        myList.add("dayo");
        myList.add("moh");
        myList.resizeArray(element);

        assertEquals(4,myList.size());
    }
    @Test
    public void testThatICanGetElementInAListWithTheIndex(){
        assertTrue(myList.isEmpty());
        myList.add("dayo");
       // myList.remove("dayo");
        myList.add("philip");
        String result = myList.get(1);
        assertEquals("dayo",result);


    }
    @Test
    public void testThatICantGetElementInAListWhenListIsEmpty(){
        assertTrue(myList.isEmpty());

        assertThrows(IllegalArgumentException.class,()->myList.get(3));

    }
    @Test
    public void testThatICanGetElementInListWithTheElementName(){
        assertTrue(myList.isEmpty());
        myList.add("dayo");
        myList.add("philip");
        String result = myList.get("dayo");
        assertEquals("dayo",result);
        assertThrows(IllegalArgumentException.class,()->myList.get("moh"));

    }
    @Test
    public void testThatICanGetTheSizeOfTheList(){
        assertTrue(myList.isEmpty());
        myList.add("dayo");
        myList.add("philip");
        int result = myList.size();
        assertEquals(2,result);
        myList.remove("dayo");
        result = myList.size();
        assertEquals(1,result);

    }
    @Test
    public void testThatICanRemoveElementInListWithElementValue(){
        assertTrue(myList.isEmpty());
        myList.add("dayo");
        myList.add("philip");
        assertThrows(IllegalArgumentException.class, ()-> myList.remove("moh"));

    }
    @Test
    public void testThatICanDisPlayList(){
        assertTrue(myList.isEmpty());
        myList.add("dayo");
        myList.add("philip");
        String result = myList.toString();
        assertEquals("[dayo, philip]",result);
       // assertThrows(IllegalArgumentException.class, ()-> myList.remove("moh"));
    }
    @Test
    public void testThatFunctionGiveNumberOfEmptySpaceInSet() {
        String[] array = {"philip", null, "josh", "gabriel", null, "rebecca"};
        assertEquals(2, myList.giveNumberOfNull(array));
    }

    @Test
    public void testThatFunctionGiveArrayThatCoOtherArrayWithoutPuttingNullElement() {
        String[] array = {"philip", null, "josh", "gabriel", null, "rebecca"};
        String[] expected = {"philip", "josh", "gabriel", "rebecca"};
        assertArrayEquals(expected, myList.giveActualLength(array));
    }
    @Test
    public void testThatICanDisPlayListWhenIRemoveAnElement(){
        assertTrue(myList.isEmpty());
        myList.add("dayo");
        myList.add("philip");
        myList.remove("philip");
        String result = myList.toString();
        assertEquals("[dayo" +
                "]",result);
        // assertThrows(IllegalArgumentException.class, ()-> myList.remove("moh"));
    }
    @Test
    public void testThatICanAddMoreElement(){
        assertTrue(myList.isEmpty());
        myList.add("philip");
        myList.add("dayo");
        myList.add("moh");
        myList.add("bolaji");
        myList.add("micheal");
        assertEquals(5,myList.size());

    }

    @Test
    public void testThatICanAddMoreElementAndRemoveTwoElement(){
        assertTrue(myList.isEmpty());
        myList.add("philip");
        myList.add("dayo");
        myList.add("moh");
        myList.add("bolaji");
        myList.add("micheal");
        myList.remove("micheal");
        String expected = "[philip, dayo, moh, bolaji]";
        assertEquals(4,myList.size());
        assertEquals(expected,myList.toString());

    }
    @Test
    public void testThatWhenIHaveDuplicateAndIRemoveAll_AllTheElementIsRemoved(){
        assertTrue(myList.isEmpty());
        myList.add("philip");
        myList.add("dayo");
        myList.add("moh");
        myList.add("bolaji");
        myList.add("philip");
        myList.removeAll("philip");
        String expected = "[dayo, moh, bolaji]";
        assertEquals(3,myList.size());
        assertEquals(expected,myList.toString());

    }
    @Test
    public void testThatICanCheckIfAnElementExistInAList(){
        assertTrue(myList.isEmpty());
        myList.add("philip");
        myList.add("dayo");
        myList.add("moh");
        myList.add("bolaji");
        myList.add("philip");
        assertFalse(myList.contain("josh"));


    }
    @Test
    public void testThatICanCheckICanInsertInMyList(){
        assertTrue(myList.isEmpty());
        myList.add("philip");
        myList.add("dayo");
        myList.add("moh");
        myList.add("bolaji");
        myList.insert("josh",2);
        assertTrue(myList.contain("josh"));
    }
    @Test
    public void testThatICanCheckICanInsertInMyLisIndexOfTheOfTheElementInsert() {
        assertTrue(myList.isEmpty());
        myList.add("philip");
        myList.add("dayo");
        myList.add("moh");
        myList.add("bolaji");
        myList.insert("josh", 2);
        assertTrue(myList.contain("josh"));
        assertEquals(1, myList.getIndex("dayo"));
    }
    @Test
    public void testThatWhenIClearAList_TheListIsEmpty(){
        assertTrue(myList.isEmpty());
        myList.clear();
        String result = myList.toString();
        assertEquals("[]",result);
    }
}
