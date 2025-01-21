package com.angelodev.forohub.controller;

import com.angelodev.forohub.modelo.curso.Curso;
import com.angelodev.forohub.modelo.curso.DatosCurso;
import com.angelodev.forohub.modelo.topico.DatosTopico;
import com.angelodev.forohub.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private ICursoRepository cursoRepository;

    @PostMapping
    public void registrarCurso(@RequestBody DatosCurso datosCurso){
        cursoRepository.save(new Curso(datosCurso));
    }

}
