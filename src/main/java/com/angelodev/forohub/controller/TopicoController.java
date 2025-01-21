package com.angelodev.forohub.controller;

import com.angelodev.forohub.modelo.topico.DatosTopico;
import com.angelodev.forohub.modelo.topico.Topico;
import com.angelodev.forohub.repository.ITopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private ITopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@RequestBody DatosTopico datosTopico){
        System.out.println("El request llega correctamente");
        topicoRepository.save(new Topico(datosTopico));
    }

}
