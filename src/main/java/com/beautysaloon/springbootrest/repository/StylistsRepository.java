package com.beautysaloon.springbootrest.repository;

import com.beautysaloon.springbootrest.models.Stylist;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface StylistsRepository extends CrudRepository<Stylist, Integer> {
    @Query("update Stylist s set s.isDeleted=true where s.id=?1")
    @Transactional
    @Modifying
    void softDelete(Integer id);
}
