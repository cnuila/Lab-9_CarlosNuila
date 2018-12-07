/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9_carlosnuila;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;

/**
 *
 * @author Carlos Nuila
 */
public class AdministrarBus extends Thread {

    private String nombreEstación;
    private int tiempo;
    private JProgressBar progBar;
    private JLabel label;
    private boolean vive;
    private Parada parada;

    public AdministrarBus(String nombreEstación, int tiempo, JProgressBar progBar, JLabel label) {
        this.nombreEstación = nombreEstación;
        this.tiempo = tiempo;
        this.progBar = progBar;
        this.label = label;
        vive = true;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            label.setText(nombreEstación);
            progBar.setMaximum(tiempo);
            progBar.setValue(progBar.getValue() + 1);
            progBar.setString(Integer.toString(progBar.getValue()) + " Minutos");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

}
