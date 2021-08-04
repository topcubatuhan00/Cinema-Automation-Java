
package generalUserFrames;

import generalUserFrames.searchFrames.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SearchMenuPage extends javax.swing.JFrame {

    public SearchMenuPage() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\batuh\\OneDrive\\JAVA\\Project-frontend\\project-forntend\\src\\images\\icon.png");    
        setIconImage(icon);  
        this.setTitle("Dadaş Sinaması");
        setSize(1000,600);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("C:\\Users\\batuh\\OneDrive\\JAVA\\Project-frontend\\project-forntend\\src\\images\\cashType.jpg"));
        getContentPane().add(background);
        background.setLayout(new FlowLayout());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTitle = new javax.swing.JButton();
        btnLanguage = new javax.swing.JButton();
        btnType = new javax.swing.JButton();
        btnDate = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        btnTitle.setBackground(new java.awt.Color(255, 204, 204));
        btnTitle.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        btnTitle.setText("İsime Göre");
        btnTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTitleActionPerformed(evt);
            }
        });

        btnLanguage.setBackground(new java.awt.Color(255, 204, 204));
        btnLanguage.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        btnLanguage.setText("Dil'e Göre");
        btnLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanguageActionPerformed(evt);
            }
        });

        btnType.setBackground(new java.awt.Color(255, 204, 204));
        btnType.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        btnType.setText("Türe Göre");
        btnType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTypeActionPerformed(evt);
            }
        });

        btnDate.setBackground(new java.awt.Color(255, 204, 204));
        btnDate.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        btnDate.setText("Tarihe Göre");
        btnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateActionPerformed(evt);
            }
        });

        btnMainMenu.setBackground(new java.awt.Color(255, 0, 0));
        btnMainMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMainMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMainMenu.setText("Ana Sayfa");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLanguage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(306, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnMainMenu)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLanguage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTitleActionPerformed
        Title title = new Title();
        title.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnTitleActionPerformed

    private void btnTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTypeActionPerformed
        TypeS typeS = new TypeS();
        typeS.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnTypeActionPerformed

    private void btnLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanguageActionPerformed
        Language language = new Language();
        language.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLanguageActionPerformed

    private void btnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateActionPerformed
        Date date = new Date();
        date.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnDateActionPerformed

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMainMenuActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchMenuPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDate;
    private javax.swing.JButton btnLanguage;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnTitle;
    private javax.swing.JButton btnType;
    // End of variables declaration//GEN-END:variables
}
