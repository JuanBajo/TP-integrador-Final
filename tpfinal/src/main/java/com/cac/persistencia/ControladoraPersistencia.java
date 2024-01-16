
package com.cac.persistencia;

import com.cac.persistencia.exceptions.NonexistentEntityException;
import com.cac.tpfinal.Orador;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    OradorJpaController orajpa = new OradorJpaController();
    
    
    public void crearOrador(Orador ora){
        orajpa.create(ora);
    }
    
    public List<Orador> traerOradores(){
        return orajpa.findOradorEntities();
    }

    public void borrarOrador(int idEliminar) throws NonexistentEntityException {
        orajpa.destroy(idEliminar);
    }

    public Orador traerOradores(int idEditar) {
        return orajpa.findOrador(idEditar);
    }

    public void editarOrador(Orador oraEditar) {
        try {
            orajpa.edit(oraEditar);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
