
package generalUserFrames.searchFrames;

import MainClasses.Movie;
import generalUserFrames.Menu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import managerClasses.UserManager;


public class Result extends javax.swing.JFrame {
    
    DefaultTableModel model;
    UserManager userManager = new UserManager();
    
    private String query;

    
    
    
    public void seeResult(){

        model.setRowCount(0);
        
        ArrayList<Movie> movies = new ArrayList<Movie>();
        
        movies = userManager.search(query);
        
        if(movies != null){
            for(Movie mov : movies){
                Object[] eklenecek = {mov.getTitle(),mov.getLanguage(),mov.getType(),mov.getPrice()};
                model.addRow(eklenecek);
            }
        }

    }
    
    public Result() {
        initComponents();
        model = (DefaultTableModel) tblMovies.getModel();
        seeResult();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\batuh\\OneDrive\\JAVA\\Project-frontend\\project-forntend\\src\\images\\icon.png");    
        setIconImage(icon);  
        this.setTitle("Dadaş Sinaması");
        setSize(1000,600);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("C:\\Users\\batuh\\OneDrive\\JAVA\\Project-frontend\\project-forntend\\src\\images\\katolog.jpg"));
        getContentPane().add(background);
        background.setLayout(new FlowLayout());
        tblMovies.setOpaque(true);
    }
    
    public Result(String query) {
        this.query = query;
        initComponents();
        model = (DefaultTableModel) tblMovies.getModel();
        seeResult();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\batuh\\OneDrive\\JAVA\\Project-frontend\\project-forntend\\src\\images\\icon.png");    
        setIconImage(icon);  
        this.setTitle("Dadaş Sinaması");
        setSize(1000,600);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("C:\\Users\\batuh\\OneDrive\\JAVA\\Project-frontend\\project-forntend\\src\\images\\katolog.jpg"));
        getContentPane().add(background);
        background.setLayout(new FlowLayout());
        tblMovies.setOpaque(true);
        JTableHeader header = tblMovies.getTableHeader();
        header.setOpaque(true);
        header.setBackground(Color.black);
        header.setForeground(Color.white);
        header.setPreferredSize(new Dimension(50, 50));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovies = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        tblMovies.setBackground(new java.awt.Color(204, 255, 204));
        tblMovies.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        tblMovies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Başlık", "Dil", "Tür", "Bilet Ücreti"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMovies.setRowHeight(35);
        tblMovies.setRowMargin(20);
        jScrollPane1.setViewportView(tblMovies);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
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
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMovies;
    // End of variables declaration//GEN-END:variables
}
