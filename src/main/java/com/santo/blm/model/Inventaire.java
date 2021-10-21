package com.santo.blm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Inventaire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private List<Arme> armes;
	private List<Armure> armures;
	private List<Item> items;

}
