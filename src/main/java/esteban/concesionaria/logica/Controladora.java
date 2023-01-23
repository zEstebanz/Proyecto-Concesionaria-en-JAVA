package esteban.concesionaria.logica;

import esteban.concesionaria.per.ControladoraPer;
import java.util.List;

/**
 *
 * @author Esteban Oller
 */
public class Controladora {

    //Crear una nueva variable de instancia para usarse en todos los metodos.
    ControladoraPer controlPersis = new ControladoraPer();

    //Metodo AgregarAutomovil
    public void agregarAutomovil(String modelo, String marca, String motor,
            String color, String patente) {

        //La funciona de la loguica es pasar los datos de las entradas y modela, creando un auto
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);


        //Paso el objeto auto al la persistencia y de ahi se agrega a la BD
        controlPersis.agregarAutomovil(auto);
    }

    //Metodo para traer autos, hace un pasan
    public List<Automovil> traerAutos() {

        //Ejecuta el metodo traerAutos, toma la lista y la retorna a quien llama este metodo
        return controlPersis.traerAutos();

    }

    //Metodo para q el id lo mande a la per
    public void borrarAuto(int idAuto) {

        controlPersis.borrarAuto(idAuto);

    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAutos(idAuto);
    }

    //Metodo para modificar el original
    public void modificarAuto(Automovil auto, String modelo, String marca, String color, String patente, String motor) {
        
        //al auto original no podemos cambiar el id 
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPatente(patente);

        //Le pido a la per que modifique 
        controlPersis.modificarAuto(auto);
    }

}
