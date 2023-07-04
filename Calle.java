class Calle extends Barrio {
    private String nombreCalle;

    public Calle(String nombrePais, String nombreCiudad, String nombreBarrio, String nombreCalle) {
        super(nombrePais, nombreCiudad, nombreBarrio);
        this.nombreCalle = nombreCalle;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }
}
