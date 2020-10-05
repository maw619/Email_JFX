package com.wolff.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.wolff.Model.Data;

public class DataService implements IDataService{

	@Override
	public List<Data> listar() {
		File data = null;
		BufferedReader br = null;
		List<Data>list = null;
		String line = "";
		try {
			list = new ArrayList<>();
			if((data = checkFile()) != null) {
				br = new BufferedReader(new FileReader(data));
				while((line = br.readLine()) != null) {
					String[] fileData = line.split(",");
					String name = fileData[0];
					String createdOn = fileData[1];
					String phone = fileData[2];
					String email = fileData[3];
					Data d = new Data(name,createdOn,phone,email);
					list.add(d);
				}
			}else {
				System.out.println("There was a problem with -- listar()");
			}
			
			
	}catch(Exception e) {
		e.printStackTrace();
	}
		
		return list;
	}

	@Override
	public File checkFile() {
		File storedPath = new File("filePath.txt");
		File data = new File("email.csv");
		try {
			if(!storedPath.exists() && !data.exists()) {
				storedPath.createNewFile();
				data.createNewFile();
				System.out.println("Stored-path file created in: "+storedPath.getAbsolutePath());
				System.out.println("Data file created in: "+data.getAbsolutePath());
				
			}
			if(!storedPath.exists()){
				System.out.println("Stored-path file created in: "+storedPath.getAbsolutePath());
			}
			if(!data.exists()) {
				System.out.println("Data file created in: "+data.getAbsolutePath());
			}
			else {
				System.out.println("Files already created");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return data;
	}

}
