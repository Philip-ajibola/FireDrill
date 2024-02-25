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

    public String getBody() {
        return body;
    }
}