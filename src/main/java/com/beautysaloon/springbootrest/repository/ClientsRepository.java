package com.beautysaloon.springbootrest.repository;

import com.beautysaloon.springbootrest.models.Client;
import org.springframework.data.repository.CrudRepository;
public interface ClientsRepository extends CrudRepository<Client, Integer> {
}
