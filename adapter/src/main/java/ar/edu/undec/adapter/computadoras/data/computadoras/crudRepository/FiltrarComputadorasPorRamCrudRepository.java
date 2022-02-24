package ar.edu.undec.adapter.computadoras.data.computadoras.crudRepository;

import ar.edu.undec.adapter.computadoras.data.computadoras.entity.ComputadoraEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FiltrarComputadorasPorRamCrudRepository extends CrudRepository<ComputadoraEntity,Integer> {
    List<ComputadoraEntity> findByRam(String ram);
}
