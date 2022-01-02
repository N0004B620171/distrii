/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Socket.ControlleurSocket;
import Camion.Camion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author mfaour
 */
public class ControllerFrame extends javax.swing.JFrame {

    ControlleurSocket _socketClient = null;
    private int _flightId;

    public ControllerFrame(int port, String host) {
        initComponents();
        this.setSize(1500, 800);
        this.setTitle("Controller...");
        this.setLocationRelativeTo(null);
        _socketClient = new ControlleurSocket(this,port,host);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        jSplitPane2 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstFlights = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        btnChangeCap = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtX = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtY = new javax.swing.JTextField();
        txtZ = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnChangeAltitude = new javax.swing.JButton();
        btnChangeVitesse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFlightId = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(1, 0), new java.awt.Dimension(1, 0), new java.awt.Dimension(1, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jSplitPane1.setRequestFocusEnabled(false);

        txtInfo.setEditable(false);
        txtInfo.setColumns(20);
        txtInfo.setFont(new java.awt.Font("Monospaced", 1, 26)); // NOI18N
        txtInfo.setRows(5);
        jScrollPane1.setViewportView(txtInfo);

        jSplitPane1.setLeftComponent(jScrollPane1);

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        lstFlights.setFont(new java.awt.Font("Monospaced", 1, 26)); // NOI18N
        lstFlights.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstFlights.setToolTipText("");
        lstFlights.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFlightsValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstFlights);

        jSplitPane2.setBottomComponent(jScrollPane2);

        btnChangeCap.setText("Change Cap");
        btnChangeCap.setEnabled(false);
        btnChangeCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeCapActionPerformed(evt);
            }
        });

        jLabel7.setText("Cap");

        txtX.setText("0");

        jLabel8.setText("Altitude");

        txtY.setText("0");

        txtZ.setText("0");
        txtZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZActionPerformed(evt);
            }
        });

        jLabel9.setText("Vitesse");

        btnChangeAltitude.setText("Change altitude");
        btnChangeAltitude.setEnabled(false);
        btnChangeAltitude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeAltitudeActionPerformed(evt);
            }
        });

        btnChangeVitesse.setText("Change Vitesse");
        btnChangeVitesse.setEnabled(false);
        btnChangeVitesse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeVitesseActionPerformed(evt);
            }
        });

        jLabel1.setText("Selected Flight");

        txtFlightId.setEditable(false);
        txtFlightId.setText("0");
        txtFlightId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlightIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtZ, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnChangeVitesse, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnChangeCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFlightId)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChangeAltitude, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangeCap))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangeAltitude))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangeVitesse))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFlightId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jSplitPane2.setTopComponent(jPanel1);

        jSplitPane1.setRightComponent(jSplitPane2);

        getContentPane().add(jSplitPane1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstFlightsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFlightsValueChanged
        // TODO add your handling code here:

        if (_socketClient._detectedFlights == null) {
            return;
        }

        String item = lstFlights.getSelectedValue();
        if (item != null && !item.isEmpty()) {

            String flightName= item.substring(9, 14);
            Camion av = null;
            for (int i = 0; i < _socketClient._detectedFlights.size(); i++) {
                if (_socketClient._detectedFlights.get(i).getFlightName().equals(flightName)) {
                    av = _socketClient._detectedFlights.get(i);
                    break;
                }
            }
            if ( av == null)
                return;
            //String flightName = av.getFlightName();
            Object cap = av.getDeplacement().getCap();
            Object alt = av.getPosition().getAltitude();
            Object vit = av.getDeplacement().getVitesse();

            txtX.setText(cap.toString());
            txtY.setText(alt.toString());
            txtZ.setText(vit.toString());
            _flightId = av.getFlightId();
            txtFlightId.setText(flightName);
            btnChangeCap.setEnabled(true);
            btnChangeVitesse.setEnabled(true);
            btnChangeAltitude.setEnabled(true);
        } /*else {
            _flightId = 0;
            txtX.setText("0");
            txtY.setText("0");
            txtZ.setText("0");
            txtFlightId.setText("0");
            btnChangeCap.setEnabled(false);
            btnChangeVitesse.setEnabled(false);
            btnChangeAltitude.setEnabled(false);
        }*/
        //JOptionPane.showMessageDialog(this, item);
    }//GEN-LAST:event_lstFlightsValueChanged

    private void txtFlightIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlightIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlightIdActionPerformed

    private void btnChangeVitesseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeVitesseActionPerformed
        if (_socketClient != null) {
            try {
                _socketClient.UpdateFlightVitesse(_flightId, Integer.parseInt(txtZ.getText()));
            } catch (InterruptedException ex) {
                Logger.getLogger(ControllerFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnChangeVitesseActionPerformed

    private void btnChangeAltitudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeAltitudeActionPerformed
        if (_socketClient != null) {
            try {
                _socketClient.UpdateFlightAltitude(_flightId, Integer.parseInt(txtY.getText()));
            } catch (InterruptedException ex) {
                Logger.getLogger(ControllerFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnChangeAltitudeActionPerformed

    private void btnChangeCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeCapActionPerformed
        if (_socketClient != null) {
            try {
                _socketClient.UpdateFlightCap(_flightId, Integer.parseInt(txtX.getText()));
            } catch (InterruptedException ex) {
                Logger.getLogger(ControllerFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnChangeCapActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       if ( _socketClient != null)
           _socketClient.fermer_communication();
    }//GEN-LAST:event_formWindowClosing

    private void txtZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZActionPerformed

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            System.out.println("Look & Feel exception");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControllerFrame().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeAltitude;
    private javax.swing.JButton btnChangeCap;
    private javax.swing.JButton btnChangeVitesse;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    public javax.swing.JList<String> lstFlights;
    private javax.swing.JTextField txtFlightId;
    public javax.swing.JTextArea txtInfo;
    private javax.swing.JTextField txtX;
    private javax.swing.JTextField txtY;
    private javax.swing.JTextField txtZ;
    // End of variables declaration//GEN-END:variables
}