package viewmodel.taskplanner;


import javafx.beans.property.StringProperty;
import model.DataModel;
import model.Note;
import java.util.List;


public class TaskPlannerViewModel {

    List<Note> notes;
    List<String> titles;

    private DataModel model;

    public TaskPlannerViewModel(DataModel model) {
        this.model = model;


    }

    public void upadateTaskPlanner() {
        notes = model.getNotes();
        for ()
    }

    public StringProperty notesProperty() { return null; }

}
