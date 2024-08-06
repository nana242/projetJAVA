
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVOs
 */
public class miseàjour extends javax.swing.JFrame {
      String str = "com.mysql.jdbc.Driver";

    //pour etablir la connexion
    private java.sql.Connection con;
    private Statement stat;
    private ResultSet rest;
    String DBurl = "jdbc:mysql://localhost/datastock";
    String user = "root";
    String password = "";
    // Declaration des attributs   
    private String numclient;
    private String nomclient;
    private String prenomclient;
    private String adresseclient;
    private DefaultTableModel dtm;
    /**
     * Creates new form miseàjour
     */
    public miseàjour() {
        initComponents();
    }
    private void affiche() {

        try {
            dtm.setRowCount(0);
            rest = stat.executeQuery("SELECT * FROM client");

            while (rest.next()) {
                numclient = rest.getString("numcli");
                nomclient = rest.getString("nomcli");
                prenomclient = rest.getString("prenomcli");
                adresseclient = rest.getString("adressecli");
                Object[] tableclient = {numclient, nomclient, prenomclient, adresseclient};
                dtm.addRow(tableclient);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableclient = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        numcli = new javax.swing.JTextField();
        nomcli = new javax.swing.JTextField();
        prenomcli = new javax.swing.JTextField();
        adressecli = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tableclient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "numclient", "nomclient", "prenomclient", "adresseclient"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableclient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableclientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableclient);

        jLabel1.setText("MISE A JOUR DES CLIENTS");

        jLabel2.setText("NUMERO");

        jLabel3.setText("NOM");

        jLabel4.setText("PRENOM");

        jLabel5.setText("ADRESSE");

        jButton1.setText("AJOUTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("MODIFIER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("SUPPRIMER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        numcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numcliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomcli, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(prenomcli, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(adressecli))
                            .addComponent(numcli, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jButton1)
                .addGap(149, 149, 149)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nomcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(prenomcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(adressecli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numcliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numcliActionPerformed

    private void tableclientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableclientMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model =(DefaultTableModel)tableclient.getModel();
        int i = tableclient.getSelectedRow();
        try{
            numcli.setText(model.getValueAt(i, 0).toString());
            nomcli.setText(model.getValueAt(i, 1).toString());
            prenomcli.setText(model.getValueAt(i, 2).toString());
            adressecli.setText(model.getValueAt(i, 3).toString());
            

        }catch(Exception e){

        }
    }//GEN-LAST:event_tableclientMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         try {
            //chargement des pilotes
            Class.forName(str);
            System.out.println("pilote charge");

            //pour etablir la connexion
            con = DriverManager.getConnection(DBurl, user, password);
            System.out.println("connexion etablie");

            stat = con.createStatement();

            dtm = new DefaultTableModel();
            dtm.addColumn("numclient");
            dtm.addColumn("nomclient");
            dtm.addColumn("prenomclient");
            dtm.addColumn("adresseclient");
            


            tableclient.setModel(dtm);
            affiche();
        } catch (Exception e) {
      
        } 
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String vlrid =  numcli.getText();
            // this.val_S = 9;//1+hasard.nextInt(9);
            String vlrn = nomcli.getText();
            String vlrp = prenomcli.getText();
            String vlrj = adressecli.getText();
            


            String insertion = "INSERT INTO client values('" + vlrid + "','" + vlrn + "','" + vlrp + "','" + vlrj + "')";
            stat.executeUpdate(insertion);

            affiche();
            numcli.setText("");
            nomcli.setText("");
            prenomcli.setText("");
            adressecli.setText("");
            


        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String vlrid = numcli.getText();
            String vlrn = nomcli.getText();
            String vlrp = prenomcli.getText();
            String vlrj = adressecli.getText();
           
            

            String modifier = "UPDATE client set numcli=" + Integer.parseInt(vlrid) + ", nomcli='" + vlrn + "',prenomcli='" + vlrp + "',adressecli='" + vlrj + "' WHERE numcli= " + Integer.parseInt(vlrid) + "";
            stat.executeUpdate(modifier);

            affiche();
            numcli.setText("");
            nomcli.setText("");
            prenomcli.setText("");
            adressecli.setText("");
            

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            if(JOptionPane.showConfirmDialog(null,"confirmer la suppresion ","supprimer client",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){
                if (numcli.getText().length() != 0) {
                    stat.executeUpdate("Delete from client where numcli =" + numcli.getText());
                    affiche() ;//remplir le champs des stagiaires
                } else {
                    JOptionPane.showMessageDialog(null, "veuillez remplir le champs numcli ");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Erreur supprimer  Stg\n" + e.getMessage());
        }
        numcli.setText("");
        nomcli.setText("");
        prenomcli.setText("");
        adressecli.setText("");
       
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(miseàjour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(miseàjour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(miseàjour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(miseàjour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new miseàjour().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adressecli;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomcli;
    private javax.swing.JTextField numcli;
    private javax.swing.JTextField prenomcli;
    private javax.swing.JTable tableclient;
    // End of variables declaration//GEN-END:variables
}
