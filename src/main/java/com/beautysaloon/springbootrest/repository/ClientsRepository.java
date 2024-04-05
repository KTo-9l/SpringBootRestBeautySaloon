package com.beautysaloon.springbootrest.repository;

import com.beautysaloon.springbootrest.models.Clients;
import org.springframework.data.repository.CrudRepository;
public interface ClientsRepository extends CrudRepository<Clients, Integer> {
}
