package com.beautysaloon.springbootrest.repository;

import com.beautysaloon.springbootrest.models.Client;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface ClientsRepository extends CrudRepository<Client, Integer> {
    @Query("update Client c set c.isDeleted=true where c.id=?1")
    @Transactional
    @Modifying
    void softDelete(Integer id);
}
