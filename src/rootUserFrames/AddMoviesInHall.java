package rootUserFrames;

import MainClasses.Hall;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import managerClasses.RootManager;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AddMoviesInHall extends javax.swing.JFrame {
    
    DefaultListModel model;
    DefaultListModel model2;
    ArrayList<String> moviesArray;
    
    RootManager rootManager = new RootManager();
    public static Hall hall;

    public AddMoviesInHall() {
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
        lblHallDate.setOpaque(true);
        lblHallFinishTime.setOpaque(true);
        lblHallStartTime.setOpaque(true);
        lblHallsTitle.setOpaque(true);
        lblMoviesTitle.setOpaque(true);
        
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

        lblHallDate = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMovies = new javax.swing.JList<>();
        lblMoviesTitle = new javax.swing.JLabel();
        lblHallStartTime = new javax.swing.JLabel();
        lblHallFinishTime = new javax.swing.JLabel();
        txtHallStartTime = new javax.swing.JTextField();
        txtHallFinishTime = new javax.swing.JTextField();
        txtHallDate = new javax.swing.JTextField();
        lblHallsTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstHalls = new javax.swing.JList<>();
        btnSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        lblHallDate.setBackground(new java.awt.Color(153, 153, 153));
        lblHallDate.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lblHallDate.setForeground(new java.awt.Color(255, 255, 255));
        lblHallDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHallDate.setText("Hangi Tarihte Gösterimde : ");

        lstMovies.setBackground(new java.awt.Color(204, 255, 204));
        lstMovies.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        lstMovies.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstMovies.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstMovies);

        lblMoviesTitle.setBackground(new java.awt.Color(153, 153, 153));
        lblMoviesTitle.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lblMoviesTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblMoviesTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMoviesTitle.setText("Sistemdeki Filmler");

        lblHallStartTime.setBackground(new java.awt.Color(153, 153, 153));
        lblHallStartTime.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lblHallStartTime.setForeground(new java.awt.Color(255, 255, 255));
        lblHallStartTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHallStartTime.setText("Saat Kaçta Başlayacak :");

        lblHallFinishTime.setBackground(new java.awt.Color(153, 153, 153));
        lblHallFinishTime.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lblHallFinishTime.setForeground(new java.awt.Color(255, 255, 255));
        lblHallFinishTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHallFinishTime.setText("Saat Kaçta Bitecek : ");

        txtHallStartTime.setBackground(new java.awt.Color(0, 153, 153));
        txtHallStartTime.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        txtHallStartTime.setForeground(new java.awt.Color(255, 255, 255));
        txtHallStartTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtHallFinishTime.setBackground(new java.awt.Color(0, 153, 153));
        txtHallFinishTime.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        txtHallFinishTime.setForeground(new java.awt.Color(255, 255, 255));
        txtHallFinishTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtHallDate.setBackground(new java.awt.Color(0, 153, 153));
        txtHallDate.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        txtHallDate.setForeground(new java.awt.Color(255, 255, 255));
        txtHallDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHallDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHallDateActionPerformed(evt);
            }
        });

        lblHallsTitle.setBackground(new java.awt.Color(153, 153, 153));
        lblHallsTitle.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lblHallsTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblHallsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHallsTitle.setText("Salonlar");

        lstHalls.setBackground(new java.awt.Color(204, 255, 204));
        lstHalls.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        lstHalls.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstHalls.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstHalls);

        btnSave.setBackground(new java.awt.Color(255, 153, 204));
        btnSave.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btnSave.setText("Kaydet");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHallFinishTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHallStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHallDate, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(txtHallDate, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(txtHallStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtHallFinishTime, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(159, 159, 159)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblHallsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMoviesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHallDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHallDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHallStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(lblHallStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblHallFinishTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtHallFinishTime, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblMoviesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHallsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int movieIndex = lstMovies.getSelectedIndex();
        String movieName = (String)model.getElementAt(movieIndex);
        
        int hallIndex = lstHalls.getSelectedIndex();
        String hallN = (String)model2.getElementAt(hallIndex);
        String hallName = hallN.toLowerCase();
        hall = new Hall(hallName);
        String date = txtHallDate.getText();
        String startTime = txtHallStartTime.getText();
        String finishTime = txtHallFinishTime.getText();
        
        int moviePrice = rootManager.getPrice(movieName);
        
        if(rootManager.addMovieInHall(hall,movieName,date,startTime,finishTime,moviePrice)){
            JOptionPane.showMessageDialog(this, "Gösterim Başarıyla Eklendi");
            setVisible(false);
            
            RootMenu rootMenu = new RootMenu();
            rootMenu.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Eklemek İstediğiniz Film Zaten Gösterimde");
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RootMenu rootMenu = new RootMenu();
        rootMenu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtHallDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHallDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHallDateActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMoviesInHall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHallDate;
    private javax.swing.JLabel lblHallFinishTime;
    private javax.swing.JLabel lblHallStartTime;
    private javax.swing.JLabel lblHallsTitle;
    private javax.swing.JLabel lblMoviesTitle;
    private javax.swing.JList<String> lstHalls;
    private javax.swing.JList<String> lstMovies;
    private javax.swing.JTextField txtHallDate;
    private javax.swing.JTextField txtHallFinishTime;
    private javax.swing.JTextField txtHallStartTime;
    // End of variables declaration//GEN-END:variables
}
