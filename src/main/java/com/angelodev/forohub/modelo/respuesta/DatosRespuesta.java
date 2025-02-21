package com.angelodev.forohub.modelo.respuesta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record DatosRespuesta(
        @NotNull
        Long id,

        @NotBlank
        String mensaje,

        @NotNull
        LocalDateTime fechaCreacion,

        @NotNull
        Long idAutor,

        @NotNull
        Long idTopico,

        @NotBlank
        String solucion
) {
}
