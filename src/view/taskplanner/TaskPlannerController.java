package view.taskplanner;

import javafx.fxml.FXML;
import viewmodel.taskplanner.TaskPlannerViewModel;
import java.awt.*;

public class TaskPlannerController {
    @FXML
    Label eventLabel;

    private TaskPlannerViewModel viewModel;



    public void init(TaskPlannerViewModel taskPlannerViewModel) {
        this.viewModel = taskPlannerViewModel;

        //note1.taskPlannerProperty().bind(viewModel.note1Property());
        //note2.taskPlannerProperty().bind(viewModel.note2Property());
        //note3.taskPlannerProperty().bind(viewModel.note3Property());

        //eventLabel.textProperty().bind(viewModel.updateTimeStampProperty());

        //ObservableList<TaskPlanner.Note> notes = FXCollections.observableArrayList(note1,note2,note3);
        //taskPlanner.setData(notes);
    }

}
