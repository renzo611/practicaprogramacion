package ar.edu.undec.adapter.computadoras.data.computadoras.iterator;

import ar.edu.undec.adapter.computadoras.data.computadoras.EntityMapper.ComputadorasMapper;
import ar.edu.undec.adapter.computadoras.data.computadoras.crudRepository.FiltrarComputadorasPorRamCrudRepository;
import computadoras.excepciones.ComputadoraException;
import computadoras.modelo.Computadora;
import computadoras.repositorio.IFiltrarComputadorasPorRam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiltrarComputadorasPorRam implements IFiltrarComputadorasPorRam {
    @Autowired
    private FiltrarComputadorasPorRamCrudRepository repository;

    @Override
    public List<Computadora> filtrarComputadoras(String ram) throws ComputadoraException {
        return new ComputadorasMapper().mapperToModel(repository.findByRam(ram));
    }
}
