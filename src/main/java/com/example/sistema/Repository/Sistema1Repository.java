package com.example.sistema.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sistema.Entity.Sistema1Entity;

@Repository
public interface Sistema1Repository extends JpaRepository<Sistema1Entity, Integer> {

}
