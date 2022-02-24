package computadoras.repositorio;

import computadoras.excepciones.ComputadoraException;
import computadoras.modelo.Computadora;

import java.util.List;

public interface IListarComputadoras {
    public List<Computadora> listarComputaras() throws ComputadoraException;
    public List<Computadora> listarComputadorasPorRam(String ram);
}
