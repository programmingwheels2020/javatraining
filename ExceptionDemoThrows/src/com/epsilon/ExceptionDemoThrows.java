package com.epsilon;

import java.io.IOException;

class Test {
	public void printMessage() throws ThisIsMyException {
		throw new ThisIsMyException("This Is my Custom Exception", "CUSTOM_EXCEPTION");
	}
}

public class ExceptionDemoThrows {

	public static void main(String[] args) {
		Test t = new Test();
		
		try {
			t.printMessage();
		} catch (ThisIsMyException e) {
			
			System.out.println("Erro Occured. Error code is "+e.getErrCode()+" error message is "+e.getMessage());
		}

	}

}
