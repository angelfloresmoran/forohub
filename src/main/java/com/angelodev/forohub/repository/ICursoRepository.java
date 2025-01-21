package com.angelodev.forohub.repository;

import com.angelodev.forohub.modelo.curso.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepository extends JpaRepository<Curso, Long> {
}
