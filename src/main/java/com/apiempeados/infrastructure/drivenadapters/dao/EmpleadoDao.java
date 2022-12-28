package com.apiempeados.infrastructure.drivenadapters.dao;

import com.apiempeados.infrastructure.drivenadapters.entities.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoDao extends JpaRepository<EmpleadoEntity, Integer> {
}
