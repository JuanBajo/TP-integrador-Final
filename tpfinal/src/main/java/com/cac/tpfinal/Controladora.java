
package com.cac.tpfinal;

import com.cac.persistencia.ControladoraPersistencia;
import com.cac.persistencia.exceptions.NonexistentEntityException;
import java.util.List;


public class Controladora {
 
    ControladoraPersistencia controlPers = new ControladoraPersistencia();
    
    
    public void crearOrador(Orador ora){
        controlPers.crearOrador(ora);
    }
    
    public List<Orador> traerOradores(){
        return controlPers.traerOradores();
    }

    public void borrarOrador(int idEliminar) throws NonexistentEntityException {
        controlPers.borrarOrador(idEliminar);
    }

    public Orador traerOrador(int idEditar) {
        return controlPers.traerOradores(idEditar);
    }

    public void editarOrador(Orador oraEditar) {
        controlPers.editarOrador(oraEditar);
    }


    
}
