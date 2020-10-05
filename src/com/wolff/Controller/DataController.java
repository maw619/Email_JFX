package com.wolff.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.wolff.Model.Data;
import com.wolff.Service.DataService;
import com.wolff.Service.IDataService;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class DataController implements Initializable {


	    @FXML
	    private Font x1;

	    @FXML
	    private Color x2;

	    @FXML
	    private TableColumn<?, ?> columnName;

	    @FXML
	    private TableColumn<?, ?> columnEmail;

	    @FXML
	    private TableColumn<?, ?> columnPhone;

	    @FXML
	    private TableColumn<?, ?> columnCreated;

	    @FXML
	    private TableColumn<?, ?> Send;

	    @FXML
	    private TextField txtName;

	    @FXML
	    private TextField txtEmail;

	    @FXML
	    private TextField txtPhone;

	    @FXML
	    private TextField txtCreated;
	    
	    private DataService dataService;

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			dataService = new DataService();
			
		}
		
		public ObservableList<Data>list(){
			
//			ObservableList<Data>listar = new Observable
			
			return null;
		}
		
		public void changeScene(ActionEvent event) throws IOException {
			Parent emailPane = FXMLLoader.load(getClass().getResource("../app/email.fxml"));
			Scene scene = new Scene(emailPane);
			
			Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
			window.setScene(scene);
			window.show();
		}
	
}







