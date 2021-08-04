package rootUserFrames;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RootMenu extends javax.swing.JFrame {

    public static AddMovie addMovie = new AddMovie();
    public static DeleteMovie deleteMovie = new DeleteMovie();
    public static AddMoviesInHall addMovieInHall = new AddMoviesInHall();
    public static DeleteMovieInHall deleteMovieInHall = new DeleteMovieInHall();
    
    public RootMenu() {
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
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootAddMovie = new javax.swing.JButton();
        rootDeleteMovie = new javax.swing.JButton();
        rootAddMovieInHall = new javax.swing.JButton();
        rootDeleteMovieInHall = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        rootAddMovie.setBackground(new java.awt.Color(255, 204, 51));
        rootAddMovie.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        rootAddMovie.setText("Film Ekle");
        rootAddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootAddMovieActionPerformed(evt);
            }
        });

        rootDeleteMovie.setBackground(new java.awt.Color(255, 204, 51));
        rootDeleteMovie.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        rootDeleteMovie.setText("Film Kaldır");
        rootDeleteMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootDeleteMovieActionPerformed(evt);
            }
        });

        rootAddMovieInHall.setBackground(new java.awt.Color(255, 204, 51));
        rootAddMovieInHall.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        rootAddMovieInHall.setText("Gösterim Ekle");
        rootAddMovieInHall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootAddMovieInHallActionPerformed(evt);
            }
        });

        rootDeleteMovieInHall.setBackground(new java.awt.Color(255, 204, 51));
        rootDeleteMovieInHall.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        rootDeleteMovieInHall.setText("Gösterim Kaldır");
        rootDeleteMovieInHall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootDeleteMovieInHallActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Çıkış");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 379, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rootAddMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rootDeleteMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rootAddMovieInHall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rootDeleteMovieInHall, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(371, 371, 371))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(rootAddMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rootDeleteMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rootAddMovieInHall, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rootDeleteMovieInHall, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rootAddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootAddMovieActionPerformed
        addMovie.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_rootAddMovieActionPerformed

    private void rootDeleteMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootDeleteMovieActionPerformed
        deleteMovie.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_rootDeleteMovieActionPerformed

    private void rootAddMovieInHallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootAddMovieInHallActionPerformed
        addMovieInHall.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_rootAddMovieInHallActionPerformed

    private void rootDeleteMovieInHallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootDeleteMovieInHallActionPerformed
        deleteMovieInHall.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_rootDeleteMovieInHallActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RootMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton rootAddMovie;
    private javax.swing.JButton rootAddMovieInHall;
    private javax.swing.JButton rootDeleteMovie;
    private javax.swing.JButton rootDeleteMovieInHall;
    // End of variables declaration//GEN-END:variables
}
