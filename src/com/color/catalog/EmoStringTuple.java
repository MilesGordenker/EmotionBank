package com.color.catalog;

public class EmoStringTuple {

	private String name;
	private int cumDistance;
	
	public EmoStringTuple(Emotion inputEmotion, int distance){
		this.name = inputEmotion.getName();
		this.cumDistance = distance;
	}

	public String getName() {
		return name;
	}

	public int getCumDistance() {
		return cumDistance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCumDistance(int cumDistance) {
		this.cumDistance = cumDistance;
	}
	
	
	
	
}
