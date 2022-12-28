package com.apiempeados.core.empleado.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {

    private Integer id;

    private LocalDate fechaIngreso;

    private String nombre;

    private Long salario;

}
