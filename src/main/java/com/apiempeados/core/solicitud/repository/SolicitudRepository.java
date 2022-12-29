package com.apiempeados.core.solicitud.repository;

import com.apiempeados.core.solicitud.model.Solicitud;
import com.apiempeados.core.solicitud.requests.SolicitudRequest;

import java.util.List;

public interface SolicitudRepository {

    void guardarSolicitud(SolicitudRequest request);

    Solicitud buscarSolicitud(String codigo);

    List<Solicitud> listaSolicitudes();

}
