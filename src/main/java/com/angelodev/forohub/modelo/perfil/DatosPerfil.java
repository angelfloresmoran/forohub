package com.angelodev.forohub.modelo.perfil;

import jakarta.validation.constraints.NotNull;

public record DatosPerfil(
        @NotNull
        String nombre
) {
}
