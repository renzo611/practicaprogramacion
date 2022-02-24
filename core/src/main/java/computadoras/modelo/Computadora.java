package computadoras.modelo;

import computadoras.excepciones.ComputadoraException;
import computadoras.excepciones.InvalidIdException;
import computadoras.excepciones.InvalidMemoryException;
import computadoras.excepciones.InvalidStringException;

public class Computadora {
    private Integer id;
    private String codigo;
    private String procesador;
    private String ram;
    private String disco;

    public static Computadora factoryComputadora(Integer id, String codigo, String procesador, String ram, String disco) throws ComputadoraException {
        isValidString(codigo,"codigo");
        isValidString(procesador,"procesador");
        isValidString(ram,"ram");
        isValidMemory(ram);
        isValidString(disco,"disco");
        isValidId(id);
        return new Computadora(id,codigo,procesador,ram,disco);
    }

    private Computadora(Integer id, String codigo, String procesador, String ram, String disco) {
        this.id = id;
        this.codigo = codigo;
        this.procesador = procesador;
        this.ram = ram;
        this.disco = disco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    private static void isValidString(String e,String nombre) throws InvalidStringException {
        if(e == null || e.isEmpty() ||  e.isBlank()){
            throw new InvalidStringException("El campo " + nombre+ " no puede ser null");
        }
    }

    private static void isValidId(Integer e) throws InvalidIdException {
        if(e == null || e <= 0){
            throw new InvalidIdException("El id ingresado no puede ser nulo o menor o igual a 0");
        }
    }

    private static void isValidMemory(String memory) throws InvalidMemoryException {
        int x = Integer.valueOf(memory);
        if((x != 0) && ((x & (x - 1)) == 0) == false){
            throw new InvalidMemoryException("La memoria debe ser potencia de 2");
        }
    }
}
