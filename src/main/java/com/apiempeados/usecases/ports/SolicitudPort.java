package com.apiempeados.usecases.ports;

import com.apiempeados.core.solicitud.requests.SolicitudRequest;
import com.apiempeados.core.solicitud.responses.SolicitudResponse;

import java.util.List;

public interface SolicitudPort {

    void guardarSolicitud(SolicitudRequest request);

    SolicitudResponse buscarSolicitud(String codigo);

    List<SolicitudResponse> listaSolicitudes();

}
