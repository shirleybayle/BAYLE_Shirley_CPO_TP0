/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_bayle;

/**
 *
 * @author shirl
 */
public class fenetreDejeu extends javax.swing.JFrame {

    /**
     * Creates new form fenetreDejeu
     */
    public fenetreDejeu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur1 = new javax.swing.JTextField();
        nom_joueur2 = new javax.swing.JTextField();
        btn_debut = new javax.swing.JButton();
        panneau_info_joueur = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nbjetonsj1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nomj1 = new javax.swing.JLabel();
        couleurj1 = new javax.swing.JLabel();
        nbdesintj2 = new javax.swing.JLabel();
        couleurj2 = new javax.swing.JLabel();
        nbjetonsj2 = new javax.swing.JLabel();
        nbdesintj1 = new javax.swing.JLabel();
        nomj2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panneau_info_partie = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nom_joueurCourant = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();
        btn_col_7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(51, 51, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 672, 576));

        panneau_creation_partie.setBackground(new java.awt.Color(204, 204, 255));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom du joueur 2 :");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel2.setText("Nom du joueur 1 :");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 180, -1));
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 180, -1));

        btn_debut.setText("Démarrer la partie !");
        panneau_creation_partie.add(btn_debut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 170, 30));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 130));

        panneau_info_joueur.setBackground(new java.awt.Color(204, 204, 255));
        panneau_info_joueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Georgia Pro", 0, 18)); // NOI18N
        jLabel3.setText("Infos joueurs :");
        panneau_info_joueur.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel4.setText("Joueur 2 :");
        panneau_info_joueur.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        nbjetonsj1.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        nbjetonsj1.setText("nbjetonsj1");
        panneau_info_joueur.add(nbjetonsj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel6.setText("Joueur 1 :");
        panneau_info_joueur.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel7.setText("Couleur :");
        panneau_info_joueur.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel8.setText("Désintégrateurs :");
        panneau_info_joueur.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel9.setText("Nombre de jetons restants :");
        panneau_info_joueur.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel10.setText("Couleur :");
        panneau_info_joueur.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel11.setText("Désintégrateurs :");
        panneau_info_joueur.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel12.setText("Nombre de jetons restants :");
        panneau_info_joueur.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        nomj1.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        nomj1.setText("nomj1");
        panneau_info_joueur.add(nomj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        couleurj1.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        couleurj1.setText("couleurj1");
        panneau_info_joueur.add(couleurj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        nbdesintj2.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        nbdesintj2.setText("nbdesintj2");
        panneau_info_joueur.add(nbdesintj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        couleurj2.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        couleurj2.setText("couleurj2");
        panneau_info_joueur.add(couleurj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        nbjetonsj2.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        nbjetonsj2.setText("nbjetonsj2");
        panneau_info_joueur.add(nbjetonsj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        nbdesintj1.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        nbdesintj1.setText("nbdesintj1");
        panneau_info_joueur.add(nbdesintj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        nomj2.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        nomj2.setText("nomj2");
        panneau_info_joueur.add(nomj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setToolTipText("");
        panneau_info_joueur.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 122, 310, -1));

        getContentPane().add(panneau_info_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 310, 230));

        panneau_info_partie.setBackground(new java.awt.Color(204, 204, 255));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Georgia Pro", 0, 18)); // NOI18N
        jLabel5.setText("Infos partie :");
        panneau_info_partie.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel13.setText("C'est au tour de ");
        panneau_info_partie.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        nom_joueurCourant.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        nom_joueurCourant.setText("nomJoueurCourant");
        panneau_info_partie.add(nom_joueurCourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        panneau_info_partie.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 280, 80));

        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 310, 150));

        btn_col_1.setText("1");
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        btn_col_2.setText("2");
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 20, -1, -1));

        btn_col_3.setText("3");
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 20, -1, -1));

        btn_col_4.setText("4");
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 20, -1, -1));

        btn_col_5.setText("5");
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 20, -1, -1));

        btn_col_6.setText("6");
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, -1));

        btn_col_7.setText("7");
        getContentPane().add(btn_col_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(946, 20, -1, -1));

        setBounds(0, 0, 1055, 692);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDejeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_col_7;
    private javax.swing.JButton btn_debut;
    private javax.swing.JLabel couleurj1;
    private javax.swing.JLabel couleurj2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea message;
    private javax.swing.JLabel nbdesintj1;
    private javax.swing.JLabel nbdesintj2;
    private javax.swing.JLabel nbjetonsj1;
    private javax.swing.JLabel nbjetonsj2;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JLabel nom_joueurCourant;
    private javax.swing.JLabel nomj1;
    private javax.swing.JLabel nomj2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_joueur;
    private javax.swing.JPanel panneau_info_partie;
    // End of variables declaration//GEN-END:variables
}
