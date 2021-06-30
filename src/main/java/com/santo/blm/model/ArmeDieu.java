package com.santo.blm.model;

import lombok.Data;

@Data
public class ArmeDieu extends Arme{

	private int exp;
	private int totalExp;
	
	private int expFlashBack = 1;
	
	//TODO: This goes to the Model > DTO converter
	public int getPuissance() {
		return totalExp < 50 ? 1 : totalExp >= 50 && totalExp <= 149 ? 2 : totalExp >= 150 && totalExp <= 299 ? 3 : totalExp >=300 && totalExp <= 499 ? 4 : 5;
	}
}
