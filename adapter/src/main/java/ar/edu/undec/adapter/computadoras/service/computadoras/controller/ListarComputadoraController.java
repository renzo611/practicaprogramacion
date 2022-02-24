package ar.edu.undec.adapter.computadoras.service.computadoras.controller;

import ar.edu.undec.adapter.computadoras.service.computadoras.DtoMapper.DtoMapperComputadora;
import ar.edu.undec.adapter.computadoras.service.computadoras.dto.ComputadoraDto;
import computadoras.excepciones.ComputadoraException;
import computadoras.repositorio.IListarComputadoras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/computadoras")
public class ListarComputadoraController {

    @Autowired
    private IListarComputadoras listarComputadoras;

    @GetMapping
    public ResponseEntity<List<ComputadoraDto>> listarComputadoras() throws ComputadoraException {
        return new ResponseEntity<>(new DtoMapperComputadora().convertListToDto(listarComputadoras.listarComputaras()), HttpStatus.OK);
    }
}
