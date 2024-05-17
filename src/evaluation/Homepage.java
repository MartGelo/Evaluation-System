package evaluation;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author april
 */


import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Homepage extends javax.swing.JFrame {
    private static final String JDBC_URL = "jdbc:mysql://localhost/evaluation";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345";
    private Connection con;
    /**
     * Creates new form Homepage
     */
    public Homepage() {
        initComponents();
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Self", "Employee", "Peer" }));
        yearlevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Year", "2nd Year", "3rd Year", "4th Year", "5th Year" }));
        employeename.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Mayreen V. Amazona", "Von Gerald D. Macosse", "Christoper G. Marmol", "Sherwin B. Glorioso","Cristelita P. Lombres","Don Sean Arvie V. Buencamino","King Alvin Grospe","Dale Lyko V. Abion","Christian C. Roxas","Jan Leo R. Crisanto","Keyvenz C. Portera",
        "Ryan Christian B. Mono","Glenda M. Flores","Menelito P. Roa","Annie Fe A. Mendez","Jamelica Verna A. Bautista","Englebert R. Babiera","Austin Carl H. Enriquez","John David P. Julio","Glenn Kennedy B. Marzo","Edna Y. Napoles"}));
        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Semester", "Second Semester"}));
        a1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5","4", "3", "2", "1"}));
        a2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5","4", "3", "2", "1"}));
        a3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5","4", "3", "2", "1"}));
        a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5","4", "3", "2", "1"}));
        a5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5","4", "3", "2", "1"}));
   
     connectToDatabase();
    }
    
     private void connectToDatabase() {
        try {
            // Establishing a connection to the database
            con = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            System.out.println("Connected to the database.");
        } catch (SQLException ex) {
            // Handle any SQL exceptions
            ex.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        semester = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        employeename = new javax.swing.JComboBox<>();
        evaluator = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        yearlevel = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        a1 = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        a2 = new javax.swing.JComboBox<>();
        a3 = new javax.swing.JComboBox<>();
        a4 = new javax.swing.JComboBox<>();
        a5 = new javax.swing.JComboBox<>();
        savebtn = new javax.swing.JButton();
        nextbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("INSTRUCTION : Please evaluate the faculty using the scale below.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 51));
        jLabel22.setText("NOTE : HIGHER THAN 5 AND LOWER THAN 1 ARE INVALID");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jCheckBox1.setText("Please check if you do understand");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"5", "Outstanding", "The performance almost always exceeds the job requirements."},
                {"4", "Very Satisfactory", "The Faculty is an exceptional role model."},
                {"3", "Satisfactory", "The performance meets and often exceeds the job requiements."},
                {"2", "Fair", "The performance meets job requirements."},
                {"1", "Poor", "The faculty fails to meet job Requirements."}
            },
            new String [] {
                "Scale", "Descriptive Rating", "Qualitative Description"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(300);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(300);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 930, 130));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setText("Semester");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, -1, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setText("Evaluator's Name");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Status");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText("Employee Name");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, -1));

        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterActionPerformed(evt);
            }
        });
        getContentPane().add(semester, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 130, 30));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 110, 30));

        employeename.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeenameActionPerformed(evt);
            }
        });
        getContentPane().add(employeename, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 170, 30));
        getContentPane().add(evaluator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 170, 30));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText("Year level");
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        yearlevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        yearlevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlevelActionPerformed(evt);
            }
        });
        getContentPane().add(yearlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 110, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText("A. Commitment");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("1. Demonstrate sensitivity to students' ability to attend and absorb content information.");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("2. Integrate sensitivity his/her learning objectives with those of the students in collaborative process.");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("3. Makes self availabe to students beyond official time.");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("4. Regularly comes to class on time, well-groomed and well-prepared to complete assigned responsibilities.");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("5. Keeps accurate records of students' performance and prompt submission of the same.");

        a1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText("Scale");

        a2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        a3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        a5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        savebtn.setBackground(new java.awt.Color(153, 153, 153));
        savebtn.setText("Submit");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        nextbtn.setBackground(new java.awt.Color(153, 153, 153));
        nextbtn.setText("Next");
        nextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(34, 34, 34)
                                        .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(390, 390, 390)
                                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(nextbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(67, 67, 67))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel50)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 930, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void employeenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeenameActionPerformed

    private void yearlevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearlevelActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
    // Get values from the input fields
    String evaluatorName = evaluator.getText();
    String Status = status.getSelectedItem().toString();
    String yearLevel = yearlevel.getSelectedItem().toString();
    String employeeName = employeename.getSelectedItem().toString();
    String Semester = semester.getSelectedItem().toString();
    String A1 = a1.getSelectedItem().toString();
    String A2 = a2.getSelectedItem().toString();
    String A3 = a3.getSelectedItem().toString();
    String A4 = a4.getSelectedItem().toString();
    String A5 = a5.getSelectedItem().toString();

    // Check if any field is empty
    if (evaluatorName.isEmpty() || Status.isEmpty() || yearLevel.isEmpty() || employeeName.isEmpty() || Semester.isEmpty()
            || A1.isEmpty() || A2.isEmpty() || A3.isEmpty() || A4.isEmpty() || A5.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        try {
            // Parse the values of A1, A2, A3, A4, and A5 to integers
            int intA1 = Integer.parseInt(A1);
            int intA2 = Integer.parseInt(A2);
            int intA3 = Integer.parseInt(A3);
            int intA4 = Integer.parseInt(A4);
            int intA5 = Integer.parseInt(A5);

            // Calculate the total
            int atotal = (intA1 + intA2 + intA3 + intA4 + intA5) / 5;

            // Create a SQL INSERT statement
            String sql = "INSERT INTO evaluations (evaluator, status, yearlevel, instructor, semester, a1, a2, a3, a4, a5, atotal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);

            // Set the values for the prepared statement parameters
            statement.setString(1, evaluatorName);
            statement.setString(2, Status);
            statement.setString(3, yearLevel);
            statement.setString(4, employeeName);
            statement.setString(5, Semester);
            statement.setString(6, A1);
            statement.setString(7, A2);
            statement.setString(8, A3);
            statement.setString(9, A4);
            statement.setString(10, A5);
            statement.setInt(11, atotal);

            // Execute the INSERT statement
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data inserted successfully.");
            }
        } catch (SQLException ex) {
            // Handle any SQL exceptions
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            // Handle any number format exceptions
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error parsing scores: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_savebtnActionPerformed

    private void nextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtnActionPerformed
        Homepage1 Homepage1Intance = new Homepage1();
        Homepage1Intance.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nextbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> a1;
    private javax.swing.JComboBox<String> a2;
    private javax.swing.JComboBox<String> a3;
    private javax.swing.JComboBox<String> a4;
    private javax.swing.JComboBox<String> a5;
    private javax.swing.JComboBox<String> employeename;
    private javax.swing.JTextField evaluator;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nextbtn;
    private javax.swing.JButton savebtn;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JComboBox<String> yearlevel;
    // End of variables declaration//GEN-END:variables
}