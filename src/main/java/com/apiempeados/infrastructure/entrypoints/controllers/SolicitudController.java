package com.apiempeados.infrastructure.entrypoints.controllers;

import com.apiempeados.core.solicitud.requests.SolicitudRequest;
import com.apiempeados.core.solicitud.responses.SolicitudResponse;
import com.apiempeados.core.utils.response.Response;
import com.apiempeados.infrastructure.entrypoints.services.SolicitudService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/solicitudes")
@AllArgsConstructor
public class SolicitudController {

    private final SolicitudService solicitudService;

    @GetMapping("/lista")
    public ResponseEntity<Response<Object>> listaSolicitudes() {
        Response<Object> response = Response.builder().build();
        try {
            List<SolicitudResponse> solicitudes = solicitudService.listaSolicitudes();
            response.setResponse(solicitudes);
            response.setCodigo(HttpStatus.OK.toString());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/buscar-solicitud/{codigo}")
    public ResponseEntity<Response<Object>> buscarSolicutud(
            @PathVariable("codigo") String codigo
    ) {
        Response<Object> response = Response.builder().build();
        try {
            SolicitudResponse solicitud = solicitudService.buscarSolicitud(codigo);
            response.setResponse(solicitud);
            response.setCodigo(HttpStatus.OK.toString());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/crear-solicitud")
    public ResponseEntity<Response<Object>> guardarSolicitud(@RequestBody SolicitudRequest request) {
        Response response = Response.builder().build();
        try {
            this.solicitudService.guardarSolicitud(request);
            response.setCodigo(HttpStatus.OK.toString());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
