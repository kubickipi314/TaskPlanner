package model;

public class Note {
    private String title;
    private String text;

    void setTitle(String title){
        this.title = title;
    }
    void setText(String text){
        this.text = text;
    }
    String getTitle(){
        return title;
    }
    String getText(){
        return text;
    }
}
