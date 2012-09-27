package com.color.catalog;

import java.util.ArrayList;

import com.color.catalog.*;

public class EmotionBank {
	
		private Emotion[] bank = { // +P +A + D, 
			new Emotion("Bold", 440, 610, 660),
			new Emotion("Mighty", 480, 510, 690),
			new Emotion("Kind", 730, 190, 570),
			new Emotion("Self-satisfaction", 860, 200, 620),
			new Emotion("Interested", 640, 510, 170),
			new Emotion("Arrogant", 0, 340, 480),
			new Emotion("Inspired", 710, 630, 340),
			new Emotion("Excited", 620, 750, 380),
			new Emotion("Influential", 680, 480, 750),
			new Emotion("Aggressive", 410, 630, 620),
			new Emotion("Strong", 580, 480, 620),
			new Emotion("Dignified", 550, 220, 610),
			new Emotion("Powerful", 540, 450, 730),
			new Emotion("Elated", 500, 420, 230),
			new Emotion("Hopeful", 510, 230, 140),
			new Emotion("Triumphant", 690, 570, 630),
			new Emotion("Joyful", 760, 480, 350),
			new Emotion("Capable", 700, 280, 610),
			new Emotion("Lucky", 710, 480, 370),
			new Emotion("Responsible", 350, 380, 490),
			new Emotion("Friendly", 690, 350, 300),
			new Emotion("Masterful", 580, 440, 690),
			new Emotion("Free", 810, 240, 460),
			new Emotion("Devoted", 490, 170, 100),
			new Emotion("Domineering", 230, 400, 580),
			new Emotion("Aroused", 240, 570, 220),
			new Emotion("Concentrated", 420, 280, 390),
			new Emotion("Happy", 810, 510, 460),
			new Emotion("Egotistical", 240, 320, 50),
			new Emotion("Carefree", 780, 350, 410),
			new Emotion("Affectionate", 640, 350, 240),
			new Emotion("Vigorous", 580, 610, 490),
			new Emotion("Alert", 490, 570, 450),
			new Emotion("Controlling", 470, 340, 660),
			new Emotion("Proud and lonely", 10, 20, 260),
			new Emotion("Entertained", 770, 440, 420),
			new Emotion("Serious", 270, 240, 420),
			new Emotion("Cooperative", 390, 130, 30),
			new Emotion("Dissatisfied", -500, 50, 130),
			new Emotion("Disgusted", -600, 350, 110),
			new Emotion("Insolent", -260, 210, 200),
			new Emotion("Cruel", -450, 480, 420),
			new Emotion("Irritated", -580, 400, 10),
			new Emotion("Defiant", -160,540, 320),
			new Emotion("Hostile", -420, 530, 300),
			new Emotion("Hate", -560, 590, 130),
			new Emotion("Angry", -510, 590, 250),
			new Emotion("Mildly Annoyed", -280, 170, 40),
			new Emotion("Enraged", -440, 720, 320),
			new Emotion("Contempuous", -240, 310, 210),
			new Emotion("Scornful", -350, 350, 290),
			new Emotion("Suspicious", -250, 420, 110),
			new Emotion("Skeptical", -220, 210, 30),
			new Emotion("Cold Anger", -430, 670, 340),
			new Emotion("Hostile but Controlled", -240, 420, 90),
			new Emotion("Dissatisfied", -500, 50, 130),
			new Emotion("Relaxed", 680, -460, 60),
			new Emotion("Untroubled", 790, -10, 330),
			new Emotion("Modest", 270, -60, 120),
			new Emotion("Secure", 740, -130, 30),
			new Emotion("Nonchalant", 70, -250, 110),
			new Emotion("Aloof", 160, -10, 250),
			new Emotion("Leisurely", 580, -320, 110),
			new Emotion("Reserved", 10, -190, 20),
			new Emotion("Thankful", 610, 100, -130),
			new Emotion("Respectful", 380, 130, -80),
			new Emotion("Appreciative", 550, 70, -140),
			new Emotion("Loved", 870, 540, -180),
			new Emotion("Grateful", 640, 160, -210),
			new Emotion("In Love", 820, 650, -50),
			new Emotion("Anxious", 10, 590, -150),
			new Emotion("Impressed", 410, 300, -320),
			new Emotion("Surprised", 400, 670, -130),
			new Emotion("Sexually Excited", 580, 620, -10),
			new Emotion("Wonder", 270, 240, -170),
			new Emotion("Fascinated", 550, 510, -70),
			new Emotion("Awed", 180, 400, -380),
			new Emotion("Overwhelmed", 140, 450, -240),
			new Emotion("Curious", 220, 620, -10),
			new Emotion("Astonished", 160, 880, -150),
			new Emotion("Disdainful", -320, -110, 50),
			new Emotion("Frustrated", -690, 30, -600),
			new Emotion("Distressed", -610, 280, -360),
			new Emotion("Insecure", -570, 140, -420),
			new Emotion("Humiliated", -630, 430, -380),
			new Emotion("Hungry", -440, 140, -210),
			new Emotion("Fearful", -640, 600, -430),
			new Emotion("Terrified", -620, 820, -430),
			new Emotion("Embattled", -370, 400, -20),
			new Emotion("Helpless", -710, 420, -510),
			new Emotion("Troubled", -630, 160, -400),
			new Emotion("Startled", -90, 650, -330),
			new Emotion("Anguished", -500, 80, -200),
			new Emotion("Shamed", -570, 10, -340),
			new Emotion("Displeased", -550, 160, -50),
			new Emotion("Embaressed", -460, 540, -240),
			new Emotion("Upset", -630, 300, -240),
			new Emotion("Defeated", -610, 60, -340),
			new Emotion("Pain", -580, 410, -340),
			new Emotion("Quietly Indignant", -280, 40, -160),
			new Emotion("Repentant", -60, 60, -120),
			new Emotion("Sinful", -300, 220, -10),
			new Emotion("Shy", -150, 60, -340),
			new Emotion("Guilty", -570, 280, -340),
			new Emotion("Angry but Detached", -420, 280, -130),
			new Emotion("Confused", -530, 280, -30),
			new Emotion("Regretful", -520, 20, -210),
			new Emotion("Tense", -330, 580, -110),
			new Emotion("Protected", 600, -220, -420),
			new Emotion("Consoled", 290, -190, -280),
			new Emotion("Quiet", 190, -400, -40),
			new Emotion("Sheltered", 140, -360, -440),
			new Emotion("Humble", 230, -280, -270),
			new Emotion("Solemn", 30, -320, -110),
			new Emotion("Reverent", 310, -80, -290),
			new Emotion("Depressed", -720, -290, -410),
			new Emotion("Despairing", -720, -160, -380),
			new Emotion("Lonely", -660, -430, -320),
			new Emotion("Meek", -190, -250, -410),
			new Emotion("Burdened", -660, -30, -260),
			new Emotion("Timid", -150, -120, -470),
			new Emotion("Bored", -650, -620, -330),
			new Emotion("Feeble", -420, -200, -460),
			new Emotion("Nauseated", -610, -10, -360),
			new Emotion("Inhibited", -540, -40, -410),
			new Emotion("Fatigued", -180, -570, -290),
			new Emotion("Rejected", -620, -10, -330),
			new Emotion("Subdued", -170, -260, -180),
			new Emotion("Impotent", -530, -130, -290),
			new Emotion("Ennui", -450, -430, -170),
			new Emotion("Haughty and Lonely", -470, -240, -130),
			new Emotion("Listless", -450, -590, -240),
			new Emotion("Deactivated", -460, -430, -460),
			new Emotion("Weary", -180, -330, -240),
			new Emotion("Snobbish and Lonely", -620, -190, -140),
			new Emotion("Uninterested", -470, -500, -80),
			new Emotion("Detached", -370, -260, -140),
			new Emotion("Discontented", -530, -160, -260),
			new Emotion("Discouraged", -610, -150, -290),
			new Emotion("Sad", -630, -270, -330),
	};
	
