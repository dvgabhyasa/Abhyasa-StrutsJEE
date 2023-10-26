package edu.abhayasa.strutsops.models;

/**
 * Model class for storing message
 */
public class HelloMessageModel {
	
	private String helloMessage;

	/**
	 * Constructor
	 */
	public HelloMessageModel() {
		System.out.println("Model class");
		this.helloMessage = "Hello message from model";
	}

	/**
	 * @return the helloMessage
	 */
	public String getHelloMessage() {
		return helloMessage;
	}

		
}
