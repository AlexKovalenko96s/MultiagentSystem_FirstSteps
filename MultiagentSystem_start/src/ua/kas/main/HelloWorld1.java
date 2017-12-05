package ua.kas.main;

import jade.core.Agent;

@SuppressWarnings("serial")
public class HelloWorld1 extends Agent {
	public void setup() {
		System.out.println("Hello from \"HellowWorld1\": " + getAID().getName());
	}
}
