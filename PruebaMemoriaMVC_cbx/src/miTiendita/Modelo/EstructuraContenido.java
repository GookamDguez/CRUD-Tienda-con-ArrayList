package miTiendita.Modelo;
import java.util.ArrayList;
/**
 *
 * @author gabriela.dominguez
 */
public class EstructuraContenido {
    
    private ArrayList<Producto> misDatos;

    public EstructuraContenido() {
        misDatos = new ArrayList<>();
        CargarDato();
    }

    public ArrayList<Producto> getMisDatos() {
        return misDatos;
    }
    
    private void CargarDato(){
    
        misDatos.add(new Producto("Queso", 3.50, "Petacones"));
        misDatos.add(new Producto("Frijoles", 2.50, "La chula"));
        misDatos.add(new Producto("Sopa pollo", 0.90, "Maruchan"));
        misDatos.add(new Producto("Azucar morena", 2.34, "Del cañal"));
        misDatos.add(new Producto("Crema", 3.50, "Salud"));
        misDatos.add(new Producto("Pan de Caja", 3.45, "Lido"));
        misDatos.add(new Producto("Queso Morolique", 3.00, "Salud"));
    }
    
    public void Agregar_Productos(String nombre, Double precio, String marca){
        misDatos.add(new Producto(nombre, precio, marca));
    }
    
    public void Actualizar_Producto(int id, String nom, Double prec, String marc){
        Producto prod = misDatos.get(id);
        
        if(nom != null){ prod.setNombre(nom); }
        if(prec != null){ prod.setPrecio(prec); }
        if(marc != null){ prod.setMarca(marc); }
    }
}
