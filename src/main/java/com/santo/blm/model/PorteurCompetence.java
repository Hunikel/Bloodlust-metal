package com.santo.blm.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class PorteurCompetence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "porteur_id")
	private Porteur porteur;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "competence_id")
	private Competence competence;

	private int exp;
}
