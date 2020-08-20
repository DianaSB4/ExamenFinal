
package Interfaces;
import Modelo.Rol;
import java.util.List;

public interface CRUDrol {
    
    public List listarol();
    public Rol buscarrol(int idrol);
    public boolean agregarrol(Rol rol);
    public boolean editarrol(Rol rol);
    public boolean eliminarrol(int idrol);
    
}
