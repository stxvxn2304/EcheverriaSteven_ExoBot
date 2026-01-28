package esDataAccessComponent.esDTOs;

public class esHormigaDTO {

    private Integer esIdHormiga;
    private Integer esIdHormigaTipo;
    private Integer esIdSexo;
    private Integer esIdEstado;
    private String esNombre;
    private String esDescripcion;
    private String Estado;
    private String FechaCreacion;
    private String FechaModifica;

    public esHormigaDTO() {
    }

    public esHormigaDTO(Integer esIdHormigaTipo, Integer esIdSexo, Integer esIdEstado,
            String esNombre, String esDescripcion) {
        this.esIdHormiga = 0;
        this.esIdHormigaTipo = esIdHormigaTipo;
        this.esIdSexo = esIdSexo;
        this.esIdEstado = esIdEstado;
        this.esNombre = esNombre;
        this.esDescripcion = esDescripcion;
    }

    public esHormigaDTO(Integer esIdHormiga, Integer esIdHormigaTipo, Integer esIdSexo, Integer esIdEstado,
            String esNombre, String esDescripcion, String estado, String fechaCreacion, String fechaModifica) {
        this.esIdHormiga = esIdHormiga;
        this.esIdHormigaTipo = esIdHormigaTipo;
        this.esIdSexo = esIdSexo;
        this.esIdEstado = esIdEstado;
        this.esNombre = esNombre;
        this.esDescripcion = esDescripcion;
        Estado = estado;
        FechaCreacion = fechaCreacion;
        FechaModifica = fechaModifica;
    }

    public Integer getEsIdHormiga() {
        return esIdHormiga;
    }

    public void setEsIdHormiga(Integer esIdHormiga) {
        this.esIdHormiga = esIdHormiga;
    }

    public Integer getEsIdHormigaTipo() {
        return esIdHormigaTipo;
    }

    public void setEsIdHormigaTipo(Integer esIdHormigaTipo) {
        this.esIdHormigaTipo = esIdHormigaTipo;
    }

    public Integer getEsIdSexo() {
        return esIdSexo;
    }

    public void setEsIdSexo(Integer esIdSexo) {
        this.esIdSexo = esIdSexo;
    }

    public Integer getEsIdEstado() {
        return esIdEstado;
    }

    public void setEsIdEstado(Integer esIdEstado) {
        this.esIdEstado = esIdEstado;
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
                + "\n IdHormiga     : " + getEsIdHormiga()
                + "\n IdHormigaTipo : " + getEsIdHormigaTipo()
                + "\n IdSexo        : " + getEsIdSexo()
                + "\n IdEstado      : " + getEsIdEstado()
                + "\n Nombre        : " + getEsNombre()
                + "\n Descripcion   : " + getEsDescripcion()
                + "\n Estado        : " + getEstado()
                + "\n FechaCreacion : " + getFechaCreacion()
                + "\n FechaModifica : " + getFechaModifica();
    }
}
