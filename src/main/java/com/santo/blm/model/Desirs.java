package com.santo.blm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Desirs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private int connaissance;
	private int plaisir;
	private int pouvoir;
	private int richesse;
	private int violence;
}
