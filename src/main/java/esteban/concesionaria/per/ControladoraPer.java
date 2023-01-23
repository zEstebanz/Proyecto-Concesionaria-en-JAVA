package esteban.concesionaria.per;

import esteban.concesionaria.logica.Automovil;
import esteban.concesionaria.per.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Esteban Oller
 */
public class ControladoraPer {

    //Para q automovilJPA se comunique con la controladoraPer.
    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    
    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    //Metodo para traer los datos de la base de datos.
    public List<Automovil> traerAutos() {
        
        //Trae todo los Registro de la BD y la retorna a la logica.
        return autoJpa.findAutomovilEntities();
    
    }

    //Metodo para que busque el id en la BD y elimine.
    public void borrarAuto(int idAuto) {
        
        //un try por si no existe el id, y si lo ejecuta se rompe el programa. 
        //intenta hacer la eliminacion si no puede capta la excepcion y podemos seguir con el programa.
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAutos(int idAuto) {
        
        //Busca automovil con el id y lo retorna
        
        return autoJpa.findAutomovil(idAuto);
       
    }

    public void modificarAuto(Automovil auto) {
        try {
            //por ultimo editamos el auto con las modificaciones
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
