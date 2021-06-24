package com.santo.blm.model;

import java.util.List;

import lombok.Data;

@Data
public class Inventaire {
	private long id;
	
	private List<Arme> armes;
	private List<Armure> armures;
	private List<Item> items;
	
}
