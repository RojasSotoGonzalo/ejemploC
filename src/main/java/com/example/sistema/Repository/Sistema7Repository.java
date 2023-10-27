package com.example.sistema.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sistema.Entity.Sistema7Entity;

@Repository
public interface Sistema7Repository extends JpaRepository<Sistema7Entity, Integer> {

}
