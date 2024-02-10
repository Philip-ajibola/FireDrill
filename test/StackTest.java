import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;
    @BeforeEach
    public void initializeStack(){
        stack = new Stack(3);

    }
    @Test
    public void testThatStackIsNotEmpty(){
        assertTrue(stack.isEmpty());

    }
    @Test
    public void testThatICanGetTheCapacityOfTheStack(){
        assertTrue(stack.isEmpty());
        assertEquals(3,stack.capacity());
    }

    @Test
    public void testThatICanPushElementInStack(){
        assertTrue(stack.isEmpty());
        assertEquals("philip",stack.push("philip"));

    }
    @Test
    public void testThatICanPopElementInStack(){
        assertTrue(stack.isEmpty());
        assertEquals("philip",stack.push("philip"));
        assertEquals("philip",stack.pop());

    }
    @Test
    public void testThatICanPushMoreElementInStack(){
        assertTrue(stack.isEmpty());
        assertEquals("philip",stack.push("philip"));
        assertEquals("dayo",stack.push("dayo"));

    }
    @Test
    public void testThatWhenIPopElementItIsTheLastElementInThatIsPoppedOut(){
        assertTrue(stack.isEmpty());
        assertEquals("philip",stack.push("philip"));
        assertEquals("dayo",stack.push("dayo"));
        assertEquals("dayo",stack.pop());

    }
    @Test
    public void testThatWhenIAddMoreElementAndIPopElementItIsTheLastElementInThatIsPoppedOut(){
        assertTrue(stack.isEmpty());
        assertEquals("philip",stack.push("philip"));
        assertEquals("dayo",stack.push("dayo"));
        assertEquals("godwin",stack.push("godwin"));
        assertEquals("godwin",stack.pop());

    }
    @Test
    public void testThatWhenITryToPopElementInAnEmptyStackItThrowException(){
        assertTrue(stack.isEmpty());

        assertThrows(EmptyStackException.class,()->stack.pop());

    }
    @Test
    public void testThatWhenTheStackIsFullAndIPushElementExceptionShouldBeThrown(){
        assertTrue(stack.isEmpty());
        assertEquals("philip",stack.push("philip"));
        assertEquals("dayo",stack.push("dayo"));
        assertEquals("godwin",stack.push("godwin"));
        assertThrows(StackOverflowError.class,()->stack.push("ola"));

    }
    @Test
    public void testThatICanPeekFromStack(){
        assertTrue(stack.isEmpty());
        assertEquals("philip",stack.push("philip"));
        assertEquals("dayo",stack.push("dayo"));
        assertEquals("godwin",stack.push("godwin"));
        assertEquals("godwin",stack.peek("godwin"));


    }
    @Test
    public void testThatIWhenIPopAndIPeekItReturnTheTopElement(){
        assertTrue(stack.isEmpty());
        assertEquals("philip",stack.push("philip"));
        assertEquals("dayo",stack.push("dayo"));
        assertEquals("godwin",stack.push("godwin"));
        stack.pop();
        assertEquals("dayo",stack.peek("dayo"));


    }
    @Test
    public void testThatIWhenIpeekAndStackIsEmptyItThrowExcpetion(){
        assertTrue(stack.isEmpty());

        assertThrows(EmptyStackException.class,()->stack.peek("dayo"));
    }
    @Test
    public void testThatIWhenISearchFunctionReturnThePositionOfTheElement(){
        assertTrue(stack.isEmpty());
        assertEquals("philip",stack.push("philip"));
        assertEquals("dayo",stack.push("dayo"));
        assertEquals("godwin",stack.push("godwin"));
        stack.pop();
        assertEquals(2,stack.search("dayo"));


    }
    @Test
    public void testThatIWhenISearchFOrElementThatIsNotInStackFunctionReturnMinusOne(){
        assertTrue(stack.isEmpty());
        assertEquals("philip",stack.push("philip"));
        assertEquals("dayo",stack.push("dayo"));
        assertEquals("godwin",stack.push("godwin"));
        stack.pop();
        assertEquals(-1,stack.search("godwin"));


    }
    @Test
    public void testThatIWhenISearchFOrElementAndStackIsEmptyFunctionThrowException(){
        assertTrue(stack.isEmpty());
        assertThrows(EmptyStackException.class,()->stack.search("micheal"));
    }
    @Test
    public void testThatICanKnowtheSizeOfTheStack(){
        assertTrue(stack.isEmpty());
        assertEquals("philip",stack.push("philip"));
        assertEquals("dayo",stack.push("dayo"));
        assertEquals("godwin",stack.push("godwin"));

        assertEquals(3,stack.size());
    }
    @Test
    public void testThatIStackContainElement(){
        assertTrue(stack.isEmpty());
        assertEquals("philip",stack.push("philip"));
        assertEquals("dayo",stack.push("dayo"));
        assertEquals("godwin",stack.push("godwin"));

        assertTrue(stack.contain("godwin"));
        assertFalse(stack.contain("micheal"));
    }



}
