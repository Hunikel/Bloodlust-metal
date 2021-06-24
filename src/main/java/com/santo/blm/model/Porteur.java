package com.santo.blm.model;

import java.util.List;

import lombok.Data;

@Data
public class Porteur {
	private long id;
	private String nom;
	private int exp;
	private int totalExp;
	
	private Desirs desirs;
	private Competences competences;
	private List<Aspect> aspects;
	private Inventaire inventaire;
	private Jauge jauge;
	
	public Porteur() {
		
	}
}
