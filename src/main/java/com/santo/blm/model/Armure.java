package com.santo.blm.model;

import lombok.Data;

@Data
public class Armure {

	private long id;
	
	private int protection;
	private int solidite;
	private boolean cassee = false;
}
