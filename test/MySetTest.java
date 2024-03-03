import dataStructure.MySet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {
    private MySet set;

    @BeforeEach
    public void initializeMySet() {
        set = new MySet();
    }

    @Test
    public void testThatMySetIsEmpty() {
        assertTrue(set.isEmpty());
    }

    @Test
    public void testThatICanGetSizeOfMySet() {
        int size = set.size();
        assertEquals(0, size);
    }

    @Test
    public void testThatICanIAddElementToMySet() {
        set.add("philip");
        assertEquals(1, set.size());
    }

    @Test
    public void testThatICanRemoveElementInList() {
        set.add("philip");
        set.remove("philip");
        assertEquals(0, set.size());

    }
    @Test
    public void testThatResizeFunctionWorksWell(){
        String element = "josh";
        set.add("philip");
        set.add("dayo");
        set.add("moh");
        set.resizeArray(element);

        assertEquals(4,set.size());
    }

    @Test
    public void testThatICanAddMoreElementToMySet() {
        assertTrue(set.isEmpty());
        set.add("philip");
        set.add("dayo");
        assertEquals(2, set.size());
    }

    @Test
    public void testThatICanAddElementWhenItsNotInTheList() {
        assertTrue(set.isEmpty());
        set.add("josh");
        set.add("dayo");
        assertFalse(set.add("josh"));
        assertEquals(2, set.size());
    }

    @Test
    public void testThatIWhenIRemoveAnElementThatDoesNotExistInList_ResultIsFalse() {
        assertTrue(set.isEmpty());
        set.add("philip");
        set.add("dayo");
        assertFalse(set.remove("josh"));
        assertEquals(2, set.size());
    }

    @Test
    public void testThatICanMultipleElementInMySet() {
        assertTrue(set.isEmpty());
        set.add("philip");
        set.add("dayo");
        set.add("josh");
        assertTrue(set.add("mike"));
        assertTrue(set.add("victor"));
        assertFalse(set.add("dayo"));
        assertEquals(5, set.size());
    }

    @Test
    public void testThatICanRemovePresentInSet() {
        assertTrue(set.isEmpty());
        set.add("philip");
        set.add("dayo");
        set.add("josh");
        set.add("mike");
        set.add("victor");
        assertTrue(set.remove("philip"));
        assertEquals(4, set.size());
    }

    @Test
    public void testThatSetContainAnElement() {
        assertTrue(set.isEmpty());
        set.add("philip");
        set.add("dayo");
        set.add("josh");
        set.add("mike");
        set.add("victor");
        assertTrue(set.contain("philip"));
        assertEquals(5, set.size());
    }

    @Test
    public void testThatSetDoesNotContainAnElement() {
        assertTrue(set.isEmpty());
        set.add("philip");
        set.add("dayo");
        set.add("josh");
        set.add("mike");
        set.add("victor");
        assertFalse(set.contain("micheal"));
        assertEquals(5, set.size());
    }

    @Test
    public void testThatSetAreMovedToArray() {
        assertTrue(set.isEmpty());
        set.add("philip");
        set.add("dayo");
        set.add("josh");
        set.add("mike");
        set.add("victor");
        String[] array = set.toArray();
        String[] expected = {"philip", "dayo", "josh", "mike", "victor"};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testThatFunctionGiveNumberOfEmptySpaceInSet() {
        String[] array = {"philip", null, "josh", "gabriel", null, "rebecca"};
        assertEquals(2, set.giveNumberOfNull(array));
    }

    @Test
    public void testThatFunctionGiveArrayThatCoOtherArrayWithoutPuttingNullElement() {
        String[] array = {"philip", null, "josh", "gabriel", null, "rebecca"};
        String[] expected = {"philip", "josh", "gabriel", "rebecca"};
        assertArrayEquals(expected, set.giveActualLength(array));
    }

    @Test
    public void testThatSetContainAllElementInAnotherCollection() {
        MySet set1 = new MySet();
        set1.add("philip");
        set1.add("dayo");
        set1.add("orisha");

        set.add("philip");
        set.add("dayo");
        set.add("orisha");
        assertTrue(set.containAll(set1));
    }

    @Test
    public void testThatWhenSetDoesNotContainAllElementInCollectionItReturnFalse() {
        MySet set1 = new MySet();
        set1.add("philip");
        set1.add("dayo");
        set1.add("orisha");

        set.add("philip");
        set.add("dayo");
        set.add("glory");
        assertFalse(set.containAll(set1));
    }

    @Test
    public void testThatICanAddAllElementInAnotherSetToMySet() {
        MySet set1 = new MySet();
        set1.add("joel");
        set1.add("praise");
        set1.add("mike");

        set.add("philip");
        set.add("dayo");
        set.add("glory");
        assertTrue(set.addAll(set1));
        assertEquals(6, set.size());

    }

    @Test
    public void testThatICanAddAllElementInAnotherSetToMySetTwo() {
        MySet set1 = new MySet();
        set1.add("joel");
        set1.add("praise");
        set1.add("mike");

        set.add("philip");
        set.add("mike");
        set.add("glory");
        assertTrue(set.addAll(set1));
        assertEquals(5, set.size());

    }
    @Test
    public void testThatICanRemoveAllElementThatAppearInFirstSetAndInTheOtherSet() {
        MySet set1 = new MySet();
        set1.add("philip");
        set1.add("praise");
        set1.add("mike");

        set.add("philip");
        set.add("mike");
        set.add("glory");
        assertTrue(set.removeAll(set1));
        assertEquals(1, set.size());

    }
    @Test
    public void testThatICanRemoveAllElementThatAppearInFirstSetAndInTheOtherSetTwo() {
        MySet set1 = new MySet();
        set1.add("philip");
        set1.add("praise");
        set1.add("mike");

        set.add("daniel");
        set.add("josh");
        set.add("glory");
        assertFalse(set.removeAll(set1));
        assertEquals(3, set.size());
    }
    @Test
    public void testThatICanRetainAllTheElementsInFirstSetAndRemoveTheRestInTheOtherSet(){
        MySet set1 = new MySet();
        set1.add("philip");
        set1.add("praise");
       // set1.add("mike");

        set.add("philip");
        set.add("praise");
        set.add("glory");
        assertTrue(set.retainAll(set1));
        assertEquals(2, set.size());
    }
    @Test
    public void testToStringMethod(){
        set.add("philip");
        set.add("praise");
        set.add("glory");
        String result = "[philip, praise, glory]";
        assertEquals(result,set.toString());
    }
    @Test
    public void testThatWhenTheFirstSetAndTheSecondSetElementAreTotallyDifferentAndFUnctionRetainAllIsCalledTheSetShouldBeEmpty(){
        MySet set1 = new MySet();
        set1.add("mary");
        set1.add("josh");
        // set1.add("mike");

        set.add("philip");
        set.add("praise");
        set.add("glory");
        assertFalse(set.retainAll(set1));
        assertEquals(0, set.size());
    }
    @Test
    public void testThatICanClearAllElementInList(){

        set.add("philip");
        set.add("praise");
        set.add("glory");
        set.clear();
        System.out.println(set);
        assertEquals(0, set.size());
    }    @Test
    public void testThatTwoSetAreEqual(){
        MySet set1 = new MySet();
        set1.add("praise");
        set1.add("philip");
        set1.add("glory");

        set.add("philip");
        set.add("praise");
        set.add("glory");
        assertTrue(set.equal(set1));
    }





}