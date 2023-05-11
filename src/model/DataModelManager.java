package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataModelManager implements DataModel {

    private ArrayList<Note> notes;

    @Override
    public List<Note> getNotes() { return notes; }

    @Override
    public void saveNotesToFile(List<Note> objectList, String filePath) throws IOException {
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(objectList);
        }
    }
    @Override
    public List<Note> loadNotesFromFile(String filePath) throws IOException, ClassNotFoundException {
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            return (List<Note>) objectIn.readObject();
        }
    }



}
