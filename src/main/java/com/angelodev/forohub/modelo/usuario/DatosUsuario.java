package com.angelodev.forohub.modelo.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosUsuario(
        @NotBlank(message = "Nombre no puede estar en blanco")
        String nombre,

        @NotBlank (message = "Email no puede estar en blanco")
        @Email
        String email,

        @NotBlank
        String contrasena
//        @NotNull
//        Long idPerfil
) {
}
