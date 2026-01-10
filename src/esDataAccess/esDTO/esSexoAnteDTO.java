package esDataAccess.esDTO;

public class esSexoAnteDTO {
    private Integer esIdSexo;
    private String  esNombre;
    private String  esEstado;
    private String  esFechaCreacion;
    private String  esFechaModifica;

    public esSexoAnteDTO() {
    }

    public esSexoAnteDTO(String esNombre) {
        this.esNombre = esNombre;
    }

    public esSexoAnteDTO(Integer esIdSexo, String esNombre, String esEstado, String esFechaCreacion,
            String esFechaModifica) {
        this.esIdSexo = esIdSexo;
        this.esNombre = esNombre;
        this.esEstado = esEstado;
        this.esFechaCreacion = esFechaCreacion;
        this.esFechaModifica = esFechaModifica;
    }

    public Integer getEsIdSexo() {
        return esIdSexo;
    }

    public void setEsIdSexo(Integer esIdSexo) {
        this.esIdSexo = esIdSexo;
    }

    public String getEsNombre() {
        return esNombre;
    }

    public void setEsNombre(String esNombre) {
        this.esNombre = esNombre;
    }

    public String getEsEstado() {
        return esEstado;
    }

    public void setEsEstado(String esEstado) {
        this.esEstado = esEstado;
    }

    public String getEsFechaCreacion() {
        return esFechaCreacion;
    }

    public void setEsFechaCreacion(String esFechaCreacion) {
        this.esFechaCreacion = esFechaCreacion;
    }

    public String getEsFechaModifica() {
        return esFechaModifica;
    }

    public void setEsFechaModifica(String esFechaModifica) {
        this.esFechaModifica = esFechaModifica;
    }

    @Override
    public String toString() {
        return getClass().getName() 
            + "\n IdSexo:         "+ getEsIdSexo()  
            + "\n Nombre:         "+ getEsNombre()    
            + "\n Estado:         "+ getEsEstado()    
            + "\n FechaCreacion:  "+ getEsFechaCreacion()
            + "\n FechaModifica:  "+ getEsFechaModifica();
    }        

}
