
package rootUserFrames;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import managerClasses.RootManager;

public class DeleteMovieInHall extends javax.swing.JFrame {
    
    
    DefaultListModel model;
    DefaultListModel model2;
    ArrayList<String> moviesArray;
    
    RootManager rootManager = new RootManager();
    

    public DeleteMovieInHall() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\batuh\\OneDrive\\JAVA\\Project-frontend\\project-forntend\\src\\images\\icon.png");    
        setIconImage(icon);  
        this.setTitle("Dadaş Sinaması");
        setSize(1000,600);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("C:\\Users\\batuh\\OneDrive\\JAVA\\Project-frontend\\project-forntend\\src\\images\\katolog.jpg"));
        getContentPane().add(background);
        background.setLayout(new FlowLayout());
        lblHalls.setOpaque(true);
        lblMovies.setOpaque(true);
        model = new DefaultListModel();
        moviesArray = rootManager.getMovie();
        
        for(String mov : moviesArray){
            model.addElement(mov);
        }
        
        lstMovies.setModel(model);
        
        model2 = new DefaultListModel();
        lstHalls.setModel(model2);
        model2.addElement("Dadas");
        model2.addElement("Palandoken");
        model2.addElement("Yakutiye");
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstHalls = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMovies = new javax.swing.JList<>();
        lblMovies = new javax.swing.JLabel();
        lblHalls = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        lstHalls.setBackground(new java.awt.Color(255, 204, 255));
        lstHalls.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        lstHalls.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstHalls.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstHalls);

        lstMovies.setBackground(new java.awt.Color(255, 204, 255));
        lstMovies.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        lstMovies.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstMovies);

        lblMovies.setBackground(new java.awt.Color(153, 153, 153));
        lblMovies.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lblMovies.setForeground(new java.awt.Color(255, 255, 255));
        lblMovies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMovies.setText("Gösterimini Iptal Etmek Istediginiz Film");

        lblHalls.setBackground(new java.awt.Color(153, 153, 153));
        lblHalls.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lblHalls.setForeground(new java.awt.Color(255, 255, 255));
        lblHalls.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHalls.setText("Gösterimi Iptal Etmek Istediginiz Salon");

        btnSave.setBackground(new java.awt.Color(102, 255, 204));
        btnSave.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btnSave.setText("Iptal Et");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ana Sayfa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(298, 298, 298)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(lblHalls, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMovies, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblHalls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMovies, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        int movieIndex = lstMovies.getSelectedIndex();
        String movieName = (String)model.getElementAt(movieIndex);
        
        int hallIndex = lstHalls.getSelectedIndex();
        String hallN = (String)model2.getElementAt(hallIndex);
        String hallName = hallN.toLowerCase();
        
        if(rootManager.deleteMovieInHall(hallName,movieName)){
            JOptionPane.showMessageDialog(this, "Gösterim Başarıyla Kaldırıldı");
        }
        else{
            JOptionPane.showMessageDialog(this, "Gösterim Kaldırılamıyor");
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
                new DeleteMovieInHall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHalls;
    private javax.swing.JLabel lblMovies;
    private javax.swing.JList<String> lstHalls;
    private javax.swing.JList<String> lstMovies;
    // End of variables declaration//GEN-END:variables
}
