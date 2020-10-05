package com.wolff.Service;

import java.io.File;
import java.util.List;

import com.wolff.Model.Data;

public interface IDataService {

	public List<Data>listar();
	
	File checkFile();
}
