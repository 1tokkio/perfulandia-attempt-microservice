package com.perfulandia.usuarioservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder // crear objetos de manera flexible = constructor Flex
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String correo;
    private String rol; // admin, gerente y usuario
}
