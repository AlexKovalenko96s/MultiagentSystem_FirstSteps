package ua.kas.main;

import jade.core.Agent;

@SuppressWarnings("serial")
public class HelloWorld0 extends Agent {
	public void setup() {
		System.out.println("Hello from \"HellowWorld0\": " + getAID().getName());
	}
}
