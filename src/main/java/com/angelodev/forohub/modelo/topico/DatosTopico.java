package com.angelodev.forohub.modelo.topico;

import com.angelodev.forohub.modelo.curso.DatosCurso;
import com.angelodev.forohub.modelo.usuario.DatosUsuario;
import org.antlr.v4.runtime.misc.NotNull;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record DatosTopico(
        @NotNull
        Long id,

        @NotBlank
        String titulo,

        @NotBlank
        String mensaje,

        @NotNull
        LocalDateTime fechaCreacion,

        String status,

        DatosUsuario autor,

        DatosCurso curso,

        String respuestas
) {
}
