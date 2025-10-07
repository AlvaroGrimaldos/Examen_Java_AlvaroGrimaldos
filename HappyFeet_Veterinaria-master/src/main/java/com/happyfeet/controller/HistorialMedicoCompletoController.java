/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.happyfeet.controller;

import com.happyfeet.model.entities.Mascota;
import com.happyfeet.repository.IMascotaDAO;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author camper
 */
public class HistorialMedicoCompletoController {
        private static final Logger logger =  LogManager.getLogger(HistorialMedicoCompletoController.class);
        private IMascotaDAO mascotaDAO;

    public HistorialMedicoCompletoController(IMascotaDAO mascotaDAO) {
        this.mascotaDAO = mascotaDAO;
    }
        
        
    public void mostrarHistorialClinico(Mascota mascota){
        List<Mascota> lista = mascotaDAO.listarConInformacionCompleta();
        if(lista.isEmpty()) {
            logger.info("No hay informacion de mascota");
        } else {
            lista.stream().forEach(n -> System.out.println(n));
        }
    }
        
        

}
