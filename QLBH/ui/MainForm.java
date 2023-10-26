/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QLBH.ui;

import QLBH.Helpers.MessageDialogHelper;
import com.toedter.calendar.HDBHPanel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author VAN ANH
 */
public class MainForm extends javax.swing.JFrame {

    private QLNVPanel mQLNVPanel;
    private QLKHPanel mQLKHPanel;
    private QLSPPanel mQLSPPanel;
    private QLHDPanel mQLHDPanel;
    private HDBHPanel mHDBHPanel;

    public JOptionPane parent;
    int us = 0;

    /**
     * Creates new form MainForm
     */
    public MainForm() {

        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator8 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btnQLNV = new javax.swing.JButton();
        btnQLKH = new javax.swing.JButton();
        btnQLSP = new javax.swing.JButton();
        btnQLHD = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        btnGioiThieu = new javax.swing.JButton();
        tplMainBoard = new javax.swing.JTabbedPane();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuHeThong_Thoat = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnuQuanLy = new javax.swing.JMenu();
        mnuQLNV = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuQLKH = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnuQLSP = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnuQLHD = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuGioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setBackground(new java.awt.Color(153, 153, 255));
        jToolBar1.setRollover(true);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/logout (1).png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);
        jToolBar1.add(jSeparator9);

        btnQLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/staff (2).png"))); // NOI18N
        btnQLNV.setText("Quản Lý Nhân Viên");
        btnQLNV.setFocusable(false);
        btnQLNV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLNV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLNVActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLNV);

        btnQLKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/rating (1).png"))); // NOI18N
        btnQLKH.setText("Quản Lý Khách Hàng");
        btnQLKH.setFocusable(false);
        btnQLKH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLKH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKHActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLKH);

        btnQLSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/box (1).png"))); // NOI18N
        btnQLSP.setText("Quản Lý Sản Phẩm");
        btnQLSP.setFocusable(false);
        btnQLSP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLSP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSPActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLSP);

        btnQLHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/invoice (1).png"))); // NOI18N
        btnQLHD.setText("Quản Lý Hóa Đơn");
        btnQLHD.setFocusable(false);
        btnQLHD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLHD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLHDActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLHD);
        jToolBar1.add(jSeparator10);

        btnGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/information (2).png"))); // NOI18N
        btnGioiThieu.setText("Giới Thiệu");
        btnGioiThieu.setFocusable(false);
        btnGioiThieu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGioiThieu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGioiThieuActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGioiThieu);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2643, 117));

        tplMainBoard.setBackground(new java.awt.Color(204, 255, 255));
        tplMainBoard.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        getContentPane().add(tplMainBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 1450, 680));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/bg1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1380, 760));

        mnuHeThong.setText("Hệ Thống");
        mnuHeThong.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mnuHeThong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHeThongActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/log-out_1.png"))); // NOI18N
        jMenuItem1.setText("Đăng Xuất");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuHeThong.add(jMenuItem1);
        mnuHeThong.add(jSeparator1);

        mnuHeThong_Thoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuHeThong_Thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/button.png"))); // NOI18N
        mnuHeThong_Thoat.setText("Thoát");
        mnuHeThong_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHeThong_ThoatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mnuHeThong_Thoat);
        mnuHeThong.add(jSeparator6);

        jMenuBar1.add(mnuHeThong);

        mnuQuanLy.setText("Quản Lý");
        mnuQuanLy.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mnuQuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQuanLyActionPerformed(evt);
            }
        });

        mnuQLNV.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuQLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/staff (1).png"))); // NOI18N
        mnuQLNV.setText("Quản Lý Nhân Viên");
        mnuQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLNVActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnuQLNV);
        mnuQuanLy.add(jSeparator2);

        mnuQLKH.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuQLKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/rating.png"))); // NOI18N
        mnuQLKH.setText("Quản Lý Khách hàng");
        mnuQLKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLKHActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnuQLKH);
        mnuQuanLy.add(jSeparator4);

        mnuQLSP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuQLSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/box.png"))); // NOI18N
        mnuQLSP.setText("Quản Lý Sản phẩm");
        mnuQLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLSPActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnuQLSP);
        mnuQuanLy.add(jSeparator5);

        mnuQLHD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuQLHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/invoice.png"))); // NOI18N
        mnuQLHD.setText("Quản Lý Hóa đơn");
        mnuQLHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLHDActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnuQLHD);
        mnuQuanLy.add(jSeparator7);

        jMenuBar1.add(mnuQuanLy);

        jMenu3.setText("Trợ Giúp");
        jMenu3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/content-writing.png"))); // NOI18N
        jMenuItem5.setText("Nội Dung");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);
        jMenu3.add(jSeparator3);

        mnuGioiThieu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/information (1).png"))); // NOI18N
        mnuGioiThieu.setText("Giới Thiệu");
        mnuGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGioiThieuActionPerformed(evt);
            }
        });
        jMenu3.add(mnuGioiThieu);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLNVActionPerformed
        // TODO add your handling code here:
        btnQLNVActionPerformed(evt);
    }//GEN-LAST:event_mnuQLNVActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        btnDangXuatActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        tplMainBoard.remove(mQLNVPanel);
        tplMainBoard.remove(mQLKHPanel);
        tplMainBoard.remove(mQLSPPanel);
        tplMainBoard.remove(mQLHDPanel);
        nvtab = 0;
        khtab = 0;
        sptab = 0;
        hdtab = 0;

        //cai lai bien usercheck=0
        us = 0;
        btnQLNV.setEnabled(true);
        LoginDialog dialog = new LoginDialog(this, true);
        dialog.setVisible(true);
        if (dialog.usercheck == 1) {
            us = 1;
        }
        System.out.println(dialog.usercheck + " va " + us);


    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGioiThieuActionPerformed
        // TODO add your handling code here:
        GioiThieuDialog GioiThieu = new GioiThieuDialog(this, true);
        GioiThieu.setVisible(true);
    }//GEN-LAST:event_btnGioiThieuActionPerformed

    private void mnuHeThongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHeThongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuHeThongActionPerformed

    private void mnuHeThong_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHeThong_ThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuHeThong_ThoatActionPerformed
    int nvtab = 0;
    int khtab = 0;
    int sptab = 0;
    int hdtab = 0;

    private void btnQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLNVActionPerformed
        // TODO add your handling code here:
        if (us == 1) {
            btnQLNV.setEnabled(false);
        } else {
            if (nvtab == 0) {
                mQLNVPanel = new QLNVPanel();
                ImageIcon icon = new ImageIcon(getClass().getResource("/QLBH/icon/staff (1).png"));
                tplMainBoard.addTab("Quản Lý Nhân Viên", icon, mQLNVPanel, "Quản Lý Nhân Viên");
                nvtab++;
            }
            tplMainBoard.setSelectedComponent(mQLNVPanel);
        }


    }//GEN-LAST:event_btnQLNVActionPerformed

    private void mnuQuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQuanLyActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnuQuanLyActionPerformed

    private void mnuQLKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLKHActionPerformed
        // TODO add your handling code here:
        btnQLKHActionPerformed(evt);
    }//GEN-LAST:event_mnuQLKHActionPerformed

    private void mnuQLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLSPActionPerformed
        // TODO add your handling code here:
        btnQLSPActionPerformed(evt);
    }//GEN-LAST:event_mnuQLSPActionPerformed

    private void btnQLKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKHActionPerformed
        // TODO add your handling code here:
        if (khtab == 0) {
            mQLKHPanel = new QLKHPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/QLBH/icon/rating.png"));
            tplMainBoard.addTab("Quản Lý Khách Hàng", icon, mQLKHPanel, "Quản Lý Khách Hàng");
            khtab++;
        }
        tplMainBoard.setSelectedComponent(mQLKHPanel);
    }//GEN-LAST:event_btnQLKHActionPerformed

    private void btnQLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSPActionPerformed
        // TODO add your handling code here:
        if (sptab == 0) {
            mQLSPPanel = new QLSPPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/QLBH/icon/box.png"));
            tplMainBoard.addTab("Quản Lý Sản Phẩm", icon, mQLSPPanel, "Quản Lý Sản Phẩm");
            sptab++;
        }
        tplMainBoard.setSelectedComponent(mQLSPPanel);
    }//GEN-LAST:event_btnQLSPActionPerformed

    private void btnQLHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLHDActionPerformed
        // TODO add your handling code here:
        if (hdtab == 0) {
            mQLHDPanel = new QLHDPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/QLBH/icon/invoice.png"));
            tplMainBoard.addTab("Quản Lý Hóa Đơn", icon, mQLHDPanel, "Quản Lý Hóa Đơn");
            hdtab++;
        }
        tplMainBoard.setSelectedComponent(mQLHDPanel);
    }//GEN-LAST:event_btnQLHDActionPerformed

    private void mnuQLHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLHDActionPerformed
        // TODO add your handling code here:
        btnQLHDActionPerformed(evt);
    }//GEN-LAST:event_mnuQLHDActionPerformed

    private void mnuGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGioiThieuActionPerformed
        // TODO add your handling code here:
        btnGioiThieuActionPerformed(evt);
    }//GEN-LAST:event_mnuGioiThieuActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LoginDialog dialog = new LoginDialog(this, true);
        dialog.setVisible(true);
        if (dialog.usercheck == 1)
            us = 1;
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        MessageDialogHelper.showMessageDialog(parent, "Ứng dụng HAVA thuộc đơn vị HAVA UIT là một ứng dụng quản lý bán hàng.\n"
                + "Trong đó các chức năng chính: \n"
                + "-Quản lý nhân viên\n"
                + "-Quản lý khách hàng\n"
                + "-Quản lý sản phẩm\n"
                + "-Quản lý hóa đơn\n"
                + "Có hệ thống phân quyền sử dụng cho người quản lý và nhân viên trong cửa hàng.\n"
                + "Ngôn ngữ hỗ trợ hiện tại: Tiếng Việt\n"
                + "Phiên bản ứng dụng: 1.0.0.0\n"
                + "Thông tin liên lạc: huynhvananh182@gmail.com\n", "Nội Dung");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnGioiThieu;
    private javax.swing.JButton btnQLHD;
    private javax.swing.JButton btnQLKH;
    private javax.swing.JButton btnQLNV;
    private javax.swing.JButton btnQLSP;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnuGioiThieu;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenuItem mnuHeThong_Thoat;
    private javax.swing.JMenuItem mnuQLHD;
    private javax.swing.JMenuItem mnuQLKH;
    private javax.swing.JMenuItem mnuQLNV;
    private javax.swing.JMenuItem mnuQLSP;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables
}
