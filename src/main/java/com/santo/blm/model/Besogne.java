package com.santo.blm.model;

import java.util.List;

import lombok.Data;

@Data
public class Besogne {

	private long id;

	private String nom;

	private List<CompetenceEnum> competences;

	private List<Aspect> aspects;

}
