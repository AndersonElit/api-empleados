package com.apiempeados.infrastructure.drivenadapters.adapter;

import com.apiempeados.core.empleado.model.Empleado;
import com.apiempeados.core.empleado.repository.EmpleadoRepository;
import com.apiempeados.core.empleado.requests.EmpleadoRequest;
import com.apiempeados.core.utils.mapper.Mapper;
import com.apiempeados.infrastructure.drivenadapters.dao.EmpleadoDao;
import com.apiempeados.infrastructure.drivenadapters.entities.EmpleadoEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PgsEmpleadoAdapter implements EmpleadoRepository {

    private final EmpleadoDao empleadoDao;

    @Override
    public void guardarEmpleado(EmpleadoRequest request) {
        this.empleadoDao.save(Mapper.map(request, EmpleadoEntity.class));
    }

    @Override
    public List<Empleado> listaEmpleados() {
        return Mapper.mapAll(empleadoDao.findAll(), Empleado.class);
    }

    @Override
    public Empleado buscarEmpleado(Integer id) {
        return Mapper.map(empleadoDao.findById(id)
                .orElse(new EmpleadoEntity()), Empleado.class);
    }

    @Override
    public Boolean empleadoExiste(Integer id) {
        return empleadoDao.existsById(id);
    }

}
