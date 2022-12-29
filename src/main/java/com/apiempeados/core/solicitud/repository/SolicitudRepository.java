package com.apiempeados.core.solicitud.repository;

import com.apiempeados.core.solicitud.model.Solicitud;
import com.apiempeados.core.solicitud.requests.SolicitudRequest;

public interface SolicitudRepository {

    void guardarSolicitud(SolicitudRequest request);

    Solicitud buscarSolicitud(String codigo);

}
