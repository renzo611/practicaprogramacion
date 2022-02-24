package computadoras;

import computadoras.casosdeuso.ListarComputadorasCasoDeUso;
import computadoras.excepciones.ComputadoraException;
import computadoras.modelo.Computadora;
import computadoras.repositorio.IListarComputadoras;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class TestListComputadoras {
    @Mock
    IListarComputadoras iListarComputadoras;

    @Test
    public void listarComputadoras(){
        Mockito.when(iListarComputadoras.listarComputadorasPorRam("12")).thenReturn(null);
        ListarComputadorasCasoDeUso listarComputadorasCasoDeUso = new ListarComputadorasCasoDeUso(iListarComputadoras);
        assertEquals(listarComputadorasCasoDeUso.listarComputadorasPorRam("12"),null);
    }

    @Test
    public void listarComputadorasPorRam() throws ComputadoraException {
        Computadora computadora = Computadora.factoryComputadora(1,"1234-321-2","i3-7100","8","disco 1tb");
        ListarComputadorasCasoDeUso listarComputadorasCasoDeUso = new ListarComputadorasCasoDeUso(iListarComputadoras);
        Mockito.when(iListarComputadoras.listarComputaras()).thenReturn(Arrays.asList(computadora));
        assertEquals(listarComputadorasCasoDeUso.listarComputadoras(),Arrays.asList(computadora));
    }
}
