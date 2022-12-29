package com.apiempeados.infrastructure.drivenadapters.adapter;

import com.apiempeados.core.solicitud.model.Solicitud;
import com.apiempeados.core.solicitud.repository.SolicitudRepository;
import com.apiempeados.core.solicitud.requests.SolicitudRequest;
import com.apiempeados.core.utils.mapper.Mapper;
import com.apiempeados.infrastructure.drivenadapters.dao.SolicitudDao;
import com.apiempeados.infrastructure.drivenadapters.entities.SolicitudEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PgsSolicitudAdapter implements SolicitudRepository {

    private final SolicitudDao solicitudDao;

    @Override
    public void guardarSolicitud(SolicitudRequest request) {
        this.solicitudDao.save(Mapper.map(request, SolicitudEntity.class));
    }

    @Override
    public Solicitud buscarSolicitud(String codigo) {
        return Mapper.map(solicitudDao.findByCodigo(codigo)
                .orElse(new SolicitudEntity()), Solicitud.class);
    }

}
