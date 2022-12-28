package com.apiempeados.core.venta.requests;

import com.apiempeados.core.venta.model.Venta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VentaRequest {

    private List<Venta> ventas;

}
