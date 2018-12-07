/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9_carlosnuila;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    private JTable tabla;
    private ArrayList<Parada> paradasRealizar;
    private AutoBus busSeleccionado;

    public AdministrarBus(String nombreEstación, int tiempo, JProgressBar progBar, JLabel label, Parada parada, JTable tabla, ArrayList<Parada> paradasRealizar, AutoBus busSeleccionado) {
        this.nombreEstación = nombreEstación;
        this.tiempo = tiempo;
        this.progBar = progBar;
        this.label = label;
        this.parada = parada;
        this.tabla = tabla;
        this.paradasRealizar = paradasRealizar;
        this.busSeleccionado = busSeleccionado;
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
            if (progBar.getValue() == progBar.getMaximum()) {
                progBar.setValue(0);
                progBar.setString(Integer.toString(progBar.getValue()) + " Minutos");
                ArrayList<Estudiante> estudiantesBajan = new ArrayList();
                /*for (Estudiante temp : busSeleccionado.getPasajeros()) {
                    if (temp.getParada().getNombre().equals(parada.getNombre())) {
                        estudiantesBajan.add(temp);
                        busSeleccionado.getPasajeros().remove(temp);
                    }
                }*/
                DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
                Object[] row = {parada, tiempo, estudiantesBajan};
                modeloTabla.addRow(row);
                tabla.setModel(modeloTabla);
                Parada temp = parada;
                while (busSeleccionado.getPasajeros().size() > 0) {
                    double nuevaDistanciamenor = 1000000;
                    for (int i = 0; i < paradasRealizar.size(); i++) {
                        double coorX1 = parada.getCoorX();
                        double coorY1 = parada.getCoorY();
                        double coorX2 = paradasRealizar.get(i).getCoorX();
                        double coorY2 = paradasRealizar.get(i).getCoorY();
                        double distanciaComparar = Math.pow(coorX2 - coorX1, 2) + Math.pow(coorY2 - coorY1, 2);
                        distanciaComparar = Math.sqrt(distanciaComparar);
                        if (distanciaComparar < nuevaDistanciamenor) {
                            nuevaDistanciamenor = distanciaComparar;
                            temp = paradasRealizar.get(i);
                        }
                        parada = temp;

                    }
                    int tiempoNuevo = (int) Math.ceil((parada.getDistancia() / busSeleccionado.getVelocidad()) * 60);
                    
                    vive = false;
                    AdministrarBus ab2 = new AdministrarBus(parada.getNombre(), tiempoNuevo, progBar, label, parada, tabla, paradasRealizar, busSeleccionado);
                    ab2.start();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

}
