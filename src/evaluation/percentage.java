/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package evaluation;


import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
/**
 *
 * @author Vallejos
 */
public class percentage extends javax.swing.JInternalFrame {

    /**
     * Creates new form percentage
     */
    public percentage() {
        initComponents();
        fetchData();
    }

    private void fetchData() {
        String url = "jdbc:mysql://localhost/evaluation";
        String user = "root";
        String password = "12345";
        
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            // Modified query to count evaluators and compute total percentage
            String query = "SELECT instructor, COUNT(evaluator) AS evaluator_count, SUM(percentage) AS total_percentage FROM evaluations GROUP BY instructor ORDER BY yearlevel, instructor";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0); // Clear existing data
            
            while (resultSet.next()) {
                String instructor = resultSet.getString("instructor");
                int evaluatorCount = resultSet.getInt("evaluator_count");
                double totalPercentage = resultSet.getDouble("total_percentage");
                
                // Calculate average percentage if needed
                double averagePercentage = totalPercentage / evaluatorCount;
                
                Object[] row = {
                    instructor,
                    evaluatorCount,
                    totalPercentage,
                    averagePercentage
                };
                model.addRow(row);
            }
            
            connection.close();
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

        logoutPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        print = new javax.swing.JButton();
        download = new javax.swing.JButton();

        logoutPanel.setBackground(new java.awt.Color(255, 51, 51));
        logoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutPanelMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/evaluation/male_user_50px.png"))); // NOI18N
        jLabel3.setText("Log-Out");

        javax.swing.GroupLayout logoutPanelLayout = new javax.swing.GroupLayout(logoutPanel);
        logoutPanel.setLayout(logoutPanelLayout);
        logoutPanelLayout.setHorizontalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        logoutPanelLayout.setVerticalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee Name", "Total of Evaluator", "Total Percentage", "Average Percentage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);

        print.setBackground(new java.awt.Color(51, 102, 255));
        print.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-print-16.png"))); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        download.setBackground(new java.awt.Color(51, 102, 255));
        download.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        download.setForeground(new java.awt.Color(255, 255, 255));
        download.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-download-30 (2).png"))); // NOI18N
        download.setText("Download");
        download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(download)
                        .addGap(18, 18, 18)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(download, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseClicked
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION)
        SessionManager.getInstance().logout();
        this.dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_logoutPanelMouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        MessageFormat header = new MessageFormat("Evaluation Report");
        MessageFormat footer = new MessageFormat(" ");
        try {
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(percentage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printActionPerformed

    private void downloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadActionPerformed
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Save As");
    
    // Set default file name and filter for PDF files
    FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF Files", "pdf");
    fileChooser.setFileFilter(filter);
    
    int userSelection = fileChooser.showSaveDialog(this);
    
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToSave = fileChooser.getSelectedFile();
        String filePath = fileToSave.getAbsolutePath();
        
        // Ensure the file has a .pdf extension
        if (!filePath.toLowerCase().endsWith(".pdf")) {
            filePath += ".pdf";
        }
        
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);
            
        try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
    PDType0Font font = PDType0Font.load(document, new File("C:\\Users\\Kenneth\\Downloads\\Lato\\Lato-Bold.ttf"));
    contentStream.setFont(font, 10);

    // Adjust these values as needed to fit the content inside the table cells
    float startX = 50;
    float startY = page.getMediaBox().getHeight() - 50;
    float cellWidth = 150; // Adjusted width for each column
    float cellHeight = 20; // Adjusted height for each row

    // Draw table headers and lines
    for (int i = 0; i < jTable1.getColumnCount(); i++) {
        // Draw header text
        contentStream.beginText();
        contentStream.newLineAtOffset(startX + (i * cellWidth), startY);
        contentStream.showText(jTable1.getColumnName(i));
        contentStream.endText();

        // Draw vertical lines between columns
        contentStream.moveTo(startX + (i * cellWidth), startY);
        contentStream.lineTo(startX + (i * cellWidth), startY - (jTable1.getRowCount() * cellHeight));
        contentStream.stroke();
    }

    // Draw horizontal lines between rows
    for (int row = 0; row <= jTable1.getRowCount(); row++) {
        contentStream.moveTo(startX, startY - (row * cellHeight));
        contentStream.lineTo(startX + (jTable1.getColumnCount() * cellWidth), startY - (row * cellHeight));
        contentStream.stroke();
    }

    // Draw table data
    startY -= cellHeight;
    for (int row = 0; row < jTable1.getRowCount(); row++) {
        for (int col = 0; col < jTable1.getColumnCount(); col++) {
            contentStream.beginText();
            contentStream.newLineAtOffset(startX + (col * cellWidth), startY - (row * cellHeight));
            contentStream.showText(String.valueOf(jTable1.getValueAt(row, col)));
            contentStream.endText();
        }
    }
}

            
            document.save(filePath);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving PDF file: " + ex.getMessage(), "Download Error", JOptionPane.ERROR_MESSAGE);
        }
        
        JOptionPane.showMessageDialog(this, "Table data saved successfully to: " + filePath, "Download Successful", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_downloadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton download;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
