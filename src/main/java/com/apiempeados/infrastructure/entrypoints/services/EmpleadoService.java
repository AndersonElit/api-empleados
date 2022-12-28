package com.apiempeados.infrastructure.entrypoints.services;

import com.apiempeados.core.empleado.model.Empleado;
import com.apiempeados.core.empleado.requests.EmpleadoRequest;
import com.apiempeados.usecases.ports.EmpleadoPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
@AllArgsConstructor
public class EmpleadoService {

    private final EmpleadoPort empleadoPort;

    @Transactional(rollbackFor = { SQLException.class })
    public void guardarEmpleado(EmpleadoRequest request) {
        empleadoPort.guardarEmpleado(request);
    }

    public List<Empleado> listaEmpleados() {
        return empleadoPort.listaEmpleados();
    }

    public Empleado buscarEmpleado(Integer id) {
        return empleadoPort.buscarEmpleado(id);
    }

}
