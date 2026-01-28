package esDataAccessComponent.esDTOs;

public class esSexoDTO {
    private Integer esIdSexo;
    private String esNombre;
    private String esDescripcion;
    private String Estado;
    private String FechaCreacion;
    private String FechaModifica;

    public esSexoDTO() {
    }

    public esSexoDTO(String esNombre, String esDescripcion) {
        this.esIdSexo = 0;
        this.esNombre = esNombre;
        this.esDescripcion = esDescripcion;
    }

    public esSexoDTO(Integer esIdSexo, String esNombre, String esDescripcion, String estado, String fechaCreacion,
            String fechaModifica) {
        this.esIdSexo = esIdSexo;
        this.esNombre = esNombre;
        this.esDescripcion = esDescripcion;
        Estado = estado;
        FechaCreacion = fechaCreacion;
        FechaModifica = fechaModifica;
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
                + "\n IdSexo        : " + getEsIdSexo()
                + "\n Nombre        : " + getEsNombre()
                + "\n Descripcion   : " + getEsDescripcion()
                + "\n Estado        : " + getEstado()
                + "\n FechaCreacion : " + getFechaCreacion()
                + "\n FechaModifica : " + getFechaModifica();
    }
}
