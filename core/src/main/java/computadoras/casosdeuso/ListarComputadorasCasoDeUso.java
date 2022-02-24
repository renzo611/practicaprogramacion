package computadoras.casosdeuso;

import computadoras.excepciones.ComputadoraException;
import computadoras.modelo.Computadora;
import computadoras.repositorio.IListarComputadoras;

import java.util.List;

public class ListarComputadorasCasoDeUso {

    private IListarComputadoras iListarComputadoras;

    public ListarComputadorasCasoDeUso(IListarComputadoras iListarComputadoras) {
        this.iListarComputadoras = iListarComputadoras;
    }

    public List<Computadora> listarComputadoras() throws ComputadoraException {
        return iListarComputadoras.listarComputaras();
    }

    public List<Computadora> listarComputadorasPorRam(String ram){
        return iListarComputadoras.listarComputadorasPorRam(ram);
    }
}
