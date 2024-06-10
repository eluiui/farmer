package edu.badpals.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table (name = "fruit")
public class Fruit {

     @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
    private Long id; 
    

	@JoinColumn(name="name")
	private String name;


	@JoinColumn(name="description")
	private String description;
	

	@JoinColumn(name="farmer_id")
	private Long farmer_id;


}
