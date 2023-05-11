package viewmodel;

import javafx.application.Application;
import javafx.stage.Stage;
import model.DataModelManager;
import model.ModelFactory;
import view.ViewHandler;

import java.util.Random;

public class TaskPlannerApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        ModelFactory mf = new ModelFactory();
        ViewModelFactory viewModelFactory = new ViewModelFactory(mf);
        ViewHandler viewModelHandler = new ViewHandler(stage, viewModelFactory);
        viewModelHandler.start();

    }
}
