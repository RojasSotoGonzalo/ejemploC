package com.example.sistema.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sistema.Entity.Sistema2Entity;

@Repository
public interface Sistema2Repository extends JpaRepository<Sistema2Entity, Integer> {

}
