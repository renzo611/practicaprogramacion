package ar.edu.undec.adapter.computadoras.service.computadoras.dto;

public class ComputadoraDto {
    private Integer id;
    private String codigo;
    private String procesador;
    private String ram;
    private String disco;

    public ComputadoraDto(Integer id, String codigo, String procesador, String ram, String disco) {
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
}
