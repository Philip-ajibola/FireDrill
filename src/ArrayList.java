import java.util.Arrays;

public class ArrayList {
    private String[] elements = new String[3];
    private int numberOfElement;

    public boolean isEmpty(){
        if(numberOfElement ==0) return true;
        else return false;
    }

    public void add(String element) {
        if(numberOfElement <elements.length){
        elements[numberOfElement]= element;
        numberOfElement++;
        }else{
            String[] temp = new String[2* elements.length];
            numberOfElement++;
            for(int count = 0;count< elements.length;count++){
                temp[count] = elements[count];
            }
            temp[elements.length]=element;
            elements = temp;
        }
    }

    public void remove(String element) {
                numberOfElement--;
        boolean condition = false;
        for( int count =0;count<elements.length;count++) {
            if (elements[count] != null && elements[count].equals(element)) {
                elements[count] = null;
                condition= true;
                break;
            }
        }
        if(condition==false) throw new IllegalArgumentException("Element not found in list");

        String[] temp = new String[elements.length];
        int count = 0;
        for(int counter = 0; counter<elements.length;counter++) {
            if(elements[counter] != null){
            temp[count] = elements[counter];
            count++;}
        }
            elements = temp;
    }

    public String get(int index) {
        String result ="";
        if(isEmpty()) throw new IllegalArgumentException("List Is Empty");
        if(index-1>= numberOfElement) throw new IllegalArgumentException("index out of bound");
        result = elements[index-1];
        return result;
    }

    public String get(String element) {
        String result = "";
       boolean condition = false;
        for( String string: elements) {
            if (string != null && string.equals(element)) {
                condition = true;
                break;
            }
        }
        if(condition==false) throw new IllegalArgumentException("Element not found in list");
        return element;
    }

    public int size() {
        return numberOfElement;
    }
    public String toString(){
        String listResult = "";
        int counter = 0;
        for(String string:elements){
            if(string != null){
                listResult +=string;
                if(counter< numberOfElement -1) {
                    listResult += ", ";
                    counter++;
                }
            }
        }
        return String.format("[%s]",listResult);
    }
    public void removeAll(String element) {
        int checker = 0;
        for(String string: elements) if(string != null && string.equals(element)) checker++;
        numberOfElement= numberOfElement-checker;
        boolean condition = false;
        for( int count =0;count<elements.length;count++) {
            if (elements[count] != null && elements[count].equals(element)) {
                elements[count] = null;
                condition= true;
            }
        }
        if(condition==false) throw new IllegalArgumentException("Element not found in list");

        String[] temp = new String[elements.length];
        int count = 0;
        for(int counter = 0; counter<elements.length;counter++) {
            if(elements[counter] != null){
                temp[count] = elements[counter];
                count++;}
        }
        elements = temp;
    }


    public boolean contain(String philip) {
        boolean isPresent = false;
        for(String string: elements)
            if(string != null && string.equals(philip)) isPresent= true;
        return isPresent;
    }

    public void insert(String josh,int index) {
        String[] temp = new String[elements.length+1];
        int indexChecker = 0;
        for(int count =0;count<temp.length;count++){
           if(count == index) {
               temp[count] = josh;
               continue;
           }
           temp[count] = elements[indexChecker++];
        }
        elements = temp;
    }

    public int getIndex(String element) {
        int index =0;
        for(String string: elements) {
            if(string != null && string.equals(element)) break;
        index++;}
        return index;
    }

    public void clear() {
        for(String string: elements) string = null;
    }
}
