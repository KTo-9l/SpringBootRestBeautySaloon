package com.beautysaloon.springbootrest.repository;

import com.beautysaloon.springbootrest.models.Stylist;
import org.springframework.data.repository.CrudRepository;

public interface StylistsRepository extends CrudRepository<Stylist, Integer> {
}
