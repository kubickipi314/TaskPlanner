package model;

import java.io.IOException;
import java.util.List;

public interface DataModel {
    List<Note> getNotes();

    void saveNotesToFile(List<Note> objectList, String filePath) throws IOException;
    public List<Note> loadNotesFromFile(String filePath) throws IOException, ClassNotFoundException;

}
