package queue;

public class Queue {


    private final String[] element;
    private int counter ;

    public Queue(int size){
        this.element = new String[size];
    }

    public boolean offer(String name) {
        if(name==null)throw new NullPointerException("NullPointerException: Element isNull");
        if(counter<element.length) {
            element[counter] = name;
            counter++;
            return true;
        }
        else return false;
    }
}
