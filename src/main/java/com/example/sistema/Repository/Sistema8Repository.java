package com.example.sistema.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sistema.Entity.Sistema8Entity;

@Repository
public interface Sistema8Repository extends JpaRepository<Sistema8Entity, Integer> {

}
