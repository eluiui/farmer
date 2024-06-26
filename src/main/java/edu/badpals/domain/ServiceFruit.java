package edu.badpals.domain;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.NoArgsConstructor;

@ApplicationScoped
@NoArgsConstructor
public class ServiceFruit {
    public Set<Fruit> list() {
        Stream<Fruit> fruits = Fruit.streamAll();
        return fruits.collect(Collectors.toSet());
    }

    public void add(Fruit fruit) {

        Optional<Farmer> supplier = Farmer.find("name", fruit.farmer.name).firstResultOptional();
        if (supplier.isPresent()) {

            fruit.farmer = supplier.get();
        } else {
            fruit.farmer.persist();
        }
        fruit.persist();
    }
    public void remove(String name){

        Optional<Fruit> fruit = Fruit.find("name", name).firstResultOptional();
        if(fruit.isPresent()){
            fruit.get().delete();
        }
    }
    public Optional<Fruit> getFruit(String name) {
        return name.isBlank()? 
            Optional.ofNullable(null) : 
            Fruit.find("name", name).firstResultOptional();
    }
}
