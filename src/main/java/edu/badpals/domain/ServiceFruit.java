package edu.badpals.domain;

import edu.badpals.repositotio.Repositorio;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.NoArgsConstructor;

@ApplicationScoped @NoArgsConstructor
public class ServiceFruit {
    @Inject
    Repositorio repositorio;
}
