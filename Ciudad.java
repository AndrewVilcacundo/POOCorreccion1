class Ciudad extends Pais {
    private String nombreCiudad;

    public Ciudad(String nombrePais, String nombreCiudad) {
        super(nombrePais);
        this.nombreCiudad = nombreCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
}