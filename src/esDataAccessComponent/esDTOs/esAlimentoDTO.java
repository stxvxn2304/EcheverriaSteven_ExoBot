package esDataAccessComponent.esDTOs;

public class esAlimentoDTO {
    private Integer esIdAlimento;
    private Integer esIdAlimentoTipo;
    private String esNombre;
    private String esDescripcion;
    private String Estado;
    private String FechaCreacion;
    private String FechaModifica;

    public esAlimentoDTO() {
    }

    public esAlimentoDTO(Integer esIdAlimentoTipo, String esNombre, String esDescripcion) {
        this.esIdAlimentoTipo = esIdAlimentoTipo;
        this.esNombre = esNombre;
        this.esDescripcion = esDescripcion;
    }

    public esAlimentoDTO(Integer esIdAlimento, Integer esIdAlimentoTipo, String esNombre, String esDescripcion,
            String estado, String fechaCreacion, String fechaModifica) {
        this.esIdAlimento = esIdAlimento;
        this.esIdAlimentoTipo = esIdAlimentoTipo;
        this.esNombre = esNombre;
        this.esDescripcion = esDescripcion;
        Estado = estado;
        FechaCreacion = fechaCreacion;
        FechaModifica = fechaModifica;
    }

    public Integer getEsIdAlimento() {
        return esIdAlimento;
    }

    public void setEsIdAlimento(Integer esIdAlimento) {
        this.esIdAlimento = esIdAlimento;
    }

    public Integer getEsIdAlimentoTipo() {
        return esIdAlimentoTipo;
    }

    public void setEsIdAlimentoTipo(Integer esIdAlimentoTipo) {
        this.esIdAlimentoTipo = esIdAlimentoTipo;
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

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    public String getFechaModifica() {
        return FechaModifica;
    }

    public void setFechaModifica(String fechaModifica) {
        FechaModifica = fechaModifica;
    }

    @Override
    public String toString() {
        return getClass().getName()
                + "\n IdAlimento      : " + getEsIdAlimento()
                + "\n IdAlimentoTipo  : " + getEsIdAlimentoTipo()
                + "\n Nombre          : " + getEsNombre()
                + "\n Descripcion     : " + getEsDescripcion()
                + "\n Estado          : " + getEstado()
                + "\n FechaCreacion   : " + getFechaCreacion()
                + "\n FechaModifica   : " + getFechaModifica()
                + "\n --------------------------- ";
    }

}
