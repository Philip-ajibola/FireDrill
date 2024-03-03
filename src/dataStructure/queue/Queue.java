package dataStructure.queue;

import java.util.NoSuchElementException;

public class Queue {


    private String[] elements;
    private int counter ;

    public Queue(int size){
        this.elements = new String[size];
    }

    public boolean offer(String name) {
        if(name==null)throw new NullPointerException("NullPointerException: Element isNull");
        if(counter< elements.length) {
            elements[counter] = name;
            counter++;
            return true;
        }
        else return false;
    }

    public boolean add(String name) {
        if(name==null)throw new NullPointerException("NullPointerException: Element isNull");
        if(counter< elements.length) {
            elements[counter] = name;
        }
        if(counter == elements.length )throw new IllegalStateException("Element Can't Be Added To Queue Due Capacity Restriction ");
        counter++;
        return true;
    }

    public String remove() {
        if(elements[0] == null) throw new NoSuchElementException("Queue Is Empty");
        String element = elements[0];
       elements =  rearrangeElements();
       return element;
    }
    private String[] rearrangeElements(){
        String[] expectedElements = new String[3];
        for(int count =1 ;count<elements.length;count++){
            expectedElements[count -1 ] = elements[count];
        }
        return expectedElements;
    }

    public String poll() {
        String element = elements[0];
        elements =  rearrangeElements();
        return element;
    }

    public String peek() {
        return elements[0];
    }

    public String element() {
        if(elements[0] == null) throw new NoSuchElementException("Queue Is Empty");
        return elements[0];
    }
}
