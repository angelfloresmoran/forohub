package com.angelodev.forohub.repository;

import com.angelodev.forohub.modelo.topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITopicoRepository extends JpaRepository<Topico, Long> {
}
