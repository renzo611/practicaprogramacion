package computadoras;

import computadoras.excepciones.ComputadoraException;
import computadoras.excepciones.InvalidIdException;
import computadoras.excepciones.InvalidMemoryException;
import computadoras.excepciones.InvalidStringException;
import computadoras.modelo.Computadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestComputadora {
    @Test
    public void test_instancia_vehiculo_sin_errores() throws ComputadoraException {
        Computadora computadora = Computadora.factoryComputadora(1,"1234-321-2","i3-7100","8","disco 1tb");
        assertNotNull(computadora);
    }

    @Test
    public void test_instancia_campos_null() throws ComputadoraException {
        assertThrows(InvalidIdException.class,() -> Computadora.factoryComputadora(null, "1234-321-2","i3-7100","8","disco 1tb"));
        assertThrows(InvalidStringException.class,() -> Computadora.factoryComputadora(1, null,"i3-7100","8","disco 1tb"));
        assertThrows(InvalidStringException.class,() -> Computadora.factoryComputadora(2, "1234-321-2",null,"8","disco 1tb"));
        assertThrows(InvalidStringException.class,() -> Computadora.factoryComputadora(3, "1234-321-2","i3-7100",null,"disco 1tb"));
        assertThrows(InvalidStringException.class,()-> Computadora.factoryComputadora(3, "1234-321-2","i3-7100","8",null));
    }

    @Test
    public void test_instancia_cantidad_de_memoria_incorrecta(){
        assertThrows(InvalidMemoryException.class,() -> Computadora.factoryComputadora(1, "1234-321-2","i3-7100","12","disco 1tb"));
        assertThrows(InvalidMemoryException.class,() -> Computadora.factoryComputadora(2, "1234-321-2","i3-7100","14","disco 1tb"));
        assertThrows(InvalidMemoryException.class,() -> Computadora.factoryComputadora(3, "1234-321-2","i3-7100","3","disco 1tb"));
        assertThrows(InvalidMemoryException.class,() -> Computadora.factoryComputadora(4, "1234-321-2","i3-7100","24","disco 1tb"));
    }

    @Test
    public void test_instancia_cantidad_de_memoria_correcta() throws ComputadoraException {
        assertNotNull(Computadora.factoryComputadora(1, "1234-321-2","i3-7100","2","disco 1tb"));
        assertNotNull(Computadora.factoryComputadora(2, "1234-321-2","i3-7100","4","disco 1tb"));
        assertNotNull(Computadora.factoryComputadora(3, "1234-321-2","i3-7100","8","disco 1tb"));
        assertNotNull(Computadora.factoryComputadora(4, "1234-321-2","i3-7100","16","disco 1tb"));
    }
}
