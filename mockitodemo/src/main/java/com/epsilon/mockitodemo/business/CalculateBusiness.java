package com.epsilon.mockitodemo.business;

import com.epsilon.mockitodemo.service.DataService;

public class CalculateBusiness {
	
	DataService dataService;
	public DataService getDataService() {
		return dataService;
	}

	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

	public int add(int[] data) {
		int sum = 0;
		for (int a : data) {
			sum += a;
		}
		return sum;
	}
	
	public int sum() {
		int[] data = dataService.getData();//stub
		int sum = 0;
		for (int a : data) {
			sum += a;
		}
		
		//dataService.saveSum(sum);
		return sum;
	}
}
