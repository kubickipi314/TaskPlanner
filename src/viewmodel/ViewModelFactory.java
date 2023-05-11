package viewmodel;

import model.ModelFactory;
import viewmodel.TaskPlannerApp;
import viewmodel.taskplanner.TaskPlannerViewModel;
import java.io.IOException;

public class ViewModelFactory {

    private TaskPlannerViewModel taskPlannerViewModel;

    public ViewModelFactory(ModelFactory modelFactory) throws IOException, ClassNotFoundException {
        taskPlannerViewModel = new TaskPlannerViewModel(modelFactory.getDataModel());
    }

    public TaskPlannerViewModel getTaskPlannerViewModel() {
        return taskPlannerViewModel;
    }
}
