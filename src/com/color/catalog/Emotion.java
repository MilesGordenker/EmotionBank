package com.color.catalog;

public class Emotion {
	private String name;
	
	private int pleasure;
	private int dominance;
	private int arousal;
	
	// constructor(s)
	public Emotion(String name, int pleasure, int dominance, int arousal){
		this.name = name;
		this.pleasure = pleasure;
		this.dominance = dominance;
		this.arousal = arousal;
	}
	
	//getters
	public String getName() {
		return name;
	}

	public int getPleasure() {
		return pleasure;
	}

	public int getDominance() {
		return dominance;
	}

	public int getArousal() {
		return arousal;
	}
}
