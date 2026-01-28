package esDataAccessComponent.esDTOs;

public class esEstadoDTO {
    private Integer esIdEstado;     
    private String  esNombre;       
    private String  esDescripcion;  
    private String  Estado;       
    private String  FechaCreacion;
    private String  FechaModifica;


    public esEstadoDTO() {
    }

    public esEstadoDTO(String esnombre, String esdescripcion) {
        esIdEstado = 0;
        esNombre = esnombre;
        esDescripcion = esdescripcion;
    }
    
    public esEstadoDTO(Integer esidEstado, String esnombre, String esdescripcion, String estado, String fechaCreacion,
            String fechaModifica) {
        esIdEstado = esidEstado;
        esNombre = esnombre;
        esDescripcion = esdescripcion;
        Estado = estado;
        FechaCreacion = fechaCreacion;
        FechaModifica = fechaModifica;
    }

    public Integer getesIdEstado() {
        return esIdEstado;
    }
    public void setesIdEstado(Integer esidEstado) {
        esIdEstado = esidEstado;
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
   public String toString(){
        return getClass().getName()
        + "\n esIdEstado      : "+ getesIdEstado      ()
        + "\n esNombre        : "+ getesNombre        ()
        + "\n esDescripcion   : "+ getesDescripcion   ()
        + "\n Estado        : "+ getEstado        ()
        + "\n FechaCreacion : "+ getFechaCreacion ()
        + "\n FechaModifica : "+ getFechaModifica ();
    }
}
