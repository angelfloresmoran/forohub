package com.angelodev.forohub.repository;

import com.angelodev.forohub.modelo.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
}
