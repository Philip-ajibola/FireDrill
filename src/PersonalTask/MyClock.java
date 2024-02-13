package PersonalTask;

public class MyClock {
    private int hour;
    private int minute;

    public void checkTimeInWords(String currentTime) {
        int length = currentTime.length();
        String hour = "";
        if(length<4 && length>5)throw new IllegalArgumentException("Invalid Time Range");
        if(length==5){
            for(int count = 0; count<length;count++){
                if(currentTime.charAt(count) == ':') break;

            }
        }

    }

    public String returnTimeInWords() {
        return null;
    }
}
