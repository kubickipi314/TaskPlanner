package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.taskplanner.TaskPlannerController;
import viewmodel.ViewModelFactory;

import java.io.IOException;

public class ViewHandler {
    private Stage stage;
    private ViewModelFactory viewModelFactory;

    public ViewHandler(Stage stage, ViewModelFactory viewModelFactory){
        this.stage = stage;
        this.viewModelFactory = viewModelFactory;
    }

    public void start() throws Exception{
        openView("TaskPlanner");
    }

    public void openView(String viewToOpen) throws IOException {
        Scene scene = null;
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;

        loader.setLocation(getClass().getResource(viewToOpen.toLowerCase()+"/"+viewToOpen+"View.fxml"));
        root = loader.load();
        if ("TaskPlanner".equals(viewToOpen)){
            TaskPlannerController view = loader.getController();
            view.init(viewModelFactory.getTaskPlannerViewModel());
            stage.setTitle("Task Planner");
        }

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}