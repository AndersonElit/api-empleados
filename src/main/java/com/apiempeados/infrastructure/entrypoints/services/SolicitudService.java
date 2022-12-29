package com.apiempeados.infrastructure.entrypoints.services;

import com.apiempeados.core.solicitud.requests.SolicitudRequest;
import com.apiempeados.core.solicitud.responses.SolicitudResponse;
import com.apiempeados.usecases.ports.SolicitudPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
@AllArgsConstructor
public class SolicitudService {

    private final SolicitudPort solicitudPort;

    @Transactional(rollbackFor = { SQLException.class })
    public void guardarSolicitud(SolicitudRequest request) {
        this.solicitudPort.guardarSolicitud(request);
    }

    public SolicitudResponse buscarSolicitud(String codigo) {
        return solicitudPort.buscarSolicitud(codigo);
    }

}
