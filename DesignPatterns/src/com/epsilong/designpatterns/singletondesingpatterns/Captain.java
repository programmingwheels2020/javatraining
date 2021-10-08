package com.epsilong.designpatterns.singletondesingpatterns;

final class Captain {
	
	private static Captain captain;
	
	private Captain() {
		
	}
	
	public static synchronized Captain getCaptain() {
		if(captain==null) {
			System.out.println("You dont have caption. create captain instance");
			captain = new Captain();
		}else {
			System.out.println("You already have captain");
		}
		return captain;
		
	}

}
