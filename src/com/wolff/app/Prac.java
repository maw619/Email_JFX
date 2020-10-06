package com.wolff.app;

import com.wolff.Model.Data;
import com.wolff.Service.DataService;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Prac extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {
		
			primaryStage.setTitle("CheckBox Experiment 1");
			AnchorPane p = new AnchorPane();
			// create table
			TableView<Data> table = new TableView<Data>();

			// create columns
			TableColumn<Data, String> nameCol = new TableColumn<Data, String>("Name");
			nameCol.setCellValueFactory(new PropertyValueFactory("name"));

			TableColumn<Data, String> addressCol = new TableColumn<Data, String>("Address");
			addressCol.setCellValueFactory(new PropertyValueFactory("address"));

			// add columns 
			table.getColumns().setAll(nameCol, addressCol);
			
			DataService s = new DataService();
			
			
			
			// get data from db, return object List<Person> from DB 
			ObservableList<Data> listar = FXCollections.observableArrayList(s.listar());
			table.setItems(listar);

			table.setOnMouseClicked((MouseEvent event) -> {
			    if (event.getClickCount() > 1) {
			        
			    }
			});
			
			
			table.setOnMouseClicked((MouseEvent event) -> {
			    if (event.getClickCount() > 1) {
			        onEdit(table);
			    }
			});

			
			Scene scene = new Scene(p,400,400);
			p.getChildren().add(table);

			primaryStage.setScene(scene);
		
			primaryStage.show();

		
	}

	public void onEdit(TableView<Data> table) {
	    // check the table's selected item and get selected item
	    if (table.getSelectionModel().getSelectedItem() != null) {
	        Data selectedPerson = table.getSelectionModel().getSelectedItem();
	        System.out.println(selectedPerson.getName());
	        System.out.println(selectedPerson.getEmail());
	    }
}
}