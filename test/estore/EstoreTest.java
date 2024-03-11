package estore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstoreTest {
    @Test
    public void testThatUserCanBeAddedToEstore(){
        Estore estore = new Estore();
        estore.addSeller("name","10 Yaba road","ajibola@gmail.com","09027531222","passwword",15);
        assertEquals(1,estore.getNumberOfSeller());
    }

}