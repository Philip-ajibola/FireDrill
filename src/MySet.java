import java.util.Arrays;
import java.util.Objects;

public class MySet {


    private int numberOfElement;
    private String[] elements = new String[3];

    public boolean isEmpty() {
        return numberOfElement==0;
    }

    public int size() {
        return numberOfElement;
    }
    public boolean add(String element) {
        boolean condition = false;
        if(numberOfElement< elements.length) {
                   if(!contain(element)){
                       elements[numberOfElement] = element;condition = true;
                       numberOfElement++;
                   }
       }else{
           condition =  resizeArray(element);
        }
        //if(condition) return condition;
        return condition;
    }
    public boolean remove(String element) {
        if(numberOfElement==0) throw new IllegalArgumentException("set is empty");
        String[] temp = new String[elements.length-1];
        boolean condition = false;
        for(int count =0; count<elements.length;count++) {
            if(elements[count] != null && elements[count].equals(element)){
                condition = true;
                elements[count] = null;
                numberOfElement--;
            }
        }
        int count= 0;
       elements = giveActualLength(elements);
        return condition;
    }
    public int giveNumberOfNull(String[] elements){
        int count=0;
        for(String string : elements) if(string==null) count++;
        return count;
    }
    public String[] giveActualLength(String[] temp){
        int numberNull = giveNumberOfNull(temp);
        String[] elementsWithNoNullValue = new String [temp.length-numberNull];
        int count =0;
        for(String string:temp) if(string!=null) elementsWithNoNullValue[count++] = string;
        return elementsWithNoNullValue;
    }

    public boolean contain(String element) {
        boolean isPresent = false;
        for(String string:elements) if(string!=null && string.equals(element)){ isPresent = true;break;}
        return isPresent;
    }

    public String[] toArray() {
        String[] array = new String[elements.length];
        for(int count =0; count<elements.length;count++){
            array[count] = elements[count];
        }
        return array;
    }

    public boolean containAll(MySet elements2) {
        boolean condition = false;
        int counter =0;
            for(String element : elements2.elements){
                condition = contain(element);
                if(condition){
                    counter++;
                }
            }
        if(counter==elements2.size()) return true;
        else return false;
    }

    public boolean addAll(MySet elements2) {
        boolean condition = true;
        int counter=0;
        for(String string : elements2.elements) {
            condition = add(string);
            if(condition) counter++;
        }
        if(counter>0) return true;
        else return false;
    }

    public boolean removeAll(MySet elements2) {
        boolean condition = true;
        int counter=0;
        for(String string : elements2.elements) {
            condition = remove(string);
            if(condition) counter++;
        }
        if(counter>0) return true;
        else return false;
    }

    public boolean retainAll(MySet elements2) {
        boolean condition = false;
        int counter = 0;
        for(String string: elements){
            for(String string1:elements2.elements) {
               if(string.equals(string1)) {
                   condition = true;
                   counter++;
                   break;
               }else{condition=false;}
            }
            if(!condition) remove(string);
        }
        if(counter>0) return true;
        else return false;
    }

    public void clear() {
        for(String string: elements) remove(string);
        elements = giveActualLength(elements);
    }
    public String toString(){
    elements = giveActualLength(elements);
        return String.format("%s",Arrays.toString(elements));
    }

    public boolean equal(MySet elements2) {
        boolean condition = false;
            condition = containAll(elements2);
            if(condition && (elements2.size()==size())) condition = true;
            return condition;
    }
    public boolean resizeArray(String element){
        boolean condition = false;
        String[] temp = new String[elements.length*2];
        int count = 0;
        for(String string: elements){
            temp[count++] = string;
        }
        if(!contain(element)){
            temp[count] = element;condition=true;
            numberOfElement++;
        }
        elements = giveActualLength(temp);
        return condition;
    }
}

