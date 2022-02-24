package ar.edu.undec.adapter.computadoras.data.computadoras.iterator;

import ar.edu.undec.adapter.computadoras.data.computadoras.EntityMapper.ComputadorasMapper;
import ar.edu.undec.adapter.computadoras.data.computadoras.crudRepository.ListarComputadorasCrudRepository;
import computadoras.excepciones.ComputadoraException;
import computadoras.modelo.Computadora;
import computadoras.repositorio.IListarComputadoras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarComputadoras implements IListarComputadoras {
    @Autowired
    private ListarComputadorasCrudRepository repository;

    @Override
    public List<Computadora> listarComputaras() throws ComputadoraException {
        return new ComputadorasMapper().mapperToModel(repository.findAll());
    }

    @Override
    public List<Computadora> listarComputadorasPorRam(String ram) {
        return null;
    }

}
