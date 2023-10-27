package com.example.sistema.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sistema.Entity.Sistema6Entity;

@Repository
public interface Sistema6Repository extends JpaRepository<Sistema6Entity, Integer> {

}
