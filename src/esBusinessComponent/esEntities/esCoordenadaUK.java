package esBusinessComponent.esEntities;

public class esCoordenadaUK {
    private String esGeoposicion;
    private String esTipoArsenal;
    private Boolean esAccion;

    public esCoordenadaUK(String esGeoposicion, String esTipoArsenal, Boolean esAccion) {
        this.esGeoposicion = esGeoposicion;
        this.esTipoArsenal = esTipoArsenal;
        this.esAccion = esAccion;
    }

    public String getEsGeoposicion() {
        return esGeoposicion;
    }

    public void setEsGeoposicion(String esGeoposicion) {
        this.esGeoposicion = esGeoposicion;
    }

    public String getEsTipoArsenal() {
        return esTipoArsenal;
    }

    public void setEsTipoArsenal(String esTipoArsenal) {
        this.esTipoArsenal = esTipoArsenal;
    }

    public Boolean getEsAccion() {
        return esAccion;
    }

    public void setEsAccion(Boolean esAccion) {
        this.esAccion = esAccion;
    }

    @Override
    public String toString() {
        return getClass().getName()
                + " \n Geoposicion  : " + getEsGeoposicion()
                + " \n TipoArsenal  : " + getEsTipoArsenal()
                + " \n Accion       : " + getEsAccion();
    }

}
