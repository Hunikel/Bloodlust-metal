package com.santo.blm.model;

import lombok.Data;

@Data
public class Jauge {
	
	private long id;
	
	private int expFatigue;
	private int expFaiblesse;
	private int expTension;
	
	private int scoreFatigue;
	private int scoreFaiblesse;
	private int scoreTension;
	private int scoreEffort;
	
	private int difficulte;
}
