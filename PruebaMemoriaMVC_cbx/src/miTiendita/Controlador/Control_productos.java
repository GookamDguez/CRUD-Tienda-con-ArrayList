package miTiendita.Controlador;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import miTiendita.Modelo.*;
import java.util.LinkedHashSet;
/**
 *
 * @author gabriela.dominguez
 */
public class Control_productos {

    EstructuraContenido ec;
    
    public Control_productos() {
        ec = new EstructuraContenido();
    }
    
    public boolean Control_Agregar_Producto(String nameP, Double pisto, String marca){
        
        if( !Verificar_Nombre_Producto(nameP) ){
            ec.Agregar_Productos(nameP, pisto, marca);
            return true;
        }else{
            return false;
        }
    }
    
    private boolean Verificar_Nombre_Producto(String Nombre_Poducto){
        for(Producto x : ec.getMisDatos()){
            if(Nombre_Poducto.equals(x.getNombre())){
                return true;
            }
        }
        return false;
    }
    
    public boolean Control_Actualizar_Producto(int id_p, String name, Double money, String brand){
        if(name != null || money != null || brand != null){
            ec.Actualizar_Producto(id_p, name, money, brand);
            return true;
        }
        return false;
    }
    
    public DefaultComboBoxModel ModeloCBX_marcas(){
    
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        // Sacando marcas unicas
        LinkedHashSet<String> unicos = new LinkedHashSet<>();
        for(Producto pro : ec.getMisDatos()){
            unicos.add(pro.getMarca());
        }
        for(String x : unicos){
            modelo.addElement(x);
        } 
        return modelo;
    }
    
    public DefaultTableModel Modelo_TablaProductos(){
        
        String[] encabezados = {"Nombre Producto", "Precio", "Marca"};    
        // null para indicar que no tendrá datos al inicio.
        DefaultTableModel model_tabla = new DefaultTableModel(null, encabezados);
        for(Producto p : ec.getMisDatos()){
            Object[] fila = new Object[]{
                p.getNombre(),
                p.getPrecio(),
                p.getMarca()
            };
            model_tabla.addRow(fila);
        }
        return model_tabla;
    }
    
}
