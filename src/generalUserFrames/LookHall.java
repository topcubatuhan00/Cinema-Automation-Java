
package generalUserFrames;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import managerClasses.RootManager;
import managerClasses.UserManager;

public class LookHall extends javax.swing.JFrame {
    
    DefaultListModel modelDadas;
    DefaultListModel modelPalandoken;
    DefaultListModel modelYakutiye;
    
    ArrayList<String> dadasArray;
    ArrayList<String> palandokenArray;
    ArrayList<String> yakutiyeArray;
    
    RootManager rootManager = new RootManager();
    UserManager userManager = new UserManager();

    public LookHall() {
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
        
        modelDadas = new DefaultListModel();
        dadasArray = userManager.lookMovie("dadas");
        if(dadasArray.size() == 0){
            modelDadas.addElement("Gösterimde Film Yok");
        
        }
        else{
            for(String mov : dadasArray){
            modelDadas.addElement(mov);
            }
        }
        lstDadas.setModel(modelDadas);
        
        
        
        modelPalandoken = new DefaultListModel();
        palandokenArray = userManager.lookMovie("palandoken");
        if(palandokenArray.size() == 0){
            modelPalandoken.addElement("Gösterimde Film Yok");
        
        }
        else{
            for(String mov : palandokenArray){
            modelPalandoken.addElement(mov);
            }
        }
        lstPalandoken.setModel(modelPalandoken);
        
        
        modelYakutiye = new DefaultListModel();
        yakutiyeArray = userManager.lookMovie("yakutiye");
        if(yakutiyeArray.size() == 0){
            modelYakutiye.addElement("Gösterimde Film Yok");
        
        }
        else{
            for(String mov : yakutiyeArray){
            modelYakutiye.addElement(mov);
            }
        }
        lstYakutiye.setModel(modelYakutiye);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBackMenu = new javax.swing.JButton();
        lblYakt = new javax.swing.JLabel();
        lblDadas = new javax.swing.JLabel();
        lblPala = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDadas = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstYakutiye = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstPalandoken = new javax.swing.JList<>();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        btnBackMenu.setBackground(new java.awt.Color(255, 0, 51));
        btnBackMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBackMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnBackMenu.setText("Ana Menü");
        btnBackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMenuActionPerformed(evt);
            }
        });

        lblYakt.setFont(new java.awt.Font("Sitka Heading", 0, 24)); // NOI18N
        lblYakt.setForeground(new java.awt.Color(255, 255, 255));
        lblYakt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYakt.setText("Yakutiye Salonu");

        lblDadas.setFont(new java.awt.Font("Sitka Heading", 0, 24)); // NOI18N
        lblDadas.setForeground(new java.awt.Color(255, 255, 255));
        lblDadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDadas.setText("Dadaş Salonu");

        lblPala.setFont(new java.awt.Font("Sitka Heading", 0, 24)); // NOI18N
        lblPala.setForeground(new java.awt.Color(255, 255, 255));
        lblPala.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPala.setText("Palandöken Salonu");

        lstDadas.setBackground(new java.awt.Color(204, 255, 204));
        lstDadas.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        lstDadas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstDadas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstDadas);

        lstYakutiye.setBackground(new java.awt.Color(204, 255, 204));
        lstYakutiye.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        lstYakutiye.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstYakutiye.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstYakutiye);

        lstPalandoken.setBackground(new java.awt.Color(204, 255, 204));
        lstPalandoken.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        lstPalandoken.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstPalandoken.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lstPalandoken);

        btnNext.setBackground(new java.awt.Color(102, 0, 102));
        btnNext.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Devam Et");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPala, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(lblYakt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBackMenu)
                .addGap(705, 705, 705)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblYakt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDadas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPala, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMenuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBackMenuActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        
        PaymentPage paymentPage;
        
        int indexD = lstDadas.getSelectedIndex();
        int indexP = lstPalandoken.getSelectedIndex();
        int indexY = lstYakutiye.getSelectedIndex();
        
        if(indexD!=-1){
            String movieName = (String) modelDadas.getElementAt(indexD);
            paymentPage  = new PaymentPage(movieName);
            paymentPage.setVisible(true);
        }
        else if(indexP!=-1){
            String movieName = (String) modelPalandoken.getElementAt(indexP);
            paymentPage  = new PaymentPage(movieName);
            paymentPage.setVisible(true);
        }
        else if(indexY!=-1){
            String movieName = (String) modelYakutiye.getElementAt(indexY);
            paymentPage  = new PaymentPage(movieName);
            paymentPage.setVisible(true);
        }
        setVisible(false);
    }//GEN-LAST:event_btnNextActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LookHall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackMenu;
    private javax.swing.JButton btnNext;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDadas;
    private javax.swing.JLabel lblPala;
    private javax.swing.JLabel lblYakt;
    private javax.swing.JList<String> lstDadas;
    private javax.swing.JList<String> lstPalandoken;
    private javax.swing.JList<String> lstYakutiye;
    // End of variables declaration//GEN-END:variables
}
