package esDataAccessComponent.esDTOs;

public class esEntomologoDTO {
    private Integer esIdEntomologo; 
    private String esUsuario      ;
    private String esClave        ;
    private String Estado       ;
    private String FechaCreacion;
    private String FechaModifica;

    public esEntomologoDTO() {
    }

    public esEntomologoDTO(String esusuario, String esclave) {
        esIdEntomologo = 0;
        esUsuario = esusuario;
        esClave = esclave;
    }

    

    public esEntomologoDTO(Integer esidEntomologo, String esusuario, String esclave, String estado, String fechaCreacion,
            String fechaModifica) {
        esIdEntomologo = esidEntomologo;
        esUsuario = esusuario;
        esClave = esclave;
        Estado = estado;
        FechaCreacion = fechaCreacion;
        FechaModifica = fechaModifica;
    }
    public Integer getesIdEntomologo() {
        return esIdEntomologo;
    }
    public void setesIdEntomologo(Integer esidEntomologo) {
        esIdEntomologo = esidEntomologo;
    }
    public String getesUsuario() {
        return esUsuario;
    }
    public void setesUsuario(String esusuario) {
        esUsuario = esusuario;
    }
    public String getesClave() {
        return esClave;
    }
    public void setesClave(String esclave) {
        esClave = esclave;
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
        + "\n esIdEntomologo  : "+ getesIdEntomologo  ()
        + "\n esUsuario       : "+ getesUsuario       ()
        + "\n esClave         : "+ getesClave         ()
        + "\n Estado        : "+ getEstado        ()
        + "\n FechaCreacion : "+ getFechaCreacion ()
        + "\n FechaModifica : "+ getFechaModifica ();
    }  
}
