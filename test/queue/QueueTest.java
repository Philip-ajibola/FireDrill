package queue;

import dataStructure.queue.Queue;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    public void testThatICanOfferAQueue(){
        Queue queue = new Queue(3);
        assertTrue(queue.offer("name"));
    }
    @Test
    public void testThatICanOfferMoreElement(){
        Queue queue = new Queue(3);
        assertTrue(queue.offer("name"));
        assertTrue(queue.offer("name1"));
        assertTrue(queue.offer("name2"));
    }
    @Test
    public void testThatWhenTheQueueFull_whenElementIsFull_ReturnFalse(){
        Queue queue = new Queue(3);
        assertTrue(queue.offer("name"));
        assertTrue(queue.offer("name1"));
        assertTrue(queue.offer("name2"));
        assertFalse(queue.offer("name2"));
    }
    @Test
    public void testThatWhenNullIsOffered_NullPointerExceptionIsThrown(){
        Queue queue = new Queue(3);
        assertTrue(queue.offer("name"));
        assertTrue(queue.offer("name1"));
        assertThrows(NullPointerException.class,()-> queue.offer(null));
    }
    @Test
    public void testThatICanAddToAQueue(){
        Queue queue = new Queue(3);
        assertTrue(queue.add("name"));
    }
    @Test
    public void testThatICanAddMoreElementToaQueue(){
        Queue queue = new Queue(3);
        assertTrue(queue.add("name"));
        assertTrue(queue.add("name1"));
        assertTrue(queue.add("name2"));
    }
    @Test
    public void testThatElementCantBeAddedWhenQueueIsFull_ExceptionIsThrown(){
        Queue queue = new Queue(3);
        assertTrue(queue.add("name"));
        assertTrue(queue.add("name1"));
        assertTrue(queue.add("name2"));
        assertThrows(IllegalStateException.class,()->queue.add("name2"));
    }
    @Test
    public void testThatWhenNullIsAdded_NullPointerExceptionIsThrown(){
        Queue queue = new Queue(3);
        assertTrue(queue.add("name"));
        assertTrue(queue.add("name1"));
        assertThrows(NullPointerException.class,()-> queue.add(null));
    }
    @Test
    public void testThatICanRetrieveAndRemoveTheHeadOfQueue(){
        Queue queue = new Queue(3);
        assertTrue(queue.add("name"));
        assertTrue(queue.add("name1"));
        assertEquals("name",queue.remove());
    }
    @Test
    public void testThatWhenQueueISEmptyRemoveMethodThrowError(){
        Queue queue = new Queue(3);
        assertThrows(NoSuchElementException.class, queue::remove);
    }
    @Test
    public void testThatICanRetrieveAndPollTheHeadOfQueue(){
        Queue queue = new Queue(3);
        assertTrue(queue.add("name"));
        assertTrue(queue.add("name1"));
        assertEquals("name",queue.poll());
    }
    @Test
    public void testThatWhenQueueISEmptyPollMethodReturnNull(){
        Queue queue = new Queue(3);
        assertNull(queue.poll());
    }
    @Test
    public void testThatICanPeekTheHeadTheQueue(){
        Queue queue = new Queue(3);
        assertTrue(queue.add("name"));
        assertTrue(queue.add("name1"));
        assertEquals("name",queue.peek());
    }
    @Test
    public void testThatWhenQueueISEmptyPeekMethodReturnNull(){
        Queue queue = new Queue(3);
        assertNull(queue.peek());
    }
    @Test
    public void testThatWhenElementMethodIsCalled_ItReturnTheFirstElementInQueue(){
        Queue queue = new Queue(3);
        assertTrue(queue.add("name"));
        assertTrue(queue.add("name1"));
        assertEquals("name",queue.element());
    }
    @Test
    public void testThatWhenQueueISEmpty_ElementMethodReturnNull(){
        Queue queue = new Queue(3);
        assertThrows(NoSuchElementException.class,queue::element);
    }

}