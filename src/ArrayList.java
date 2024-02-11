import java.util.Arrays;

public class ArrayList {
    private String[] elements = new String[3];
    private int numberOfElement;

    public boolean isEmpty(){
        return numberOfElement == 0;
    }

    public void add(String element) {
        if(numberOfElement <elements.length){
        elements[numberOfElement++]= element;
        elements = giveActualLength(elements);
        }else{
            String[] temp = new String[2* elements.length];
            numberOfElement++;
            for(int count = 0;count< elements.length;count++){
                temp[count] = elements[count];
            }
            temp[elements.length]=element;
            String[] temp1 = giveActualLength(temp);
            elements = temp1;
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
        if(!condition) throw new IllegalArgumentException("Element not found in list");
        elements = giveActualLength(elements);
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
        if(!condition) throw new IllegalArgumentException("Element not found in list");
        return element;
    }

    public int size() {
        return numberOfElement;
    }
    public String toString(){
        return String.format("%s",Arrays.toString(elements));
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
        if(!condition) throw new IllegalArgumentException("Element not found in list");

        String[] temp = new String[elements.length];
        int count = 0;
        for(int counter = 0; counter<elements.length;counter++) {
            if(elements[counter] != null){
                temp[count] = elements[counter];
                count++;}
        }
        elements = giveActualLength(temp);
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
        elements = giveActualLength(elements);
    }
}
