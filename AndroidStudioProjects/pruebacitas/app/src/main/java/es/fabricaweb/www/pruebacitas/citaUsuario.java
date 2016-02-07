package es.fabricaweb.www.pruebacitas;

import java.util.Date;
import java.util.Timer;

/**
 * Created by Administrador on 6/02/16.
 */
public class citaUsuario {

    private String Gestor;
    private String Agenda;
    private Date Fecha;
    private Timer Hora;


    public String getGestor() {
        return Gestor;
    }

    public void setGestor(String gestor) {
        Gestor = gestor;
    }

    public String getAgenda() {
        return Agenda;
    }

    public void setAgenda(String agenda) {
        Agenda = agenda;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public Timer getHora() {
        return Hora;
    }

    public void setHora(Timer hora) {
        Hora = hora;
    }
}
