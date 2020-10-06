package com.wolff.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.wolff.Model.CheckBoxCellFactory;
import com.wolff.Model.Data;
import com.wolff.Service.DataService;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class DataController implements Initializable {


	    @FXML
	    private Font x1;

	    @FXML
	    private Color x2;
	    
	    @FXML
	    private TableView<Data> tbl;

	    @FXML
	    private TableColumn<Data, String> columnName;

	    @FXML
	    private TableColumn<Data, String> columnEmail;

	    @FXML
	    private TableColumn<Data, String> columnPhone;

	    @FXML
	    private TableColumn<Data, String> columnCreated;

	    @FXML
	    private TableColumn<Data, CheckBox> Send;

	    @FXML
	    private TextField txtName;

	    @FXML
	    private TextField txtEmail;

	    @FXML
	    private TextField txtPhone;

	    @FXML
	    private TextField txtCreated;
	    
	    private CheckBox checkBox = new CheckBox();
	    
	    private DataService dataService;

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			
		CheckBoxCellFactory c = new CheckBoxCellFactory();
		Data d = new Data();

		columnName.setCellValueFactory(new PropertyValueFactory<Data, String>("name"));
		columnEmail.setCellValueFactory(new PropertyValueFactory<Data, String>("email"));
		columnPhone.setCellValueFactory(new PropertyValueFactory<Data, String>("phone"));
		columnCreated.setCellValueFactory(new PropertyValueFactory<Data, String>("createdOn"));
		tbl.setItems(listar());
		
		
		tbl.setOnMouseClicked((MouseEvent event) -> {
		    if (event.getClickCount() > 0) {
		        onEdit(tbl);
		    }
		});
		}
		
		
		public void onEdit(TableView<Data> table) {
		    // check the table's selected item and get selected item
		    if (table.getSelectionModel().getSelectedItem() != null) {
		        Data selectedData = table.getSelectionModel().getSelectedItem();
		        txtName.setText(selectedData.getName());
		        txtPhone.setText(selectedData.getPhone());
		        txtEmail.setText(selectedData.getEmail());
		        txtCreated.setText(selectedData.getCreatedOn());
		    }
	}
		
		public void isSelec(ActionEvent event) {
				
		}
		
		
		public ObservableList<Data>listar(){
			dataService = new DataService();
			List<Data>list = dataService.listar();
			ObservableList<Data>listar_ = FXCollections.observableArrayList(list);
			return listar_;
		 }
		
		public void changeScene(ActionEvent event) throws IOException {
			Parent emailPane = FXMLLoader.load(getClass().getResource("../app/email.fxml"));
			Scene scene = new Scene(emailPane);
			
			Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
			window.setScene(scene);
			window.show();
		}
		
	
}







