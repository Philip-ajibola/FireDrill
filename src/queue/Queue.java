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

    public boolean add(String name) {
        if(name==null)throw new NullPointerException("NullPointerException: Element isNull");
        if(counter<element.length) {
            element[counter] = name;
            counter++;
        }
        if(counter==element.length)throw new IllegalStateException("Element Can't Be Added To Queue Due Capacity Restriction ");
        return true;
    }
}
