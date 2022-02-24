package ar.edu.undec.adapter.computadoras.data.computadoras.EntityMapper;

import ar.edu.undec.adapter.computadoras.data.computadoras.entity.ComputadoraEntity;
import computadoras.excepciones.ComputadoraException;
import computadoras.modelo.Computadora;

import java.util.ArrayList;
import java.util.List;

public class ComputadorasMapper {
    public List<Computadora> mapperToModel(List<ComputadoraEntity> computadoras) throws ComputadoraException {
        List<Computadora> computadoras1 = new ArrayList<>();
        for (ComputadoraEntity e: computadoras) {
            computadoras1.add(convertToModel(e));
        }
        return computadoras1;
    }

    private Computadora convertToModel(ComputadoraEntity entity) throws ComputadoraException {
        return Computadora.factoryComputadora(entity.getId(), entity.getCodigo(), entity.getProcesador(), entity.getRam(), entity.getDisco());
    }

}
