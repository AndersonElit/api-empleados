package com.apiempeados.usecases.adapters;

import com.apiempeados.core.empleado.model.Empleado;
import com.apiempeados.core.empleado.repository.EmpleadoRepository;
import com.apiempeados.core.empleado.requests.EmpleadoRequest;
import com.apiempeados.usecases.ports.EmpleadoPort;
import lombok.AllArgsConstructor;

import java.io.InvalidObjectException;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
public class EmpleadoAdapter implements EmpleadoPort {

    private final EmpleadoRepository empleadoRepository;

    @Override
    public void guardarEmpleado(EmpleadoRequest request) {
        empleadoRepository.guardarEmpleado(request);
    }

    @Override
    public List<Empleado> listaEmpleados() {
        return empleadoRepository.listaEmpleados();
    }

    @Override
    public Empleado buscarEmpleado(Integer id) {
        Empleado empleado = empleadoRepository.buscarEmpleado(id);
        if(Objects.nonNull(empleado.getId())) {
            return empleadoRepository.buscarEmpleado(id);
        } else {
            throw new IllegalArgumentException("El empleado no existe.");
        }

    }

}
