package esDataAccessComponent.esDTOs;

public class esHormigaTipoDTO {
    private Integer esIdHormigaTipo;
    private String esNombre;
    private String esDescripcion;
    private String Estado;
    private String FechaCreacion;
    private String FechaModifica;

    public esHormigaTipoDTO() {
    }

    public esHormigaTipoDTO(String esnombre, String esdescripcion) {
        esIdHormigaTipo = 0;
        esNombre = esnombre;
        esDescripcion = esdescripcion;
    }

    public esHormigaTipoDTO(Integer esidHormigaTipo, String esnombre, String esdescripcion, String estado,
            String fechaCreacion,
            String fechaModifica) {
        esIdHormigaTipo = esidHormigaTipo;
        esNombre = esnombre;
        esDescripcion = esdescripcion;
        Estado = estado;
        FechaCreacion = fechaCreacion;
        FechaModifica = fechaModifica;
    }

    public Integer getesIdHormigaTipo() {
        return esIdHormigaTipo;
    }

    public void setesIdHormigaTipo(Integer esidHormigaTipo) {
        esIdHormigaTipo = esidHormigaTipo;
    }

    public String getesNombre() {
        return esNombre;
    }

    public void setesNombre(String esnombre) {
        esNombre = esnombre;
    }

    public String getesDescripcion() {
        return esDescripcion;
    }

    public void setesDescripcion(String esdescripcion) {
        esDescripcion = esdescripcion;
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
                + "\n esIdHormigaTipo: " + getesIdHormigaTipo()
                + "\n esNombre        : " + getesNombre()
                + "\n esDescripcion   : " + getesDescripcion()
                + "\n Estado        : " + getEstado()
                + "\n FechaCreacion : " + getFechaCreacion()
                + "\n FechaModifica : " + getFechaModifica()
                + "\n --------------------------- ";
    }
}
