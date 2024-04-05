package com.beautysaloon.springbootrest.repository;

import com.beautysaloon.springbootrest.models.Stylists;
import org.springframework.data.repository.CrudRepository;

public interface StylistsRepository extends CrudRepository<Stylists, Integer> {
}
