package edu.badpals.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name = "fruit")
@ToString 
public class Fruit extends PanacheEntity {

    @NotBlank
    @Column(unique = true , name="id")
    public Long id; 
    
	@NotEmpty
	@Column(name="name")
	public String name;


	@Column(name="description")
	public String description;
	
    @ManyToOne
	@JoinColumn(name="farmer_id")
	public Farmer farmer;

	public Fruit() {
    }

    public Fruit(Long id, String name, Farmer farmer) {
		this.id = id;
		this.name = name;
		this.farmer = farmer;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}


}
