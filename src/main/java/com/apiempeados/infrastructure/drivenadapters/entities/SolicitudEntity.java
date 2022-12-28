package com.apiempeados.infrastructure.drivenadapters.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "solicitud")
public class SolicitudEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "resumen")
    private String resumen;

    @OneToOne
    @JoinColumn(name="id_empleado")
    private EmpleadoEntity empleado;

}
