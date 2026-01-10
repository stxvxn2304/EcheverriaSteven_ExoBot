package esDataAccess.esDTO;

public class esEstadoCivilDTO {
    private Integer esIdCatalogo     ;     
    private Integer esIdCatalogoTipo ;         
    private String esNombre          ;
    private String esDescripcion     ;     
    private String esEstado          ;
    private String esFechaCreacion   ;       
    private String esFechaModifica   ;       
    
    public esEstadoCivilDTO() {}
    public esEstadoCivilDTO(Integer esIdCatalogo, Integer esIdCatalogoTipo, String esNombre, String esDescripcion,
            String esEstado, String esFechaCreacion, String esFechaModifica) {
        this.esIdCatalogo = esIdCatalogo;
        this.esIdCatalogoTipo = esIdCatalogoTipo;
        this.esNombre = esNombre;
        this.esDescripcion = esDescripcion;
        this.esEstado = esEstado;
        this.esFechaCreacion = esFechaCreacion;
        this.esFechaModifica = esFechaModifica;
    }
    public Integer getEsIdCatalogo() {
        return esIdCatalogo;
    }
    public void setEsIdCatalogo(Integer esIdCatalogo) {
        this.esIdCatalogo = esIdCatalogo;
    }
    public Integer getEsIdCatalogoTipo() {
        return esIdCatalogoTipo;
    }
    public void setEsIdCatalogoTipo(Integer esIdCatalogoTipo) {
        this.esIdCatalogoTipo = esIdCatalogoTipo;
    }
    public String getEsNombre() {
        return esNombre;
    }
    public void setEsNombre(String esNombre) {
        this.esNombre = esNombre;
    }
    public String getEsDescripcion() {
        return esDescripcion;
    }
    public void setEsDescripcion(String esDescripcion) {
        this.esDescripcion = esDescripcion;
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
                + "\n IdCatalogo:     " + getEsIdCatalogo()
                + "\n IdCatalogoTipo: " + getEsIdCatalogoTipo()
                + "\n Nombre:         " + getEsNombre()
                + "\n Descripcion:    " + getEsDescripcion()
                + "\n Estado:         " + getEsEstado()
                + "\n FechaCreacion:  " + getEsFechaCreacion()
                + "\n FechaModifica:  " + getEsFechaModifica();
    }
}
