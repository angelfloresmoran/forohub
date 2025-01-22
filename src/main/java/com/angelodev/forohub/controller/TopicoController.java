package com.angelodev.forohub.controller;

import com.angelodev.forohub.modelo.topico.DatosActualizarTopico;
import com.angelodev.forohub.modelo.topico.DatosListadoTopico;
import com.angelodev.forohub.modelo.topico.DatosTopico;
import com.angelodev.forohub.modelo.topico.Topico;
import com.angelodev.forohub.repository.ITopicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private ITopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@RequestBody @Valid DatosTopico datosTopico){
        System.out.println("El request llega correctamente");
        topicoRepository.save(new Topico(datosTopico));
    }

    @GetMapping
    public Page<DatosListadoTopico> listadoTopicos(@PageableDefault(page = 0, size = 5, sort = "titulo") Pageable paginacion){
        return topicoRepository.findByActivoTrue(paginacion).map(DatosListadoTopico::new);
    }

    @PutMapping
    @Transactional
    public void actualizarTopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico){
        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
        topico.actualizarDatos(datosActualizarTopico);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarMedico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        topico.desactivarTopico();

    }

}
