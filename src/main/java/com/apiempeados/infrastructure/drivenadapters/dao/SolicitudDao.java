package com.apiempeados.infrastructure.drivenadapters.dao;

import com.apiempeados.infrastructure.drivenadapters.entities.SolicitudEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SolicitudDao extends JpaRepository<SolicitudEntity, Integer> {

    Optional<SolicitudEntity> findByCodigo(String codigo);

}
