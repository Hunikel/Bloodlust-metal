package com.santo.blm.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Porteur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String nom;
	private int exp;
	private int totalExp;

	@OneToOne
	private Desirs desirs;

	@OneToMany(mappedBy = "porteur", cascade = CascadeType.ALL)
	private List<PorteurCompetence> competences;
	@OneToMany(mappedBy = "porteur", cascade = CascadeType.ALL)
	private List<AspectPorteur> aspects;

	private Inventaire inventaire;
	private Jauge jauge;

}
