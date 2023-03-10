package com.apiempeados.core.solicitud.model;

import com.apiempeados.core.empleado.model.Empleado;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Solicitud {

    private Integer id;

    private String codigo;

    private String descripcion;

    private String resumen;

    private Empleado empleado;

}
