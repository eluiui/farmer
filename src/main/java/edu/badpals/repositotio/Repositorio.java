package edu.badpals.repositotio;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Repositorio {
    @Inject
    RepoFruit repoFruit;
}
