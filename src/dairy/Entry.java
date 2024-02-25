package dairy;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public Entry(int id,String title,String body){
        this.id = id;
        this.body = body;
        this.title = title;
    }
    public boolean isIdValid(int id){
        return id == this.id;
    }
    public int getId(){
        return id;
    }
    public void updateTitle(String title){
        this.title = title;
    }
    public void updateBody(String body){
        this.body = body;
    }

    public String getTitle() {
        return title;
    }
    public String toString(){
        return String.format("Title: \n%s \n\nBody: \n%s",title,body);
    }
}