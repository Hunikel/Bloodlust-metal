package com.santo.blm.model;

import java.util.List;
import java.util.Optional;

import lombok.Data;

@Data
public class Pouvoir {
	private long id;
	
	private String nom;
	private PouvoirCategoryEnum category;
	private TypePouvoirEnum typePouvoir;
	private TypeActionEnum typeAction;
	private TypeFrequenceEnum typeFrequence;
	
	private boolean exalLourd = false;
	private Optional<Pouvoir> preRequis;
	
	private List<Augmentation> augmentations;
}
