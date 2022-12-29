package com.apiempeados.usecases.adapters;

import com.apiempeados.core.empleado.repository.EmpleadoRepository;
import com.apiempeados.core.solicitud.model.Solicitud;
import com.apiempeados.core.solicitud.repository.SolicitudRepository;
import com.apiempeados.core.solicitud.requests.SolicitudRequest;
import com.apiempeados.core.solicitud.responses.SolicitudResponse;
import com.apiempeados.usecases.ports.SolicitudPort;
import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class SolicitudAdapter implements SolicitudPort {

    private final SolicitudRepository solicitudRepository;
    private final EmpleadoRepository empleadoRepository;

    @Override
    public void guardarSolicitud(SolicitudRequest request) {

        if(empleadoRepository.empleadoExiste(request
                .getEmpleado().getId())) {
            String codigoSolicitud = UUID.randomUUID().toString();
            request.setCodigo(codigoSolicitud);
            this.solicitudRepository.guardarSolicitud(request);
        } else {
            throw new IllegalArgumentException("El empleado no esta registrado");
        }

    }

    @Override
    public SolicitudResponse buscarSolicitud(String codigo) {
        Solicitud solicitud = solicitudRepository.buscarSolicitud(codigo);
        return SolicitudResponse.builder()
                .codigo(solicitud.getCodigo())
                .descripcion(solicitud.getDescripcion())
                .resumen(solicitud.getResumen())
                .empleado(solicitud.getEmpleado().getNombre())
                .build();
    }

}
