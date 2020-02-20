package main;

import controlador.ControlSistema;
import modelo.Sistema;
import vista.FramePrincipal;
import vista.InicioSesion;

public class Main {
    
    public static void main (String [] args){
        Sistema s = new Sistema ("2.0", "Sist. de Informacion de Telecomunicaciones S.A.");
        ControlSistema cs = new ControlSistema (s);
        FramePrincipal fp = new FramePrincipal (cs);
        InicioSesion is = new InicioSesion (cs, fp);
        is.setVisible(true);
        is.setLocationRelativeTo(null);
    }
}
