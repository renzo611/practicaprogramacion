package ar.edu.undec.adapter.computadoras.service.computadoras.controller;

import ar.edu.undec.adapter.computadoras.service.computadoras.DtoMapper.DtoMapperComputadora;
import ar.edu.undec.adapter.computadoras.service.computadoras.dto.ComputadoraDto;
import computadoras.excepciones.ComputadoraException;
import computadoras.repositorio.IFiltrarComputadorasPorRam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/computadoras")
public class FiltrarComputadoraController {

    @Autowired
    private IFiltrarComputadorasPorRam filtrarComputadorasPorRam;

    @GetMapping("/ram/{ram}")
    public ResponseEntity<List<ComputadoraDto>> filtrarComputadoras(@PathVariable String ram) throws ComputadoraException {
        return new ResponseEntity<>(new DtoMapperComputadora().convertListToDto(filtrarComputadorasPorRam.filtrarComputadoras(ram)), HttpStatus.OK);
    }
}
