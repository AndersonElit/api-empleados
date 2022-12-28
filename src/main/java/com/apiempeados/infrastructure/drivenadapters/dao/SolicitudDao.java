package com.apiempeados.infrastructure.drivenadapters.dao;

import com.apiempeados.infrastructure.drivenadapters.entities.SolicitudEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudDao extends JpaRepository<SolicitudEntity, Integer> {
}
