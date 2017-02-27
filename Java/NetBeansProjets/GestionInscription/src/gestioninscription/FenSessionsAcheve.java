package gestioninscription;
import java.sql.*;

public class FenSessionsAcheve extends javax.swing.JFrame {
    Connection conn;
    Statement stat;
    ResultSet rs;
    ResultSet rs2;
    ResultSet rs3;
    /**
     * Creates new form FenSessionsAcheve
     */
    public FenSessionsAcheve() {
        initComponents();
        PanelInfo.setVisible(false);
        BtnNotif.setVisible(false);
        String pilote = "org.gjt.mm.mysql.Driver";
        try
        {
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/formarmor","root","");
            stat = conn.createStatement();
            int i=0;
            rs = stat.executeQuery("Select session_formation.*, libelle from formation, session_formation "
                    + "where formation.id = session_formation.formation_id and close = 1");
            // Exploitation des resultat
            while (rs.next())
            {
                TableSessions.setValueAt(rs.getInt("id"), i,0);
                TableSessions.setValueAt(rs.getString("date_debut"), i,1);               
                i++;                
            }
        }
        catch (SQLException sqlE)
        {
            System.out.println("ERREUR SQL " + sqlE.getMessage());
        }
        catch (ClassNotFoundException cnfE)
        {
            System.out.println("Erreur " + cnfE.getMessage());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableSessions = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        PanelInfo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblForm = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        Participant = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtAreaClient = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        lblinscrit = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblabsent = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblNbplace = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtAreaAbsent = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        BtnNotif = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableSessions.setModel(new ModeleJTableListeSessionsAcheves());
        TableSessions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableSessionsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableSessions);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tableau des sessions achevés :");

        jLabel3.setText("Libellé de la formation :");

        lblForm.setText("form");

        jLabel4.setText("Date de début :");

        jLabel5.setText("Nombre d'inscrit :");

        lblDate.setText("date");

        Participant.setText("Participant");

        TxtAreaClient.setColumns(20);
        TxtAreaClient.setRows(5);
        TxtAreaClient.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TxtAreaClient.setEnabled(false);
        jScrollPane2.setViewportView(TxtAreaClient);

        jLabel6.setText("avec taux horaires :");

        lblinscrit.setText("inscrit");

        jLabel8.setText("Nombre d'absent :");

        lblabsent.setText("absent");

        jLabel7.setText("Nombre de place :");

        lblNbplace.setText("place");

        TxtAreaAbsent.setColumns(20);
        TxtAreaAbsent.setRows(5);
        jScrollPane3.setViewportView(TxtAreaAbsent);

        jLabel9.setText("Absent :");

        BtnNotif.setText("Envoyé Notification Absence");
        BtnNotif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnNotifMouseClicked(evt);
            }
        });
        BtnNotif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNotifActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Informations sur la session sélectionné :");

        javax.swing.GroupLayout PanelInfoLayout = new javax.swing.GroupLayout(PanelInfo);
        PanelInfo.setLayout(PanelInfoLayout);
        PanelInfoLayout.setHorizontalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoLayout.createSequentialGroup()
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelInfoLayout.createSequentialGroup()
                                    .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(Participant)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9))
                                    .addGap(55, 55, 55))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoLayout.createSequentialGroup()
                                    .addComponent(BtnNotif)
                                    .addGap(18, 18, 18)))
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(74, 74, 74)))
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblForm)
                            .addComponent(lblNbplace)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDate)
                            .addComponent(lblinscrit)
                            .addComponent(lblabsent)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PanelInfoLayout.setVerticalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblForm))
                .addGap(18, 18, 18)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNbplace))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblinscrit)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblabsent)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addComponent(Participant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(BtnNotif)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButton1.setText("Fermer");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(PanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(PanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableSessionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableSessionsMouseClicked
        TxtAreaClient.setText("");
        TxtAreaAbsent.setText("");
        String pilote = "org.gjt.mm.mysql.Driver";
        try
        {
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/formarmor","root","");
            stat = conn.createStatement();
            int i=0;
            if (TableSessions.getValueAt(TableSessions.getSelectedRow(), 0) != null)
            {
                rs2 = stat.executeQuery("select session_formation.id, session_formation.nb_inscrits-effectue as Absent "
                   + "from session_formation, plan_formation "
                   + "where plan_formation.formation_id = session_formation.formation_id "
                   + "and session_formation.id = " + TableSessions.getValueAt(TableSessions.getSelectedRow(), 0) + " Group By session_formation.id");
                while (rs2.next())
                {
                    lblabsent.setText(rs2.getString("Absent"));                    
                }
                rs3 = stat.executeQuery("select nom, session_formation.id from client, plan_formation, session_formation "
                        + "where client.id = plan_formation.client_id "
                        + "and plan_formation.formation_id = session_formation.formation_id "
                        + "and session_formation.id = " + TableSessions.getValueAt(TableSessions.getSelectedRow(), 0) + " and effectue = 0");
                while (rs3.next()){
                    TxtAreaAbsent.setText(TxtAreaAbsent.getText() + rs3.getString("nom") + "\n");
                }
                
                rs = stat.executeQuery("Select libelle, date_debut, nb_places, nb_inscrits, nom, taux_horaire "
                    + "from formation, session_formation, client, plan_formation, statut "
                    + "where formation.id = session_formation.formation_id "
                    + "and plan_formation.formation_id = session_formation.formation_id"
                    + " and client.statut_id = statut.id "
                    + "and plan_formation.client_id = client.id and session_formation.id = " + TableSessions.getValueAt(TableSessions.getSelectedRow(), 0));
                while (rs.next())
                {
                        PanelInfo.setVisible(true);
                        BtnNotif.setVisible(true);
                        TxtAreaClient.setText(TxtAreaClient.getText() +  rs.getString("nom") + " - Taux horaires : " + rs.getString("taux_horaire") + "\n");
                        lblForm.setText(rs.getString("libelle"));
                        lblDate.setText(rs.getString("date_debut"));                                                
                        lblNbplace.setText(rs.getString("nb_places"));
                        lblinscrit.setText(rs.getString("nb_inscrits"));
                        i++;
                }
            } else {
                PanelInfo.setVisible(false);
                BtnNotif.setVisible(false);
            }
        }
        catch (SQLException sqlE)
        {
            System.out.println("ERREUR SQL " + sqlE.getMessage());
        }
        catch (ClassNotFoundException cnfE)
        {
            System.out.println("Erreur " + cnfE.getMessage());
        }
    }//GEN-LAST:event_TableSessionsMouseClicked

    private void BtnNotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNotifActionPerformed
        FenNotification f1 = new FenNotification();         
        f1.init(TableSessions.getValueAt(TableSessions.getSelectedRow(),0));
        f1.setVisible(true);
    }//GEN-LAST:event_BtnNotifActionPerformed

    private void BtnNotifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNotifMouseClicked

    }//GEN-LAST:event_BtnNotifMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          FenSessionsAcheve f2 = new FenSessionsAcheve();
          f2.setVisible(true);   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNotif;
    private javax.swing.JPanel PanelInfo;
    private javax.swing.JLabel Participant;
    private javax.swing.JTable TableSessions;
    private javax.swing.JTextArea TxtAreaAbsent;
    private javax.swing.JTextArea TxtAreaClient;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblForm;
    private javax.swing.JLabel lblNbplace;
    private javax.swing.JLabel lblabsent;
    private javax.swing.JLabel lblinscrit;
    // End of variables declaration//GEN-END:variables
}
