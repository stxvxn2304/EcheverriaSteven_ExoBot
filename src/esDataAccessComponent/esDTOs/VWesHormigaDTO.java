package esDataAccessComponent.esDTOs;

public class VWesHormigaDTO {
    private String esIdHormiga;
    private String esTipo;
    private String esSexo;
    private String esEstadoHormiga;
    private String esNombre;
    private String esDescripcion;
    private String Estado;
    private String FechaCreacion;
    private String FechaModifica;

    public VWesHormigaDTO() {
    }

    public VWesHormigaDTO(String esIdHormiga, String esTipo, String esSexo, String esEstadoHormiga, String esNombre,
            String esDescripcion, String estado, String fechaCreacion, String fechaModifica) {
        this.esIdHormiga = esIdHormiga;
        this.esTipo = esTipo;
        this.esSexo = esSexo;
        this.esEstadoHormiga = esEstadoHormiga;
        this.esNombre = esNombre;
        this.esDescripcion = esDescripcion;
        Estado = estado;
        FechaCreacion = fechaCreacion;
        FechaModifica = fechaModifica;
    }

    public String getEsIdHormiga() {
        return esIdHormiga;
    }

    public void setEsIdHormiga(String esIdHormiga) {
        this.esIdHormiga = esIdHormiga;
    }

    public String getEsTipo() {
        return esTipo;
    }

    public void setEsTipo(String esTipo) {
        this.esTipo = esTipo;
    }

    public String getEsSexo() {
        return esSexo;
    }

    public void setEsSexo(String esSexo) {
        this.esSexo = esSexo;
    }

    public String getEsEstadoHormiga() {
        return esEstadoHormiga;
    }

    public void setEsEstadoHormiga(String esEstadoHormiga) {
        this.esEstadoHormiga = esEstadoHormiga;
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
                + "\n  IdHormiga       : " + getEsIdHormiga()
                + "\n  Tipo            : " + getEsTipo()
                + "\n  Sexo            : " + getEsSexo()
                + "\n  EstadoHormiga   : " + getEsEstadoHormiga()
                + "\n  Nombre          : " + getEsNombre()
                + "\n  Descripcion     : " + getEsDescripcion()
                + "\n  Estado          : " + getEstado()
                + "\n  FechaCreacion   : " + getFechaCreacion()
                + "\n  FechaModifica   : " + getFechaModifica()
                + "\n-----------------------------------";
    }

}
