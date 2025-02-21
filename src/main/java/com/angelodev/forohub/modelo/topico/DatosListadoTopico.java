package com.angelodev.forohub.modelo.topico;

import jakarta.validation.constraints.NotBlank;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;

public record DatosListadoTopico(

        Long id,

        String titulo,

        String mensaje,

        LocalDateTime fechaCreacion,

        String status,

        String autor,

        String curso

) {

    public DatosListadoTopico(Topico topico){
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso()
        );
    }
}
