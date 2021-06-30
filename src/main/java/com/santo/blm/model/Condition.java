package com.santo.blm.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "condition")
public class Condition {

	private long id;
	
}
