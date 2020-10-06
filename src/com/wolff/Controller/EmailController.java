package com.wolff.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.wolff.Model.Data;
import com.wolff.Service.DataService;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EmailController implements Initializable{

	DataService dataService;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		List<Data>e = dataService.listar();
		System.out.println(e.size());
		
	}

	public void goBack(ActionEvent event) throws IOException {
		Parent emailPane = FXMLLoader.load(getClass().getResource("../app/table.fxml"));
		Scene scene = new Scene(emailPane);
		System.out.println("clicked");
		Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}

}
