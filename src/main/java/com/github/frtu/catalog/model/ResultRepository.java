package com.github.frtu.catalog.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//Name for ALPS and Path for the URL
@RepositoryRestResource(collectionResourceRel = "movies", path = "movies")
public interface ResultRepository extends CrudRepository<Result, Integer> {
}
