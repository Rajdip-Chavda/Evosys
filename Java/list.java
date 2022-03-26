import javafx.application.*;
import javafx.Scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.beans.value.*;
import javafx.collections.*;

public class list extends application
{
	Label responce;
	public static void main(String args[])
	{
		launch(args);
	}
	public void start(Stage myStage)
	{
		mystage.setTitle("list demo");
		FlowPane rootNode = new FlowPane(10,10);
		rootNode.setAlignement(Pos.CENTER);
		Scene myScene =new Scene(rootNode, 200 ,120);
		myStage.setScene(myScene);
		responce=new Label("Select computer type");
		
		ObservableList<string> computertype= FXCollections.observableArrayList("Smartphone","Tablate","Notebook","Desktop");
	
		ListView<string> lvcomputers = new Listview<String>(computertype);
		
		lvcomputers.setPrefSize(100, 70);
		
		MultipleSelectionModel<String> lvSelModel = lvcomputers.getSelecttionModel();
		
		lvSelModel.selectedItemProperty().addListener( 
		new ChangeListener<String>() 
		{
			public void changed(ObservableValue<? extends String> changed, String oldVal, String newVal)
			{
				responce.setText("computer selected is "+newVal);
			}
		});
	}
	rootNode.getChildren().addAll(lvcomputers,responce);
	
	myStage.show();
}