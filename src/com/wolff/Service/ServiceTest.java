package com.wolff.Service;

import java.util.List;

import com.wolff.Model.Data;

public class ServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IDataService d = new DataService();
		
		List<Data>listar = d.listar();
		
		for(Data x : listar) {
			System.out.println(x.getEmail());
		}
	}

}
