package com.santo.blm.model;

import java.util.EnumMap;

import lombok.Data;

@Data
public class Competences {
	private long id;

	private EnumMap<CompetenceEnum, Integer> comp;

}
