
import javax.swing.JOptionPane;
import rootUserFrames.RootMenu;
import generalUserFrames.Menu;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import managerClasses.UserManager;

public class Login extends javax.swing.JFrame {

    UserManager userManager = new UserManager();
    
    public Login() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\batuh\\OneDrive\\JAVA\\Project-frontend\\project-forntend\\src\\images\\icon.png");    
        setIconImage(icon);  
        this.setTitle("Dadaş Sinaması");
        setSize(1000,600);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("C:\\Users\\batuh\\OneDrive\\JAVA\\Project-frontend\\project-forntend\\src\\images\\main.jpg"));
        getContentPane().add(background);
        background.setLayout(new FlowLayout());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLoginUsername = new javax.swing.JLabel();
        lblLoginPassword = new javax.swing.JLabel();
        btnLoginClick = new javax.swing.JButton();
        txtLoginUsername = new javax.swing.JTextField();
        txtLoginPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        lblLoginUsername.setBackground(new java.awt.Color(204, 204, 255));
        lblLoginUsername.setFont(new java.awt.Font("Sitka Heading", 0, 36)); // NOI18N
        lblLoginUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblLoginUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginUsername.setText("Kullanıcı Adı ");

        lblLoginPassword.setBackground(new java.awt.Color(204, 204, 255));
        lblLoginPassword.setFont(new java.awt.Font("Sitka Subheading", 0, 36)); // NOI18N
        lblLoginPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblLoginPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginPassword.setText("Şifre");

        btnLoginClick.setBackground(new java.awt.Color(102, 0, 102));
        btnLoginClick.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        btnLoginClick.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginClick.setText("Giriş Yap");
        btnLoginClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginClickActionPerformed(evt);
            }
        });

        txtLoginUsername.setBackground(new java.awt.Color(255, 255, 153));
        txtLoginUsername.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        txtLoginUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtLoginPassword.setBackground(new java.awt.Color(255, 255, 153));
        txtLoginPassword.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        txtLoginPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLoginPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLoginUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLoginPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtLoginUsername)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(btnLoginClick, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLoginUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(lblLoginUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLoginPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLoginPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(btnLoginClick, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginClickActionPerformed
        String loginUsername = txtLoginUsername.getText();
        String loginPassword = txtLoginPassword.getText();
        if(userManager.login(loginUsername,loginPassword)){
            JOptionPane.showMessageDialog(this, "Giriş Başarılı");
            if(loginUsername.equals("root")){
                rootUserMenu();
            }
            else{
                generalUserMenu();
            }
            
            setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this, "Kullanıcı Adı veya Şifre Hatalı.");
        }
    }//GEN-LAST:event_btnLoginClickActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginClick;
    private javax.swing.JLabel lblLoginPassword;
    private javax.swing.JLabel lblLoginUsername;
    private javax.swing.JPasswordField txtLoginPassword;
    private javax.swing.JTextField txtLoginUsername;
    // End of variables declaration//GEN-END:variables

    public static void rootUserMenu(){
        RootMenu rootMenu = new RootMenu();
        rootMenu.setVisible(true);
    }
    public static void generalUserMenu(){
        Menu menu = new Menu();
        menu.setVisible(true);
    }
}