	public EmotionBank(){
		
	}
	
	/*
	 *@param pValue: the pleasure value for the emotion being matched.  
	 *@param aValue: the arousal value for the emotion being matched.
	 *@param dValue: the dominance value for the emotion being matched.
	 */
	public String FindMatch(int pValue, int aValue, int dValue){
		EmoStringTuple bestMatch = new EmoStringTuple(new Emotion("Error", 0, 0, 0), Integer.MAX_VALUE); // default value to catch errors
		
		for (int i = 0; i < bank.length; i++){
			Emotion cur = bank[i];
			int pDistance = getDistance(pValue, cur.getPleasure());
			int aDistance = getDistance(aValue, cur.getArousal());
			int dDistance = getDistance(dValue, cur.getDominance());
			int currentCumDistance = pDistance + aDistance + dDistance;
			
			if (bestMatch.getCumDistance() > currentCumDistance) {
				bestMatch = new EmoStringTuple(cur, currentCumDistance);
			}
		}
		return bestMatch.getName();
	}
	
	
	private int getDistance(int first, int second){
		if (first>=0 && second>=0){
			// both positive
			return Math.abs(first-second);
		} else if (first<0 && second<0){
			// both negative
			int posFirst = Math.abs(first);
			int posSecond = Math.abs(second);
			return Math.abs(posFirst-posSecond);
		} else if (first<0 && second>=0){
			// first negative, second positive
			return second-first;
		} else {
			// first postive, second negative
			return first-second;
		} 	
	}
	
	
	public static void main(String args[]){
		EmotionBank howdy = new EmotionBank();
		String lulz = howdy.FindMatch(-22, -272, 600);
		System.out.print(lulz);
	}
}