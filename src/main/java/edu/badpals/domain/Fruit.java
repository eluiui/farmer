package edu.badpals.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name = "fruit")
@NoArgsConstructor @ToString @EqualsAndHashCode
public class Fruit {

     @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
    private @Getter Long id; 
    

	@Column(name="name")
	private @Getter @Setter String name;


	@Column(name="description")
	private @Getter String description;
	
    @ManyToOne
	@JoinColumn(name="farmer_id")
	private @Getter Farmer farmer;


}
