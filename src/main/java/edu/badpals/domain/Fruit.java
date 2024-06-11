package edu.badpals.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.ToString;
@Entity
@Table (name = "fruit")
@ToString 
public class Fruit extends PanacheEntity {

    @NotNull
    @Column(unique = true)
    public Long id; 
    
	@NotEmpty
	@Column(name="name")
	public String name;


	@Column(name="description")
	public String description;
	
    @ManyToOne
	@JoinColumn(name="farmer_id")
	public Farmer farmer;

	public Fruit(@NotEmpty String name, String description, Farmer farmer) {
        this.name = name;
        this.description = description;
        this.farmer = farmer;
    }



    public Fruit() {
    }



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Farmer getFarmer() {
		return farmer;
	}



	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}



}
