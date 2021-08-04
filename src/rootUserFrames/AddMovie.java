
package rootUserFrames;

import managerClasses.RootManager;
import MainClasses.Movie;
import java.awt.*;
import javax.swing.*;


public class AddMovie extends javax.swing.JFrame {

    RootManager rootManager = new RootManager();
    
    public AddMovie() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\batuh\\OneDrive\\JAVA\\Project-frontend\\project-forntend\\src\\images\\icon.png");    
        setIconImage(icon);  
        this.setTitle("Dadaş Sinaması");
        setSize(1000,600);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("C:\\Users\\batuh\\OneDrive\\JAVA\\Project-frontend\\project-forntend\\src\\images\\root.jpg"));
        getContentPane().add(background);
        background.setLayout(new FlowLayout());
        lblAddMovieDate.setOpaque(true);
        lblAddMovieLanguage.setOpaque(true);
        lblAddMoviePrice.setOpaque(true);
        lblAddMovieResult.setOpaque(true);
        lblAddMovieTitle.setOpaque(true);
        lblAddMovieType.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddMovieTitle = new javax.swing.JLabel();
        lblAddMovieLanguage = new javax.swing.JLabel();
        lblAddMovieType = new javax.swing.JLabel();
        lblAddMovieDate = new javax.swing.JLabel();
        txtAddMovieTitle = new javax.swing.JTextField();
        txtAddMovieLanguage = new javax.swing.JTextField();
        txtAddMovieType = new javax.swing.JTextField();
        txtAddMovieDate = new javax.swing.JTextField();
        lblAddMoviePrice = new javax.swing.JLabel();
        txtAddMoviePrice = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblAddMovieResult = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        lblAddMovieTitle.setBackground(new java.awt.Color(255, 204, 204));
        lblAddMovieTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAddMovieTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddMovieTitle.setText("Film Başlığı :");

        lblAddMovieLanguage.setBackground(new java.awt.Color(255, 204, 204));
        lblAddMovieLanguage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAddMovieLanguage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddMovieLanguage.setText("Film Dili :");

        lblAddMovieType.setBackground(new java.awt.Color(255, 204, 204));
        lblAddMovieType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAddMovieType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddMovieType.setText("Film Türü :");

        lblAddMovieDate.setBackground(new java.awt.Color(255, 204, 204));
        lblAddMovieDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAddMovieDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddMovieDate.setText("Film Yayın Tarihi :");

        txtAddMovieTitle.setBackground(new java.awt.Color(204, 255, 204));
        txtAddMovieTitle.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        txtAddMovieTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddMovieTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddMovieTitleActionPerformed(evt);
            }
        });

        txtAddMovieLanguage.setBackground(new java.awt.Color(204, 255, 204));
        txtAddMovieLanguage.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        txtAddMovieLanguage.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAddMovieType.setBackground(new java.awt.Color(204, 255, 204));
        txtAddMovieType.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        txtAddMovieType.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAddMovieDate.setBackground(new java.awt.Color(204, 255, 204));
        txtAddMovieDate.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        txtAddMovieDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblAddMoviePrice.setBackground(new java.awt.Color(255, 204, 204));
        lblAddMoviePrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAddMoviePrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddMoviePrice.setText("Film 1 Bilet Ücreti :");

        txtAddMoviePrice.setBackground(new java.awt.Color(204, 255, 204));
        txtAddMoviePrice.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        txtAddMoviePrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnSave.setBackground(new java.awt.Color(51, 255, 204));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSave.setText("Kaydet");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblAddMovieResult.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblAddMovieResult.setForeground(new java.awt.Color(51, 153, 255));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ana Menü");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(217, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAddMovieDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAddMoviePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAddMovieDate)
                                    .addComponent(txtAddMoviePrice)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAddMovieTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(lblAddMovieLanguage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAddMovieType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtAddMovieLanguage, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAddMovieTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtAddMovieType, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(255, 255, 255)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lblAddMovieResult, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddMovieTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddMovieTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddMovieLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddMovieLanguage))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblAddMovieType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddMovieType, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAddMovieDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddMoviePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddMovieDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddMoviePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(lblAddMovieResult, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddMovieTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddMovieTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddMovieTitleActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String movieTitle,movieLanguage,movieType,moviePublishingDate;
        movieTitle = txtAddMovieTitle.getText();
        movieLanguage = txtAddMovieLanguage.getText();
        movieType = txtAddMovieType.getText();
        moviePublishingDate = txtAddMovieDate.getText();
        String oldMovieTicketPrice = txtAddMoviePrice.getText();
        int movieTicketPrice = Integer.parseInt(oldMovieTicketPrice);
        
        Movie movie = new Movie(movieTitle,movieLanguage,movieType,moviePublishingDate,movieTicketPrice);
        
        if(rootManager.addMovie(movie)){
            JOptionPane.showMessageDialog(this, "Film Başarıyla Kaydedildi.");
        }else{
            JOptionPane.showMessageDialog(this, "Film Kaydedilemiyor.");
        }
        setVisible(false);
        RootMenu rootMenu = new RootMenu();
        rootMenu.setVisible(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RootMenu rootMenu = new RootMenu();
        rootMenu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAddMovieDate;
    private javax.swing.JLabel lblAddMovieLanguage;
    private javax.swing.JLabel lblAddMoviePrice;
    private javax.swing.JLabel lblAddMovieResult;
    private javax.swing.JLabel lblAddMovieTitle;
    private javax.swing.JLabel lblAddMovieType;
    private javax.swing.JTextField txtAddMovieDate;
    private javax.swing.JTextField txtAddMovieLanguage;
    private javax.swing.JTextField txtAddMoviePrice;
    private javax.swing.JTextField txtAddMovieTitle;
    private javax.swing.JTextField txtAddMovieType;
    // End of variables declaration//GEN-END:variables
}
