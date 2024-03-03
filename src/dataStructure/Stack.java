package dataStructure;

import java.util.EmptyStackException;

public class Stack {
    private int capacity;
    private int numberOfElement;
    private String[] elements;

    public Stack(int capacity){
        this.capacity = capacity;
        elements = new String[capacity];
    }
    public Stack(){

    }
    public boolean isEmpty() {
        return numberOfElement==0;
    }

    public int capacity() {
        return capacity;
    }

    public String push(String element) {
        if(numberOfElement== capacity)throw new StackOverflowError();
        elements[numberOfElement] = element;
        numberOfElement++;
        return element;
    }

    public String pop() {
        if(numberOfElement==0)throw new EmptyStackException();
        String returnedValue = elements[--numberOfElement];
        elements[numberOfElement] = null;
        String[] temp = new String[elements.length-1];
        int counter = 0;
        for(String string : elements) {
            if(string != null) temp[counter++] = string;
        }
        elements = temp;
        return returnedValue;
    }

    public String peek(String element) {
        if(isEmpty()) throw new EmptyStackException();
        return elements[--numberOfElement];
    }

    public int search(String element) {
        if(isEmpty()) throw new EmptyStackException();
        int counter = 0;
        boolean isElementPresent = false;
        for(String string: elements){
            counter++;
            if(string !=null && string.equals(element)) {
                isElementPresent = true ;
                break;
            }
        }
        if(isElementPresent) return counter;
        else return -1;

    }
    public int size(){
        return numberOfElement;
    }

    public boolean contain(String element) {
        boolean isElementInStack = false;
        for(String string: elements){
            if(string !=null && string.equals(element)){
                isElementInStack = true;
                break;
            }
        }
        return isElementInStack;
    }
}
