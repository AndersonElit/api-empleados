package com.apiempeados.usecases.ports;

import com.apiempeados.core.solicitud.model.Solicitud;
import com.apiempeados.core.solicitud.requests.SolicitudRequest;
import com.apiempeados.core.solicitud.responses.SolicitudResponse;

public interface SolicitudPort {

    void guardarSolicitud(SolicitudRequest request);

    SolicitudResponse buscarSolicitud(String codigo);

}
