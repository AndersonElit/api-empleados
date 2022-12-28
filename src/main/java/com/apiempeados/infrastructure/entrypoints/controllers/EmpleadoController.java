package com.apiempeados.infrastructure.entrypoints.controllers;

import com.apiempeados.core.empleado.model.Empleado;
import com.apiempeados.core.empleado.requests.EmpleadoRequest;
import com.apiempeados.core.utils.response.Response;
import com.apiempeados.infrastructure.entrypoints.services.EmpleadoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/empleados")
@AllArgsConstructor
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    @GetMapping("/lista")
    public ResponseEntity<Response<Object>> listaEmpleados() {
        Response<Object> response = Response.builder().build();
        try {
            List<Empleado> listaEmpleados = empleadoService.listaEmpleados();
            response.setResponse(listaEmpleados);
            response.setCodigo(HttpStatus.OK.toString());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/buscar-empleado/{id}")
    public ResponseEntity<Response<Object>> buscarEmpleado(
            @PathVariable("id") Integer id
    ) {
        Response<Object> response = Response.builder().build();
        try {
            Empleado empleado = empleadoService.buscarEmpleado(id);
            response.setResponse(empleado);
            response.setCodigo(HttpStatus.OK.toString());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/guardar-empleado")
    public ResponseEntity<Response> guardarEmpleado(@RequestBody EmpleadoRequest request) {
        Response response = Response.builder().build();
        try {
            this.empleadoService.guardarEmpleado(request);
            response.setCodigo(HttpStatus.OK.toString());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PutMapping("/actualizar-empleado")
    public ResponseEntity<Response> actualizarEmpleado(@RequestBody EmpleadoRequest request) {
        Response response = Response.builder().build();
        try {
            this.empleadoService.guardarEmpleado(request);
            response.setCodigo(HttpStatus.OK.toString());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
