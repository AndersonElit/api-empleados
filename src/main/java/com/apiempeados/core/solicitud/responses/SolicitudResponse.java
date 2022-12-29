package com.apiempeados.core.solicitud.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SolicitudResponse {

    private String codigo;

    private String descripcion;

    private String resumen;

    private String empleado;

}
