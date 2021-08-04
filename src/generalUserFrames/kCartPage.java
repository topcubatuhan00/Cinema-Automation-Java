
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

public class kCartPage extends javax.swing.JFrame {

    public kCartPage() {
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

        lblKno = new javax.swing.JLabel();
        lblSKN = new javax.swing.JLabel();
        lblCvc = new javax.swing.JLabel();
        txtKNo = new javax.swing.JTextField();
        txtSKN = new javax.swing.JTextField();
        txtCvc = new javax.swing.JTextField();
        lblTicket = new javax.swing.JLabel();
        txtTicketQuantity = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        lblKno.setBackground(new java.awt.Color(204, 204, 255));
        lblKno.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblKno.setForeground(new java.awt.Color(255, 255, 255));
        lblKno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKno.setText("Kart Numarası :");
        lblKno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblSKN.setBackground(new java.awt.Color(204, 204, 255));
        lblSKN.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblSKN.setForeground(new java.awt.Color(255, 255, 255));
        lblSKN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSKN.setText("Son Kullanma Tarihi :");
        lblSKN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblCvc.setBackground(new java.awt.Color(204, 204, 255));
        lblCvc.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblCvc.setForeground(new java.awt.Color(255, 255, 255));
        lblCvc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCvc.setText("CVC :");
        lblCvc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtKNo.setBackground(new java.awt.Color(102, 102, 255));
        txtKNo.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        txtKNo.setForeground(new java.awt.Color(255, 255, 255));
        txtKNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKNoActionPerformed(evt);
            }
        });

        txtSKN.setBackground(new java.awt.Color(102, 102, 255));
        txtSKN.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        txtSKN.setForeground(new java.awt.Color(255, 255, 255));
        txtSKN.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCvc.setBackground(new java.awt.Color(102, 102, 255));
        txtCvc.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        txtCvc.setForeground(new java.awt.Color(255, 255, 255));
        txtCvc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblTicket.setBackground(new java.awt.Color(204, 204, 255));
        lblTicket.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblTicket.setForeground(new java.awt.Color(255, 255, 255));
        lblTicket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTicket.setText("Bilet Adeti :");
        lblTicket.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtTicketQuantity.setBackground(new java.awt.Color(102, 102, 255));
        txtTicketQuantity.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        txtTicketQuantity.setForeground(new java.awt.Color(255, 255, 255));
        txtTicketQuantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnBack.setBackground(new java.awt.Color(255, 0, 51));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Ana Menü");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(51, 255, 51));
        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConfirm.setText("Öde");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTicketQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKno, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSKN, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCvc, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSKN, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKNo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCvc, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTicketQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(lblTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtKNo)
                    .addComponent(lblKno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSKN)
                    .addComponent(lblSKN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCvc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCvc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        
        
        
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        
        String ticketQu = txtTicketQuantity.getText();
        int ticketQuantity = Integer.parseInt(ticketQu);
        
        String kno = txtKNo.getText();
        String skn = txtSKN.getText();
        String cvc = txtCvc.getText();
        
        if(kno.length()==16 && skn.length()==5 && cvc.length()==3){
            JOptionPane.showMessageDialog(this,df.format(Payment.getPaymentDate())+" Tarihinde "+Payment.getMovieName()+" Filimine"+(ticketQuantity*Payment.getQuantity())
            +" TL Tutarında Bilet Alışınız Onaylanmıştır");
            Menu menu = new Menu();
            menu.setVisible(true);
            setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(this, "Hata Ödeme Alınamadı.");
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtKNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKNoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kCartPage().setVisible(true);
            }
        });
    }
    
    public void confirm(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel lblCvc;
    private javax.swing.JLabel lblKno;
    private javax.swing.JLabel lblSKN;
    private javax.swing.JLabel lblTicket;
    private javax.swing.JTextField txtCvc;
    private javax.swing.JTextField txtKNo;
    private javax.swing.JTextField txtSKN;
    private javax.swing.JTextField txtTicketQuantity;
    // End of variables declaration//GEN-END:variables
}
