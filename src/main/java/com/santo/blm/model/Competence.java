package com.santo.blm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Competence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private CompetenceEnum nom;
}
