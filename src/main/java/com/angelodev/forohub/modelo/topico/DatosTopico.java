package com.angelodev.forohub.modelo.topico;

import com.angelodev.forohub.modelo.respuesta.DatosRespuesta;
import org.antlr.v4.runtime.misc.NotNull;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.List;

public record DatosTopico(

        @NotBlank(message = "Titulo no puede estar en blanco")
        String titulo,

        @NotBlank(message = "Campo 'mensaje' no puede estar en blanco")
        String mensaje,

        @NotNull
        LocalDateTime fechaCreacion,

        String status,

        String autor,

        String curso,

        List<DatosRespuesta> respuestas
) {
}
