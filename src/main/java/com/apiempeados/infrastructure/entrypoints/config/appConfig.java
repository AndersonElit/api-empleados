package com.apiempeados.infrastructure.entrypoints.config;

import com.apiempeados.core.empleado.repository.EmpleadoRepository;
import com.apiempeados.core.solicitud.repository.SolicitudRepository;
import com.apiempeados.usecases.adapters.EmpleadoAdapter;
import com.apiempeados.usecases.adapters.SolicitudAdapter;
import com.apiempeados.usecases.ports.EmpleadoPort;
import com.apiempeados.usecases.ports.SolicitudPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {

    @Bean
    public EmpleadoPort empleadoPort(EmpleadoRepository empleadoRepository) {
        return new EmpleadoAdapter(empleadoRepository);
    }

    @Bean
    public SolicitudPort solicitudPort(SolicitudRepository solicitudRepository,
                                       EmpleadoRepository empleadoRepository) {
        return new SolicitudAdapter(solicitudRepository, empleadoRepository);
    }

}
