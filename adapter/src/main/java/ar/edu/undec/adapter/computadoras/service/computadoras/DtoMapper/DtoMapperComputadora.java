package ar.edu.undec.adapter.computadoras.service.computadoras.DtoMapper;

import ar.edu.undec.adapter.computadoras.service.computadoras.dto.ComputadoraDto;
import computadoras.modelo.Computadora;

import java.util.ArrayList;
import java.util.List;

public class DtoMapperComputadora {
    public List<ComputadoraDto> convertListToDto(List<Computadora> computadoras){
        List<ComputadoraDto> computadoraDtos = new ArrayList<>();
        for (Computadora e : computadoras) {
            computadoraDtos.add(convertToDto(e));
        }
        return computadoraDtos;
    }

    private ComputadoraDto convertToDto(Computadora computadora){
        return new ComputadoraDto(computadora.getId(), computadora.getCodigo(), computadora.getProcesador(), computadora.getRam(), computadora.getDisco());
    }
}
