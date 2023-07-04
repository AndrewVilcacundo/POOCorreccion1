import java.util.ArrayList;
import java.util.List;

public class Herencia {
    public static void main(String[] args) {
        List<Calle> calles = new ArrayList<>();

        // Crear objetos y almacenarlos en la lista
        Calle calle1 = new Calle("Pais1", "Ciudad1", "Barrio1", "Calle1");
        calles.add(calle1);

        Calle calle2 = new Calle("Pais2", "Ciudad2", "Barrio2", "Calle2");
        calles.add(calle2);

        // Acceder a los objetos almacenados en la lista
        for (Calle calle : calles) {
            System.out.println("País: " + calle.getNombre());
            System.out.println("Ciudad: " + calle.getNombreCiudad());
            System.out.println("Barrio: " + calle.getNombreBarrio());
            System.out.println("Calle: " + calle.getNombreCalle());
            System.out.println();
        }
    }
}