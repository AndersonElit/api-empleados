package com.apiempeados.infrastructure.drivenadapters.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empleado")
public class EmpleadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "fecha_ingreso")
    private LocalDate fechaIngreso;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "salario")
    private Long salario;

    @OneToMany(mappedBy = "empleado")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Set<SolicitudEntity> solicitudes = new HashSet<>();


}
