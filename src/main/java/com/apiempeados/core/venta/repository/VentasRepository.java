package com.apiempeados.core.venta.repository;

import com.apiempeados.core.venta.model.Venta;

import java.util.List;

public interface VentasRepository {

    void registrarOrden(List<Venta> productos);

}
