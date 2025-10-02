package miTiendita;
import miTiendita.Vista.miHome_tienda;
/**
 *
 * @author gabriela.dominguez
 */
public class Demo_Tienda {
    
    public static void main(String []gg){
        
//        ** Visualizar datos iniciales.**
//        EstructuraContenido ec = new EstructuraContenido();
//        ListIterator<Producto> litP = ec.getMisDatos().listIterator();
//        
//        while(litP.hasNext()){
//            Producto p = litP.next();
//            System.out.println("Nombre: " + p.getNombre() + " | Marca: " + p.getMarca() + " | Precio: " + p.getPrecio());
//        }

        new miHome_tienda().setVisible(true);
    }
}
