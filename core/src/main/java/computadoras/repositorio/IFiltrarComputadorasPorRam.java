package computadoras.repositorio;

import computadoras.excepciones.ComputadoraException;
import computadoras.modelo.Computadora;

import java.util.List;

public interface IFiltrarComputadorasPorRam {
    List<Computadora> filtrarComputadoras(String ram) throws ComputadoraException;
}
