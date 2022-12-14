package ui;
public class DangNhap_JFrame extends javax.swing.JFrame {

    public DangNhap_JFrame() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPassworld = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassworld = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtKetThuc = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        chkShowPassworld = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btn_Login.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("ĐĂNG NHẬP");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        lblPassworld.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPassworld.setForeground(new java.awt.Color(153, 153, 153));
        lblPassworld.setText("Passworld");
        jPanel2.add(lblPassworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, 30));

        lblUserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(153, 153, 153));
        lblUserName.setText("User name");
        jPanel2.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, 30));

        txtUserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 204)));
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });
        jPanel2.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 221, 31));

        txtPassworld.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassworld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 204)));
        txtPassworld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassworldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassworldFocusLost(evt);
            }
        });
        jPanel2.add(txtPassworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 221, 30));

        jLabel6.setText("Quên mật khẩu?");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        txtKetThuc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtKetThuc.setForeground(new java.awt.Color(255, 0, 0));
        txtKetThuc.setText("Kết thúc");
        txtKetThuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtKetThuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtKetThucMouseClicked(evt);
            }
        });
        jPanel2.add(txtKetThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/aside.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 270, 290));

        chkShowPassworld.setText("HIển thị mật khẩu");
        chkShowPassworld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPassworldActionPerformed(evt);
            }
        });
        jPanel2.add(chkShowPassworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 630, 320));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/background.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtKetThucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtKetThucMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtKetThucMouseClicked
    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
        lblUserName.setVisible(false);
    }//GEN-LAST:event_txtUserNameFocusGained

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
        if (txtUserName.getText().equals("")) {
            lblUserName.setVisible(true);
        }
    }//GEN-LAST:event_txtUserNameFocusLost

    private void txtPassworldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassworldFocusGained
        lblPassworld.setVisible(false);
    }//GEN-LAST:event_txtPassworldFocusGained

    private void txtPassworldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassworldFocusLost
        if (String.valueOf(txtPassworld.getPassword()).equals("")) {
            lblPassworld.setVisible(true);
        }

    }//GEN-LAST:event_txtPassworldFocusLost

    private void chkShowPassworldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPassworldActionPerformed
        if (chkShowPassworld.isSelected()) {
            txtPassworld.setEchoChar((char) 0);
        } else {
            txtPassworld.setEchoChar('*');

        }
    }//GEN-LAST:event_chkShowPassworldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhap_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkShowPassworld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPassworld;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel txtKetThuc;
    private javax.swing.JPasswordField txtPassworld;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
