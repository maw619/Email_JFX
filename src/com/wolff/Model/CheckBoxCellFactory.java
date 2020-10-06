package com.wolff.Model;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;

public class CheckBoxCellFactory implements Callback<TableColumn.CellDataFeatures<Data, CheckBox>, ObservableValue<CheckBox>> {

	@Override
	public ObservableValue<CheckBox> call(CellDataFeatures<Data, CheckBox> param) {
		  Data data = param.getValue();
	        CheckBox checkBox = new CheckBox();
	        checkBox.selectedProperty().setValue(data.getUnemployed());
	        checkBox.selectedProperty().addListener((ov, old_val, new_val) -> {
	            data.setUnemployed(new_val);
	        });
	        return new SimpleObjectProperty<>(checkBox);
	}

}
