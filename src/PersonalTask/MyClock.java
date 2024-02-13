package PersonalTask;

public class MyClock {
    private int hour;
    private int minute;
    private SpecificTimeOfTheDay specificTime;
    private final int[] hours = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    private final String[] hoursInWords = {"one","Two","Three","Four","Five","Six","seven","Eight","Nine","Ten","Eleven","Twelve"};
    private  final String[] minutesInWords = {"O'Clock","Thirteen","Fourteen","fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty","Thirty","Forty","Fifty"};



    public void checkUserInput(String currentTime) {
        int length = currentTime.length();
        if(length != 5)throw new IllegalArgumentException("Invalid Time Range time should be in form of 24-hours time zone ");
        for (int count = 0; count < length; count++) {
            validateUserInput(currentTime.charAt(count));
        }
        setHour(takeTheFirstTwoCharInUserInputAndConvertToInt(currentTime));
        setMinute(takeTheLastTwoCharInUserInputAndConvertToInt(currentTime));
    }
    public void setHour(int hour){
    if(hour<0 || hour>23)throw new IllegalArgumentException("Hour should be in range 1-23");
    this.hour = hour;
    }
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) throw new IllegalArgumentException("Hour should be in range 1-59");
        this.minute = minute;
    }

    public String returnTimeInWords() {
        return String.format("%s--%s (%s)",returnHourInWord(getHour()),returnMinutesInWord(getMinute()),returnSpecifyTime());
    }

    public void validateUserInput(char userInput) {
        String userInputToString = "" + userInput;
        boolean condition = false;
        String[] userInputChar = {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "12",":"};
        for(int count = 0; count<userInputChar.length;count++) {
            if (userInputChar[count].equals(userInputToString)){
                condition = true;
                break;
            }
        }
        if(!condition)throw new IllegalArgumentException("Invalid time time should be in this format (12:00)");
    }
    public int takeTheFirstTwoCharInUserInputAndConvertToInt(String userInput){
        String firstTwoChar = "" + userInput.charAt(0) + userInput.charAt(1);
        return Integer.parseInt(firstTwoChar);
    }
    public int takeTheLastTwoCharInUserInputAndConvertToInt(String userInput){
        String firstTwoChar = "" + userInput.charAt(3) + userInput.charAt(4);
        return Integer.parseInt(firstTwoChar);
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public String returnHourInWord(int hour){
        String hourInWord = "";
        if(hour>12) hour = hour%12;
        if(hour == 0) hourInWord = "Twelve";
            for(int count=0;count<12;count++){
                checkSpecificTimeOfTheDay(hour);
                    if(count+1==hour){ hourInWord = hoursInWords[count];break;}
            }
            return hourInWord;
    }
    public String returnMinutesInWord(int minute) {
        String minuteInWord = "";
        if (minute > 0 && minute < 13) {
            for (int count = 0; count < 12; count++)
                if (count + 1 == minute) {
                    minuteInWord = hoursInWords[count];
                    break;
                }
        } else if (minute == 0 || minute > 12 && minute < 20) {
            minuteInWord = checkMinute(minute);
        } else {
            minuteInWord = checkMinuteIsGraterThanTwenty(minute);
        }
        return minuteInWord;
    }

    public boolean checkSpecificTimeOfTheDay(int hour){
        boolean condition = false;
        if(hour>=12) {
            condition = true;
        }
        return condition;
    }
    public SpecificTimeOfTheDay returnSpecifyTime(){
       boolean condition =  checkSpecificTimeOfTheDay(getHour());
        if(condition) specificTime = SpecificTimeOfTheDay.PM;
        else specificTime = SpecificTimeOfTheDay.AM;
        return specificTime;
    }
    public String checkMinute(int minute){
        int[] minutes = {0,13,14,15,16,17,18,19};
        String minuteInWord = "";
        for(int count = 0;count<minutes.length;count++){
            if(minutes[count]==minute){ minuteInWord = minutesInWords[count];break;}
        }
        return minuteInWord;
    }
    public String checkMinuteIsGraterThanTwenty(int minute){
        String minuteInWord = "";
        int[] minutes = {20,30,40,50};
        String convertMinute = "" + minute;
        int minuteWholeValue = 0;
        char secondCharInMinute = convertMinute.charAt(1);
        if(secondCharInMinute!='0') {
            minuteWholeValue = minute -(secondCharInMinute - '0');
            for(int count = 0; count<minutes.length;count++)
                if(minuteWholeValue == minutes[count]){
                minuteInWord = minutesInWords[8+count];
                minuteInWord += hoursInWords[secondCharInMinute - '0'-1];
                break;}
        }else{
            for(int count = 0; count<minutes.length;count++) if(minutes[count] == minute){minuteInWord = minutesInWords[8+count];break;}
        }
        return minuteInWord;
    }
    public enum SpecificTimeOfTheDay{
        AM("AM"),
        PM("PM");
        SpecificTimeOfTheDay(String specificTime){
        }
    }

}
