/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemamochila;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

public class LauncherMochila extends javax.swing.JFrame {

    /**
     * Creates new form LauncherMochila
     */
    private List<JTextField> lPeso;
    private List<JTextField> lValor;

    public LauncherMochila() {
        initComponents();
        lPeso = new ArrayList<>();
        lValor = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        lblPesoMax = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPesoMax = new javax.swing.JTextField();
        txtCarticulos = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jPpv = new javax.swing.JPanel();
        
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("SansSerif BOLD", 5, 24)); // NOI18N
        Titulo.setText("Problema De La Mochila");
        Titulo.setBounds(50, 50, 200, 35);
        lblPesoMax.setFont(new java.awt.Font("Comic Sans", 1, 14)); // NOI18N
        lblPesoMax.setText("Peso Maximo");

        jLabel2.setFont(new java.awt.Font("Comic Sans", 1, 14)); // NOI18N
        jLabel2.setText("Articulos");

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPpvLayout = new javax.swing.GroupLayout(jPpv);
        jPpv.setLayout(jPpvLayout);
        jPpvLayout.setHorizontalGroup(
            jPpvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );
        jPpvLayout.setVerticalGroup(
            jPpvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Comic Sans", 1, 14)); // NOI18N
        jLabel1.setText("Peso");
        jLabel1.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Comic Sans", 1, 14)); // NOI18N
        jLabel3.setText("Valor");

        btnCalcular.setFont(new java.awt.Font("Comic Sans", 1, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(Titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPesoMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPpv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPesoMax)
                                    .addComponent(txtCarticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(btnEnviar)))))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCarticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblPesoMax, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesoMax, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPpv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        int iCarticulos = Integer.parseInt(txtCarticulos.getText());

        for (int i = 0; i < iCarticulos; i++) {
            JTextField txtPs = new JTextField();
            JTextField txtVs = new JTextField();
            txtPs.setBounds(30 * i, 25, 30, 30);
            txtVs.setBounds(30 * i, 70, 30, 30);

            jPpv.add(txtPs);
            jPpv.add(txtVs);
            lPeso.add(txtPs);
            lValor.add(txtVs);
        }
        jPpv.updateUI();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int iC = Integer.parseInt(txtCarticulos.getText());
        int pM = Integer.parseInt(txtPesoMax.getText());
        int[] liPesos = new int [iC];
        int[] liValores = new int [iC];
        
        int pesosLista[] = new int[iC];
        int valoresLista[] = new int[iC];

        int i = 0;
        for (JTextField txta : lPeso) {
            pesosLista[i] = Integer.parseInt(txta.getText());
            i++;
        }
        int y = 0;
        for (JTextField txte : lValor) {
            valoresLista[y] = Integer.parseInt(txte.getText());
            y++;
        }
        
        for(int j = 0; j<iC; j++){
            liPesos[j]=pesosLista[j];
            liValores[j]=valoresLista[j];
        }
        
        int intercambio =0;
        boolean ordenado = false;
        while (ordenado != true){
            for (int r = 0; r<liPesos.length-1;r++){
                if(liPesos[r] > liPesos[r+1]){
                    int Pauxiliar = liPesos[r];
                    liPesos[r]=liPesos[r+1];
                    liPesos[r+1]=Pauxiliar;
                    

                    
                    int Vauxiliar = liValores[r];
                    liValores[r]=liValores[r+1];
                    liValores[r+1]=Vauxiliar;
                    
                    
                    intercambio++;
                }
            }
            if(intercambio == 0){
                ordenado = true;
            }
            
            intercambio=0;
        }
        
        
        
        ProblemaMochila mochila = new ProblemaMochila(liPesos,liValores,iC,pM);
        mochila.GenerarMAtriz();
        
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LauncherMochila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LauncherMochila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LauncherMochila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LauncherMochila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LauncherMochila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPpv;
    private javax.swing.JLabel lblPesoMax;
    private javax.swing.JTextField txtCarticulos;
    private javax.swing.JTextField txtPesoMax;
    // End of variables declaration//GEN-END:variables
}
