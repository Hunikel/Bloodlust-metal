package com.santo.blm.model;

import lombok.Data;

@Data
public class Competences {
	private long id;

	private int administrateur = 1;
	private int artisan = 1;
	private int artiste = 1;
	private int athlete = 1;
	private int bagarreur = 1;
	private int batelier = 1;
	private int bougeard = 1;
	private int bricoleur = 1;
	private int citadin = 1;
	private int eclaireur = 1;
	private int erudit = 1;
	private int ferailleur = 1;
	private int gentilhomme = 1;
	private int intrigant = 1;
	private int larron = 1;
	private int marchand = 1;
	private int medecin = 1;
	private int orateur = 1;
	private int paysan = 1;
	private int saltimbanque = 1;
	private int soldat = 1;
	private int tireur = 1;
	private int veneur = 1;
	private int voyageur = 1;
	private int porteur = 0;

	public int getTotalExp() {
		return administrateur + artisan + artiste + athlete + bagarreur + batelier + bougeard + bricoleur + citadin
				+ eclaireur + erudit + ferailleur + gentilhomme + intrigant + larron + marchand + medecin + orateur
				+ paysan + saltimbanque + soldat + tireur + veneur + voyageur + porteur;
	}
}
