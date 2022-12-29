package com.apiempeados.core.empleado.repository;

import com.apiempeados.core.empleado.model.Empleado;
import com.apiempeados.core.empleado.requests.EmpleadoRequest;

import java.util.List;

public interface EmpleadoRepository {

    void guardarEmpleado(EmpleadoRequest request);

    List<Empleado> listaEmpleados();

    Empleado buscarEmpleado(Integer id);

    Boolean empleadoExiste(Integer id);

}
