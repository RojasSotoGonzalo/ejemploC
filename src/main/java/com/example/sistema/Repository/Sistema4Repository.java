package com.example.sistema.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sistema.Entity.Sistema4Entity;

@Repository
public interface Sistema4Repository extends JpaRepository<Sistema4Entity, Integer> {

}
