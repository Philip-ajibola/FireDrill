package queue;

import org.junit.jupiter.api.Test;

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
    public void testThatWhenTheQueueCapacityIsFullItReturnFalse(){
        Queue queue = new Queue(3);
        assertTrue(queue.offer("name"));
        assertTrue(queue.offer("name1"));
        assertTrue(queue.offer("name2"));
        assertFalse(queue.offer("name2"));
    }
    @Test
    public void testThatWhenNullIsAdded_NullPointerExceptionIsThrown(){
        Queue queue = new Queue(3);
        assertTrue(queue.offer("name"));
        assertTrue(queue.offer("name1"));
        assertThrows(NullPointerException.class,()-> queue.offer(null));
    }
}