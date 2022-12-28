package com.apiempeados.usecases.ports;

import com.apiempeados.core.empleado.model.Empleado;
import com.apiempeados.core.empleado.requests.EmpleadoRequest;

import java.util.List;

public interface EmpleadoPort {

    void guardarEmpleado(EmpleadoRequest request);
    List<Empleado> listaEmpleados();
    Empleado buscarEmpleado(Integer id);

}
