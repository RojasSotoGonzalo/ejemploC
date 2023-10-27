package com.example.sistema.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sistema.Entity.Sistema9Entity;

@Repository
public interface Sistema9Repository extends JpaRepository<Sistema9Entity, Integer> {

}
