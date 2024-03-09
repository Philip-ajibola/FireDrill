package strings;

public class StringStartEnd {
    public static void main(String[] args) {
        String[] strings = {"started","starting","ended","ending"};
        for(String string: strings){
            if(string.startsWith("s")) System.out.printf("%s start with \"s\" %n",string);
        }
        System.out.println();
        for(String string: strings){
            if(string.startsWith("st")) System.out.printf("%s start with \"st\" %n",string);
        }
        System.out.println();
        for(String string : strings){
            if(string.startsWith("art",2)) System.out.printf("%s Start with \"art\" at position two \n",string);
        }
        System.out.println();
        for(String string : strings){
            if(string.endsWith("ed")) System.out.printf("%s end with \"ed\" \n",string);
        }
        System.out.println();
        for(String string : strings){
            if(string.endsWith("d")) System.out.printf("%s end with \"d\" \n",string);
        }
    }
}
