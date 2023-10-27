package com.example.sistema.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sistema.Entity.Sistema5Entity;

@Repository
public interface Sistema5Repository extends JpaRepository<Sistema5Entity, Integer> {

}
