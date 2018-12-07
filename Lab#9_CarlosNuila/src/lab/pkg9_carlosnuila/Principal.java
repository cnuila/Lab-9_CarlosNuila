/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9_carlosnuila;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Nuila
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        AutoBus nuevoBus = new AutoBus(110, 110);
        listaBuses.add(nuevoBus);
        Parada parada1 = new Parada("Las Uvas", 10, 120);
        listaParadas.add(parada1);
        Parada parada2 = new Parada("Tiloarque", 170, 80);
        listaParadas.add(parada2);
        Parada parada3 = new Parada("Tatumbla", 300, 240);
        listaParadas.add(parada3);
        Estudiante estudiante1 = new Estudiante("Ana", parada1);
        listaEstudiantes.add(estudiante1);
        Estudiante estudiante2 = new Estudiante("Carlos", parada2);
        listaEstudiantes.add(estudiante2);
        Estudiante estudiante3 = new Estudiante("Daniel", parada3);
        listaEstudiantes.add(estudiante3);
        nuevoBus.getPasajeros().add(estudiante1);
        nuevoBus.getPasajeros().add(estudiante2);
        nuevoBus.getPasajeros().add(estudiante3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crearParada = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jt_nombreParada = new javax.swing.JTextField();
        jt_distancia = new javax.swing.JTextField();
        jt_angulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jb_CrearPARada = new javax.swing.JButton();
        jd_crearBus = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jt_numeroIdentificacion = new javax.swing.JTextField();
        jt_placa = new javax.swing.JTextField();
        jt_color = new javax.swing.JTextField();
        jt_velocidad = new javax.swing.JTextField();
        jb_CrearBUS = new javax.swing.JButton();
        jd_crearEstudiante = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cb_parada = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jt_nombreEstudiante = new javax.swing.JTextField();
        jt_numeroCuenta = new javax.swing.JTextField();
        jb_CrearESTUdiante = new javax.swing.JButton();
        js_edad = new javax.swing.JSpinner();
        jd_agregaraAutoBus = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_estudiante = new javax.swing.JList<>();
        cb_buses = new javax.swing.JComboBox<>();
        jb_agregarAbus = new javax.swing.JButton();
        jb_crearParada = new javax.swing.JButton();
        jb_crearBus = new javax.swing.JButton();
        jb_crearEstudiante = new javax.swing.JButton();
        jb_agregarBus = new javax.swing.JButton();
        jb_actBuses = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_listaBusesSimu = new javax.swing.JList<>();
        jb_iniciarSimulacion = new javax.swing.JButton();
        jpb_simulacion = new javax.swing.JProgressBar();
        jl_estacion = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_registro = new javax.swing.JTable();

        jLabel1.setText("Nombre:");

        jLabel2.setText("Distancia:");

        jLabel3.setText("Ángulo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Crear Parada");

        jb_CrearPARada.setText("Crear");
        jb_CrearPARada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_CrearPARadaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_crearParadaLayout = new javax.swing.GroupLayout(jd_crearParada.getContentPane());
        jd_crearParada.getContentPane().setLayout(jd_crearParadaLayout);
        jd_crearParadaLayout.setHorizontalGroup(
            jd_crearParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearParadaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jd_crearParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_crearParadaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jt_nombreParada, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_crearParadaLayout.createSequentialGroup()
                        .addGroup(jd_crearParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jd_crearParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_distancia)
                            .addComponent(jt_angulo, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addGroup(jd_crearParadaLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jb_CrearPARada)))))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearParadaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(93, 93, 93))
        );
        jd_crearParadaLayout.setVerticalGroup(
            jd_crearParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearParadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addGroup(jd_crearParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jt_nombreParada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jt_angulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jb_CrearPARada)
                .addGap(21, 21, 21))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Crear AutoBus");

        jLabel6.setText("Número Identificación:");

        jLabel7.setText("Placa:");

        jLabel8.setText("Color:");

        jLabel9.setText("Velocidad:");

        jb_CrearBUS.setText("Crear");
        jb_CrearBUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_CrearBUSMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_crearBusLayout = new javax.swing.GroupLayout(jd_crearBus.getContentPane());
        jd_crearBus.getContentPane().setLayout(jd_crearBusLayout);
        jd_crearBusLayout.setHorizontalGroup(
            jd_crearBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearBusLayout.createSequentialGroup()
                .addGroup(jd_crearBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crearBusLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jd_crearBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_crearBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_numeroIdentificacion)
                            .addComponent(jt_placa)
                            .addComponent(jt_color)
                            .addComponent(jt_velocidad, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                    .addGroup(jd_crearBusLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel5))
                    .addGroup(jd_crearBusLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jb_CrearBUS)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jd_crearBusLayout.setVerticalGroup(
            jd_crearBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearBusLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(37, 37, 37)
                .addGroup(jd_crearBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jt_numeroIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crearBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_crearBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_crearBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jb_CrearBUS)
                .addGap(26, 26, 26))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Crear Estudiante");

        jLabel11.setText("Nombre:");

        jLabel12.setText("Edad:");

        jLabel13.setText("Número de Cuenta:");

        jLabel14.setText("Parada:");

        jb_CrearESTUdiante.setText("Crear");
        jb_CrearESTUdiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_CrearESTUdianteMouseClicked(evt);
            }
        });

        js_edad.setModel(new javax.swing.SpinnerNumberModel(15, 15, null, 1));

        javax.swing.GroupLayout jd_crearEstudianteLayout = new javax.swing.GroupLayout(jd_crearEstudiante.getContentPane());
        jd_crearEstudiante.getContentPane().setLayout(jd_crearEstudianteLayout);
        jd_crearEstudianteLayout.setHorizontalGroup(
            jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crearEstudianteLayout.createSequentialGroup()
                        .addGroup(jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_parada, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_nombreEstudiante)
                            .addComponent(jt_numeroCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(js_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_crearEstudianteLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel10)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearEstudianteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_CrearESTUdiante)
                .addGap(130, 130, 130))
        );
        jd_crearEstudianteLayout.setVerticalGroup(
            jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearEstudianteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(34, 34, 34)
                .addGroup(jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jt_nombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(js_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jt_numeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(cb_parada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jb_CrearESTUdiante)
                .addGap(25, 25, 25))
        );

        lista_estudiante.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(lista_estudiante);

        jb_agregarAbus.setText("Agregar");
        jb_agregarAbus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarAbusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_agregaraAutoBusLayout = new javax.swing.GroupLayout(jd_agregaraAutoBus.getContentPane());
        jd_agregaraAutoBus.getContentPane().setLayout(jd_agregaraAutoBusLayout);
        jd_agregaraAutoBusLayout.setHorizontalGroup(
            jd_agregaraAutoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregaraAutoBusLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jd_agregaraAutoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_agregaraAutoBusLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(cb_buses, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_agregaraAutoBusLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_agregarAbus)
                        .addGap(112, 112, 112))))
        );
        jd_agregaraAutoBusLayout.setVerticalGroup(
            jd_agregaraAutoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregaraAutoBusLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jd_agregaraAutoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_agregaraAutoBusLayout.createSequentialGroup()
                        .addComponent(cb_buses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jb_agregarAbus))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jb_crearParada.setText("Crear Parada");
        jb_crearParada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearParadaMouseClicked(evt);
            }
        });

        jb_crearBus.setText("Crear AutoBus");
        jb_crearBus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearBusMouseClicked(evt);
            }
        });

        jb_crearEstudiante.setText("Crear Estudiante");
        jb_crearEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearEstudianteMouseClicked(evt);
            }
        });

        jb_agregarBus.setText("Subirse a AutoBus");
        jb_agregarBus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarBusMouseClicked(evt);
            }
        });

        jb_actBuses.setText("Actualizar Lista Buses");
        jb_actBuses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_actBusesMouseClicked(evt);
            }
        });

        jl_listaBusesSimu.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_listaBusesSimu);

        jb_iniciarSimulacion.setText("Iniciar Simulación");
        jb_iniciarSimulacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_iniciarSimulacionMouseClicked(evt);
            }
        });

        jpb_simulacion.setString(Integer.toString(jpb_simulacion.getValue())+" Minutos");
        jpb_simulacion.setStringPainted(true);

        jl_estacion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jt_registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parada", "Tiempo", "Estudiantes"
            }
        ));
        jScrollPane3.setViewportView(jt_registro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_agregarBus)
                    .addComponent(jb_crearEstudiante)
                    .addComponent(jb_crearBus)
                    .addComponent(jb_crearParada)
                    .addComponent(jb_actBuses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jpb_simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jl_estacion, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jb_iniciarSimulacion)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jb_iniciarSimulacion)
                        .addGap(18, 18, 18)
                        .addComponent(jl_estacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpb_simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jb_crearParada)
                        .addGap(18, 18, 18)
                        .addComponent(jb_crearBus)
                        .addGap(18, 18, 18)
                        .addComponent(jb_crearEstudiante)
                        .addGap(18, 18, 18)
                        .addComponent(jb_agregarBus)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_actBuses)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_crearParadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearParadaMouseClicked
        // TODO add your handling code here:
        jd_crearParada.pack();
        jd_crearParada.setModal(true);
        jd_crearParada.setLocationRelativeTo(this);
        jd_crearParada.setVisible(true);
    }//GEN-LAST:event_jb_crearParadaMouseClicked

    private void jb_CrearPARadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_CrearPARadaMouseClicked
        // TODO add your handling code here:
        try {
            String nombre = jt_nombreParada.getText();
            double distancia = Double.parseDouble(jt_distancia.getText());
            double angulo = Math.toRadians(Double.parseDouble(jt_angulo.getText()));
            Parada nuevaParada = new Parada(nombre, distancia, angulo);
            listaParadas.add(nuevaParada);
            JOptionPane.showMessageDialog(jd_crearParada, "Se ha creado una parada");
            jt_nombreParada.setText("");
            jt_distancia.setText("");
            jt_angulo.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_crearParada, "Error fatal");
        }
    }//GEN-LAST:event_jb_CrearPARadaMouseClicked

    private void jb_CrearBUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_CrearBUSMouseClicked
        // TODO add your handling code here:
        try {
            int numeroIdentificacion = Integer.parseInt(jt_numeroIdentificacion.getText());
            String placa = jt_placa.getText();
            String color = jt_color.getText();
            double velocidad = Double.parseDouble(jt_velocidad.getText());
            AutoBus nuevoBus = new AutoBus(numeroIdentificacion, placa, color, velocidad);
            listaBuses.add(nuevoBus);
            JOptionPane.showMessageDialog(jd_crearBus, "Se ha creado un autobus");
            jt_numeroIdentificacion.setText("");
            jt_placa.setText("");
            jt_color.setText("");
            jt_velocidad.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_crearBus, "Error Fatal");
        }
    }//GEN-LAST:event_jb_CrearBUSMouseClicked

    private void jb_crearBusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearBusMouseClicked
        // TODO add your handling code here:
        jd_crearBus.pack();
        jd_crearBus.setModal(true);
        jd_crearBus.setLocationRelativeTo(this);
        jd_crearBus.setVisible(true);
    }//GEN-LAST:event_jb_crearBusMouseClicked

    private void jb_CrearESTUdianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_CrearESTUdianteMouseClicked
        // TODO add your handling code here:
        try {
            String nombre = jt_nombreEstudiante.getText();
            int edad = (int) js_edad.getValue();
            int numeroCuenta = Integer.parseInt(jt_numeroCuenta.getText());
            Parada parada = (Parada) cb_parada.getSelectedItem();
            Estudiante nuevoEstudiante = new Estudiante(nombre, edad, numeroCuenta, parada);
            JOptionPane.showMessageDialog(jd_crearEstudiante, "Estudiante Creado");
            listaEstudiantes.add(nuevoEstudiante);
            jt_nombreEstudiante.setText("");
            js_edad.setValue(15);
            jt_numeroCuenta.setText("");
            cb_parada.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_crearEstudiante, "Error Fatal");
        }
    }//GEN-LAST:event_jb_CrearESTUdianteMouseClicked

    private void jb_crearEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearEstudianteMouseClicked
        // TODO add your handling code here:
        jd_crearEstudiante.pack();
        jd_crearEstudiante.setModal(true);
        jd_crearEstudiante.setLocationRelativeTo(this);
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(listaParadas.toArray());
        cb_parada.setModel(modelo);

        jd_crearEstudiante.setVisible(true);
    }//GEN-LAST:event_jb_crearEstudianteMouseClicked

    private void jb_agregarAbusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarAbusMouseClicked
        // TODO add your handling code here:
        if (lista_estudiante.getSelectedIndex() >= 0) {
            AutoBus busSeleccionado = (AutoBus) cb_buses.getSelectedItem();
            Estudiante estudSeleccionado = listaEstudiantes.get(lista_estudiante.getSelectedIndex());
            busSeleccionado.getPasajeros().add(estudSeleccionado);
            JOptionPane.showMessageDialog(jd_agregaraAutoBus, "Pasajero Agregado");
        } else {
            JOptionPane.showMessageDialog(jd_crearBus, "Debe seleccionar a un estudiante de la Lista");
        }
    }//GEN-LAST:event_jb_agregarAbusMouseClicked

    private void jb_agregarBusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarBusMouseClicked
        // TODO add your handling code here:
        jd_agregaraAutoBus.pack();
        jd_agregaraAutoBus.setModal(true);
        jd_agregaraAutoBus.setLocationRelativeTo(this);
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(listaBuses.toArray());
        cb_buses.setModel(modelo);

        DefaultListModel modeloLista = (DefaultListModel) lista_estudiante.getModel();
        for (Estudiante temp : listaEstudiantes) {
            modeloLista.addElement(temp);
        }
        lista_estudiante.setModel(modeloLista);

        jd_agregaraAutoBus.setVisible(true);
    }//GEN-LAST:event_jb_agregarBusMouseClicked

    private void jb_actBusesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_actBusesMouseClicked
        // TODO add your handling code here:
        DefaultListModel modeloLista = new DefaultListModel();
        for (AutoBus temp : listaBuses) {
            modeloLista.addElement(temp);
        }
        jl_listaBusesSimu.setModel(modeloLista);
    }//GEN-LAST:event_jb_actBusesMouseClicked

    private void jb_iniciarSimulacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_iniciarSimulacionMouseClicked
        // TODO add your handling code here:
        jt_registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parada", "Tiempo", "Estudiantes"
            }
        ));
        if (jl_listaBusesSimu.getSelectedIndex() >= 0) {
            AutoBus busSeleccionado = listaBuses.get(jl_listaBusesSimu.getSelectedIndex());
            Parada estacionActual = null;
            ArrayList<Parada> paradasRealizar = new ArrayList();
            for (Estudiante temp : busSeleccionado.getPasajeros()) {
                paradasRealizar.add(temp.getParada());
            }
            double distanciaMenor = 1000000;
            for (int i = 0; i < paradasRealizar.size(); i++) {
                if (paradasRealizar.get(i).getDistancia() < distanciaMenor) {
                    distanciaMenor = paradasRealizar.get(i).getDistancia();
                    estacionActual = paradasRealizar.get(i);
                }
            }
            int tiempo = (int) Math.ceil((estacionActual.getDistancia() / busSeleccionado.getVelocidad()) * 60);
            AdministrarBus ab = new AdministrarBus(estacionActual.getNombre(), tiempo, jpb_simulacion, jl_estacion,estacionActual, jt_registro, paradasRealizar,busSeleccionado);
            ab.start();
            
            
            
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un bus de la Lista");
        }
    }//GEN-LAST:event_jb_iniciarSimulacionMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    ArrayList<Parada> listaParadas = new ArrayList();
    ArrayList<AutoBus> listaBuses = new ArrayList();
    ArrayList<Estudiante> listaEstudiantes = new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_buses;
    private javax.swing.JComboBox<String> cb_parada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jb_CrearBUS;
    private javax.swing.JButton jb_CrearESTUdiante;
    private javax.swing.JButton jb_CrearPARada;
    private javax.swing.JButton jb_actBuses;
    private javax.swing.JButton jb_agregarAbus;
    private javax.swing.JButton jb_agregarBus;
    private javax.swing.JButton jb_crearBus;
    private javax.swing.JButton jb_crearEstudiante;
    private javax.swing.JButton jb_crearParada;
    private javax.swing.JButton jb_iniciarSimulacion;
    private javax.swing.JDialog jd_agregaraAutoBus;
    private javax.swing.JDialog jd_crearBus;
    private javax.swing.JDialog jd_crearEstudiante;
    private javax.swing.JDialog jd_crearParada;
    private javax.swing.JLabel jl_estacion;
    private javax.swing.JList<String> jl_listaBusesSimu;
    private javax.swing.JProgressBar jpb_simulacion;
    private javax.swing.JSpinner js_edad;
    private javax.swing.JTextField jt_angulo;
    private javax.swing.JTextField jt_color;
    private javax.swing.JTextField jt_distancia;
    private javax.swing.JTextField jt_nombreEstudiante;
    private javax.swing.JTextField jt_nombreParada;
    private javax.swing.JTextField jt_numeroCuenta;
    private javax.swing.JTextField jt_numeroIdentificacion;
    private javax.swing.JTextField jt_placa;
    private javax.swing.JTable jt_registro;
    private javax.swing.JTextField jt_velocidad;
    private javax.swing.JList<String> lista_estudiante;
    // End of variables declaration//GEN-END:variables
}
