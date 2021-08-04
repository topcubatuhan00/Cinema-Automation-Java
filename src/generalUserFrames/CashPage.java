
package generalUserFrames;

import MainClasses.Payment;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import managerClasses.RootManager;


public class CashPage extends javax.swing.JFrame {
    
    RootManager rootManager = new RootManager();
    Payment payment;

    public CashPage() {
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

        lblInp = new javax.swing.JLabel();
        txtTck = new javax.swing.JTextField();
        lblCashInp = new javax.swing.JLabel();
        txtCash = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        lblInp.setBackground(new java.awt.Color(102, 102, 102));
        lblInp.setFont(new java.awt.Font("Sitka Heading", 0, 36)); // NOI18N
        lblInp.setForeground(new java.awt.Color(255, 255, 255));
        lblInp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInp.setLabelFor(txtTck);
        lblInp.setText("Bilet Adeti :");

        txtTck.setBackground(new java.awt.Color(204, 204, 255));
        txtTck.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        txtTck.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCashInp.setBackground(new java.awt.Color(153, 153, 153));
        lblCashInp.setFont(new java.awt.Font("Sitka Heading", 0, 36)); // NOI18N
        lblCashInp.setForeground(new java.awt.Color(255, 255, 255));
        lblCashInp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCashInp.setLabelFor(txtCash);
        lblCashInp.setText("Para Girişi");

        txtCash.setBackground(new java.awt.Color(204, 204, 255));
        txtCash.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        txtCash.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Öde");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ana Sayfa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCashInp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblInp, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTck)
                            .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTck, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(lblInp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCashInp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String ticketP = txtTck.getText();
        int ticketPiece = Integer.parseInt(ticketP);
        
        String cashI = txtCash.getText();
        int cashInput = Integer.parseInt(cashI);
        
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        
        if(cashInput > (Payment.getQuantity()*ticketPiece)){
            JOptionPane.showMessageDialog(this,df.format(Payment.getPaymentDate())+" Tarihinde "+Payment.getMovieName()+" Filimine"+(ticketPiece*Payment.getQuantity())
            +" TL Tutarında Bilet Alışınız Onaylanmıştır"+" Para Üstünüz : "+(cashInput-(ticketPiece*Payment.getQuantity())));
            Menu menu = new Menu();
            menu.setVisible(true);
            setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(this, "Hata Eksik Tutar.");
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblCashInp;
    private javax.swing.JLabel lblInp;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtTck;
    // End of variables declaration//GEN-END:variables
}
