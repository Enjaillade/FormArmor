/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioninscription;
import java.awt.Color;
import java.awt.Label;
import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import sql.*;
/**
 *
 * @author Administrateur
 */
public class FenInscription extends javax.swing.JFrame {

    /**
     * Creates new form FenInscription
     */
    Connection conn;
    Statement stmt1, stmt2;
    
    public FenInscription()
    {
        initComponents();
        jButton1.setVisible(false); // On rend le bouton inscription non visible
        jTable1.selectAll();
        jTable1.setDefaultRenderer(Object.class, new Couleur()); // Pour mettre les sessions déficitaires en rouge
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BtnSAchevé = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inscription des clients aux différentes sessions");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(637, 347));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DES INSCRIPTIONS");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Matricule : ");

        jComboBox1.setName("cmbMat"); // NOI18N
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel3.setText(" ");
        jLabel3.setName("lblNomPren"); // NOI18N

        jTable1.setModel(new ModeleJTableListeSession());
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable1InputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Inscription");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Sélection : ");

        BtnSAchevé.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        BtnSAchevé.setText("Sessions achevés");
        BtnSAchevé.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSAchevéActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 562, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnSAchevé)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnSAchevé)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            try
            {
                // On prévoit 2 connexions à la base
                stmt1 = GestionBdd.connexionBdd(GestionBdd.TYPE_MYSQL, "formarmor","localhost", "root","");
                stmt2 = GestionBdd.connexionBdd(GestionBdd.TYPE_MYSQL, "formarmor","localhost", "root","");
                // Liste des clients qui "ont un plan de formation"
                String req = "select distinct c.id from client c, plan_formation p "
                 + "where c.id = p.id order by c.id";
                ResultSet rs = GestionBdd.envoiRequeteLMD(stmt1,req);
                jComboBox1.addItem("---");
                while (rs.next())
                {
                    jComboBox1.addItem(rs.getString(1));
                }
            }
            catch (SQLException se)
            {
                System.out.println("Erreur SQL1 : " + se.getMessage());
            }
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
          // Affichage du nom prénom et de la liste des sessions autorisées
        if (evt.getStateChange() != 1) // Pour éviter le déclenchement sur la création de la fenêtre
        {
            renseigne();
		
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FenConfirmationInscription f2 = new FenConfirmationInscription(this, true);
        f2.init(jComboBox1.getSelectedItem(), jTable1.getValueAt(jTable1.getSelectedRow(),0));
        f2.setSize(400,300);
        f2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable1InputMethodTextChanged
        //
    }//GEN-LAST:event_jTable1InputMethodTextChanged

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (jComboBox1.getSelectedIndex()>0 && jTable1.getValueAt(jTable1.getSelectedRow(), 0) != null)
        {
            jLabel5.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            int pos1 = jLabel3.getText().indexOf(":");
            String nomPrenom = jLabel3.getText().substring(pos1 + 1);
            jButton1.setText("Inscription à la session numéro " + jTable1.getValueAt(jTable1.getSelectedRow(), 0) + " pour " + nomPrenom);
            jButton1.setVisible(true);            
        }
        else
        {
            jButton1.setVisible(false);
            jLabel5.setText("Aucune sélection");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        renseigne();
    }//GEN-LAST:event_formWindowActivated

    private void BtnSAchevéActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSAchevéActionPerformed
        FenSessionsAcheve f3 = new FenSessionsAcheve();
        f3.setVisible(true);
    }//GEN-LAST:event_BtnSAchevéActionPerformed
    private void renseigne()
    {
        try
        {
        // On vide le JTable
            int j, k;
            String req;
            for(int i=0;i<jTable1.getRowCount();i++)
            {
                for (j=0;j<jTable1.getColumnCount();j++)
		{
                    jTable1.setValueAt(null,i,j);
		}
            }
            if (jComboBox1.getSelectedIndex()==0 || jComboBox1.getSelectedItem()== null) // Pas de client de choisi
            {
                jLabel3.setText("ENSEMBLE DES SESSIONS");
                // Toutes les sessions
                req = "select null, s.id, f.libelle, f.niveau, date_debut, duree, nb_places, nb_inscrits, coutrevient ";
                req += "from session_formation s, formation f ";
                req += "where s.formation_id = f.id";
                // et date supérieure à la date du jour
                jButton1.setVisible(false); // On rend le bouton inscription non visible
            }
            else
            {
                // Sélection des sessions "autorisées"
                req = "select c.nom, s.id, f.libelle, f.niveau, date_debut, duree, nb_places, nb_inscrits, coutrevient ";
                req += "from session_formation s, client c, plan_formation p, formation f ";
                req += "where c.id = '" + jComboBox1.getSelectedItem() + "' ";
                req += "and p.client_id = c.id and nb_places > nb_inscrits ";
                req += "and p.formation_id = f.id ";
                req += "and s.formation_id = f.id ";
                // et date supérieure à la date du jour
                req += "and close = 0 and effectue = 0 and s.id Not In ";
                req += "(Select session_formation_id From inscription Where id = '" + jComboBox1.getSelectedItem() + "')";
                if (jTable1.getValueAt(jTable1.getSelectedRow(), 0) != null) //Si la cellule sélectionnée est vide
                {
                    jButton1.setVisible(false); // On rend le bouton inscription non visible
                }
            }
            stmt1 = GestionBdd.connexionBdd(GestionBdd.TYPE_MYSQL, "formarmor","localhost", "root","");
            ResultSet rs2 = GestionBdd.envoiRequeteLMD(stmt1, req);
            ResultSet rs3 = null;
            
            k = 0;
            try
            {
                while(rs2.next())
                {
                    if (k==0 && jComboBox1.getSelectedIndex()!=0)
                    {
                        jLabel3.setText("Sessions autorisées pour : " + rs2.getString(1));
                    }
                    // On calcule la marge et on renseigne la dernière colonne(7ème) du jTable
                    req = "Select sum(taux_horaire) as revenu_session ";
                    req += "from statut st, session_formation s, client c, inscription i ";
                    req += "where s.id = i.session_formation_id and c.id = i.client_id ";
                    req += "and c.statut_id = st.id and s.id = " + rs2.getInt(2);
                    stmt2 = GestionBdd.connexionBdd(GestionBdd.TYPE_MYSQL, "formarmor","localhost", "root","");
                    rs3 = GestionBdd.envoiRequeteLMD(stmt2, req);
                    rs3.first();
                    jTable1.setValueAt((rs3.getFloat(1) - rs2.getFloat(9)), k, 7);
                    // On renseigne le reste du jTable
                    for (j=0;j<(jTable1.getColumnCount() -1);j++)
                    {
                        jTable1.setValueAt(rs2.getObject(j+2), k, j);
                    }
                    k++;
                }
                rs2.close();
            }
            catch (SQLException sqle)
            {
                System.out.print("Erreur SQL : " + sqle.getMessage());
            }
        }
        catch(NullPointerException npe)
        {
            System.out.println("Erreur : " + npe.getMessage());
        }
    }
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSAchevé;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
