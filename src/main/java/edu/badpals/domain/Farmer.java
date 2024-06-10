package edu.badpals.domain;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "farmer")
public class Farmer {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
    private @Getter Long id; 
    
	@JoinColumn(name="name")
	private @Getter @Setter String name;

	@JoinColumn(name="location")
	private @Getter String location;

     @OneToMany(mappedBy = "farmer")
    public Set<Fruit> fruits;
}
