/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diet;

import java.awt.Color;

/**
 *
 * @author kleca
 */
public class PoidsIdeal extends javax.swing.JFrame {

    /**
     * Creates new form PoidsIdeal
     */
    public PoidsIdeal() {
        initComponents();
        getContentPane().setBackground(Color.decode("#CCFFC8"));
        jPanelPoidsIdeal.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexe = new javax.swing.ButtonGroup();
        jPanelInformations = new javax.swing.JPanel();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jLabelSexe = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        jLabelPoids = new javax.swing.JLabel();
        jLabelTaille = new javax.swing.JLabel();
        jSpinnerAge = new javax.swing.JSpinner();
        jSpinnerPoids = new javax.swing.JSpinner();
        jSpinnerTaille = new javax.swing.JSpinner();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jPanelSexe = new javax.swing.JPanel();
        jRadioFemme = new javax.swing.JRadioButton();
        jRadioHomme = new javax.swing.JRadioButton();
        jButtonSuite = new javax.swing.JButton();
        jPanelPoidsIdeal = new javax.swing.JPanel();
        jButtonDevine = new javax.swing.JButton();
        jButtonLorentz = new javax.swing.JButton();
        jButtonLorentzAge = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAfficheur = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 600));
        setPreferredSize(new java.awt.Dimension(530, 620));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelInformations.setBackground(new java.awt.Color(204, 204, 204));
        jPanelInformations.setLayout(null);

        jLabelNom.setText("Nom");
        jLabelNom.setPreferredSize(new java.awt.Dimension(40, 15));
        jPanelInformations.add(jLabelNom);
        jLabelNom.setBounds(140, 20, 40, 15);

        jLabelPrenom.setText("Prenom");
        jPanelInformations.add(jLabelPrenom);
        jLabelPrenom.setBounds(120, 50, 54, 15);

        jLabelSexe.setText("Sexe");
        jPanelInformations.add(jLabelSexe);
        jLabelSexe.setBounds(140, 80, 34, 15);

        jLabelAge.setText(" Age");
        jPanelInformations.add(jLabelAge);
        jLabelAge.setBounds(140, 110, 40, 20);

        jLabelPoids.setText("Poids");
        jPanelInformations.add(jLabelPoids);
        jLabelPoids.setBounds(140, 140, 50, 15);

        jLabelTaille.setText("Taille");
        jPanelInformations.add(jLabelTaille);
        jLabelTaille.setBounds(140, 170, 60, 15);

        jSpinnerAge.setModel(new javax.swing.SpinnerNumberModel(1, 1, 200, 1));
        jPanelInformations.add(jSpinnerAge);
        jSpinnerAge.setBounds(190, 100, 160, 30);

        jSpinnerPoids.setModel(new javax.swing.SpinnerNumberModel(15.0d, 15.0d, 300.0d, 0.1d));
        jSpinnerPoids.setToolTipText("");
        jPanelInformations.add(jSpinnerPoids);
        jSpinnerPoids.setBounds(190, 130, 160, 30);

        jSpinnerTaille.setModel(new javax.swing.SpinnerNumberModel(0.5d, 0.5d, 3.0d, 0.01d));
        jPanelInformations.add(jSpinnerTaille);
        jSpinnerTaille.setBounds(190, 160, 160, 30);
        jPanelInformations.add(jTextFieldNom);
        jTextFieldNom.setBounds(190, 10, 160, 30);
        jPanelInformations.add(jTextFieldPrenom);
        jTextFieldPrenom.setBounds(190, 40, 160, 30);

        jPanelSexe.setBackground(new java.awt.Color(204, 204, 204));

        jRadioFemme.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroupSexe.add(jRadioFemme);
        jRadioFemme.setText("Femme");

        jRadioHomme.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroupSexe.add(jRadioHomme);
        jRadioHomme.setText("Homme");

        javax.swing.GroupLayout jPanelSexeLayout = new javax.swing.GroupLayout(jPanelSexe);
        jPanelSexe.setLayout(jPanelSexeLayout);
        jPanelSexeLayout.setHorizontalGroup(
            jPanelSexeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSexeLayout.createSequentialGroup()
                .addComponent(jRadioFemme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioHomme, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
        );
        jPanelSexeLayout.setVerticalGroup(
            jPanelSexeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSexeLayout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(jPanelSexeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioFemme)
                    .addComponent(jRadioHomme)))
        );

        jPanelInformations.add(jPanelSexe);
        jPanelSexe.setBounds(190, 70, 160, 30);

        getContentPane().add(jPanelInformations);
        jPanelInformations.setBounds(70, 10, 360, 200);

        jButtonSuite.setText("Suite");
        jButtonSuite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSuiteMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonSuite);
        jButtonSuite.setBounds(210, 220, 71, 25);

        jPanelPoidsIdeal.setBackground(new java.awt.Color(214, 217, 223));
        jPanelPoidsIdeal.setLayout(null);

        jButtonDevine.setText("Poids idéal devine");
        jButtonDevine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDevineMouseClicked(evt);
            }
        });
        jPanelPoidsIdeal.add(jButtonDevine);
        jButtonDevine.setBounds(40, 10, 163, 25);

        jButtonLorentz.setText("Poids idéal lorentz");
        jButtonLorentz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLorentzMouseClicked(evt);
            }
        });
        jPanelPoidsIdeal.add(jButtonLorentz);
        jButtonLorentz.setBounds(40, 40, 167, 25);

        jButtonLorentzAge.setText("Poids idéal lorentz / age");
        jButtonLorentzAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLorentzAgeMouseClicked(evt);
            }
        });
        jPanelPoidsIdeal.add(jButtonLorentzAge);
        jButtonLorentzAge.setBounds(40, 70, 206, 25);

        jTextAreaAfficheur.setColumns(20);
        jTextAreaAfficheur.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAfficheur);

        jPanelPoidsIdeal.add(jScrollPane1);
        jScrollPane1.setBounds(0, 100, 459, 250);

        getContentPane().add(jPanelPoidsIdeal);
        jPanelPoidsIdeal.setBounds(40, 260, 460, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSuiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSuiteMouseClicked
        // TODO add your handling code here:
        if(jPanelInformations.isVisible() == true){
            jPanelInformations.setVisible(false);
            jPanelPoidsIdeal.setVisible(true);
        }
        else{
            jPanelInformations.setVisible(true);
            jPanelPoidsIdeal.setVisible(false);
        }
        
        nom = jTextFieldNom.getText();
        prenom = jTextFieldPrenom.getText();
        age = (int) jSpinnerAge.getValue();
        poids = (double) jSpinnerPoids.getValue();
        taille = (double) jSpinnerTaille.getValue();
        imc = poids / (taille * taille);
        jTextAreaAfficheur.setText("Bonjour " + nom + " " + prenom + "\nVotre indice de masse corporel est de : " + imc);
        //Recherche de la corpulence
        int indiceCorpulence = 0;
        for (int i = 0; i < NBIMC - 1; i++) {
            if (imc > imcs[i] && imc <= imcs[i + 1]) {
                indiceCorpulence = i + 1;
            }
        }
        //cas extremes
        if (imc < 16.5) {
            indiceCorpulence = 0;
        }
        if (imc > 40) {
            indiceCorpulence = NBCORPULENCE - 1;
        }
        jTextAreaAfficheur.append("\nVotre corpulence est qualifiée de " + corpulences[indiceCorpulence] + "\n");
    }//GEN-LAST:event_jButtonSuiteMouseClicked

    private void jButtonDevineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDevineMouseClicked
        // TODO add your handling code here:
        double poidsIdeal = 0;
        if (jRadioFemme.isSelected()) {
            poidsIdeal = 45.5 + 2.3 * (taille / 0.0254 - 60.0);
        }
        if (jRadioHomme.isSelected()) {
            poidsIdeal = 50.0 + 2.3 * (taille / 0.0254 - 60.0);
        }
        if (poidsIdeal > 0) {
            jTextAreaAfficheur.append("\nVotre poids ideal avec la formule de devine : " + ((Double) poidsIdeal).toString() + " kg\n");
            double ecart = poids - poidsIdeal;
            if (ecart >= 0) {
                jTextAreaAfficheur.append("Vous devez perdre " + ((Double) ecart).toString() + " kg\n");
            } else {
                jTextAreaAfficheur.append("Vous devez prendre " + ((Double) (-ecart)).toString() + " kg\n");
            }
        }
    }//GEN-LAST:event_jButtonDevineMouseClicked

    private void jButtonLorentzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLorentzMouseClicked
        // TODO add your handling code here:
        double poidsIdeal = 0;
        if (jRadioFemme.isSelected()) {
            poidsIdeal = taille * 100 - 100 - (taille * 100 - 150) / 2.5;
        }
        if (jRadioHomme.isSelected()) {
            poidsIdeal = taille * 100 - 100 - (taille * 100 - 150) / 4;
        }
        if (poidsIdeal > 0) {
            jTextAreaAfficheur.append("\nVotre poids ideal avec la formule de lorentz : " + ((Double) poidsIdeal).toString() + " kg\n");
            double ecart = poids - poidsIdeal;
            if (ecart >= 0) {
                jTextAreaAfficheur.append("Vous devez perdre " + ((Double) ecart).toString() + " kg\n");
            } else {
                jTextAreaAfficheur.append("Vous devez prendre " + ((Double) (-ecart)).toString() + " kg\n");
            }
        }
    }//GEN-LAST:event_jButtonLorentzMouseClicked

    private void jButtonLorentzAgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLorentzAgeMouseClicked
        // TODO add your handling code here:
        double poidsIdeal = 0;
        poidsIdeal = 50 + (taille * 100 - 150) / 4 + ((double)age - 20) / 4;
        if (poidsIdeal > 0) {
            jTextAreaAfficheur.append("\nVotre poids ideal avec la formule de lorentz : " + ((Double) poidsIdeal).toString() + " kg\n");
            double ecart = poids - poidsIdeal;
            if (ecart >= 0) {
                jTextAreaAfficheur.append("Vous devez perdre " + ((Double) ecart).toString() + " kg\n");
            } else {
                jTextAreaAfficheur.append("Vous devez prendre " + ((Double) (-ecart)).toString() + " kg\n");
            }
        }
    }//GEN-LAST:event_jButtonLorentzAgeMouseClicked

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
            java.util.logging.Logger.getLogger(PoidsIdeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PoidsIdeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PoidsIdeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PoidsIdeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PoidsIdeal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSexe;
    private javax.swing.JButton jButtonDevine;
    private javax.swing.JButton jButtonLorentz;
    private javax.swing.JButton jButtonLorentzAge;
    private javax.swing.JButton jButtonSuite;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPoids;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelSexe;
    private javax.swing.JLabel jLabelTaille;
    private javax.swing.JPanel jPanelInformations;
    private javax.swing.JPanel jPanelPoidsIdeal;
    private javax.swing.JPanel jPanelSexe;
    private javax.swing.JRadioButton jRadioFemme;
    private javax.swing.JRadioButton jRadioHomme;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerAge;
    private javax.swing.JSpinner jSpinnerPoids;
    private javax.swing.JSpinner jSpinnerTaille;
    private javax.swing.JTextArea jTextAreaAfficheur;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    // End of variables declaration//GEN-END:variables
    private String nom;
    private String prenom;
    private double imc;
    private double poids;
    private double taille;
    private int age;
    final private double imcs[] = {16.5, 18.5, 25, 30, 35, 40};
    final private String corpulences[] = {"Famine", "Maigreur", "Normale", "Surpoids", "Obésité modérée", "Obésité sévère", "Obésité morbide"};
    final private int NBIMC = 6;
    final private int NBCORPULENCE = 7;
}
