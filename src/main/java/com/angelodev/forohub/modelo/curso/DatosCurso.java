package com.angelodev.forohub.modelo.curso;

import jakarta.validation.constraints.NotBlank;

public record DatosCurso(
        @NotBlank
        String nombre,

        @NotBlank
        CursoCategorias categoria
) {

}
