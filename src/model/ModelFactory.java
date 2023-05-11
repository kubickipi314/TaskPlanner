package model;

import java.io.IOException;
import java.util.List;

public class ModelFactory {
    private DataModel dataModel;

    public DataModel getDataModel() throws IOException, ClassNotFoundException {
        if (dataModel == null) {
            dataModel = new DataModelManager();
            dataModel.loadNotesFromFile("savedNotes");
        }
        return dataModel;
    }
}
