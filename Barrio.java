class Barrio extends Ciudad {
    private String nombreBarrio;

    public Barrio(String nombrePais, String nombreCiudad, String nombreBarrio) {
        super(nombrePais, nombreCiudad);
        this.nombreBarrio = nombreBarrio;
    }

    public String getNombreBarrio() {
        return nombreBarrio;
    }

    public void setNombreBarrio(String nombreBarrio) {
        this.nombreBarrio = nombreBarrio;
    }
}