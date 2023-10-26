/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package QLBH.ui;

import QLBH.Helpers.DataValidator;
import QLBH.Helpers.MessageDialogHelper;
import QLBH.HoaDon;
import QLBH.dao.CTHDDAO;
import QLBH.dao.HoaDonDao;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VAN ANH
 */
public class QLHDPanel extends javax.swing.JPanel {

    private HDBHDialog mHDBH;
    private final ArrayList<HoaDon> list;
    private JOptionPane parentForm;
    private DefaultTableModel tblModel;

    /**
     * Creates new form QLNVPanel
     */
    public QLHDPanel() {
        initComponents();
        list = new HoaDonDao().getListHD();
        initTable();
        loadData();
    }

    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"SỐ HÓA ĐƠN", "NGÀY HÓA ĐƠN", "MÃ KHÁCH HÀNG", "MÃ NHÂN VIÊN",
            "TRỊ GIÁ"});
        tblHD.setModel(tblModel);
    }

    private void loadData() {
        try {
            HoaDonDao dao = new HoaDonDao();
            List<HoaDon> list = dao.FindAll();
            tblModel.setRowCount(0);
            for (HoaDon n : list) {
                tblModel.addRow(new Object[]{
                    n.getSoHD(), n.getNgHD(), n.getMaKH(), n.getMaNV(),
                    n.getTriGia()});
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi!");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtTRIGIA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSOHD = new javax.swing.JTextField();
        txtNGHD = new javax.swing.JTextField();
        txtMAKH = new javax.swing.JTextField();
        txtMANV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTimSOHD = new javax.swing.JTextField();
        btnTimSOHD = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnLamMoi = new javax.swing.JButton();
        btnTHEM = new javax.swing.JButton();
        btnCAPNHAT = new javax.swing.JButton();
        btnXOA = new javax.swing.JButton();
        btnCHITIET = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHD = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        background = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Quản Lý Sản Phẩm");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("QUẢN LÝ HÓA ĐƠN");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jPanel1.setBackground(new java.awt.Color(246, 239, 252));

        txtTRIGIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTRIGIAActionPerformed(evt);
            }
        });

        jLabel8.setText("Trị Giá");

        jLabel7.setText("Mã Nhân Viên");

        jLabel6.setText("Mã Khách Hàng");

        jLabel5.setText("Ngày Hóa Đơn");

        jLabel4.setText("Số Hóa Đơn");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tìm Kiếm Hóa Đơn (SoHD):");

        btnTimSOHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/look-for.16.png"))); // NOI18N
        btnTimSOHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimSOHDActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(246, 239, 252));

        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/refresh16.png"))); // NOI18N
        btnLamMoi.setText("Làm Mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnTHEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/plus16.png"))); // NOI18N
        btnTHEM.setText("Thêm");
        btnTHEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTHEMActionPerformed(evt);
            }
        });

        btnCAPNHAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/update16.png"))); // NOI18N
        btnCAPNHAT.setText("Cập Nhật");
        btnCAPNHAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCAPNHATActionPerformed(evt);
            }
        });

        btnXOA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/delete16.png"))); // NOI18N
        btnXOA.setText("Xóa");
        btnXOA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXOAActionPerformed(evt);
            }
        });

        btnCHITIET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/employee.png"))); // NOI18N
        btnCHITIET.setText("Chi Tiết");
        btnCHITIET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCHITIETActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLamMoi)
                .addGap(18, 18, 18)
                .addComponent(btnTHEM)
                .addGap(18, 18, 18)
                .addComponent(btnCAPNHAT)
                .addGap(18, 18, 18)
                .addComponent(btnXOA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCHITIET)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLamMoi)
                    .addComponent(btnTHEM)
                    .addComponent(btnCAPNHAT)
                    .addComponent(btnXOA)
                    .addComponent(btnCHITIET))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimSOHD, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimSOHD))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMAKH, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMANV, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTRIGIA, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNGHD, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSOHD, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtTimSOHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTimSOHD))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNGHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtSOHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtMAKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMANV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTRIGIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 520, 320));

        tblHD.setBackground(new java.awt.Color(246, 239, 252));
        tblHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHDMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblHD);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 580, 320));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 2010, 10));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/icon/backgound1.jpg"))); // NOI18N
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2010, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimSOHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimSOHDActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtTimSOHD, sb, "Số hóa đơn không được để trống.");
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        try {
            HoaDonDao dao = new HoaDonDao();
            HoaDon n = new HoaDon();
            n = dao.FindByID(txtTimSOHD.getText());
            if (n != null) {
                tblModel.setRowCount(0);
                tblModel.addRow(new Object[]{
                    n.getSoHD(), n.getNgHD(), n.getMaKH(), n.getMaNV(),
                    n.getTriGia()});
                tblModel.fireTableDataChanged();
                txtTimSOHD.setText("");
            } else {
                MessageDialogHelper.showErrorDialog(parentForm, "Không tìm thấy!", "Thông báo!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi!");
        }
    }//GEN-LAST:event_btnTimSOHDActionPerformed
    int sohd;
    private void btnTHEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTHEMActionPerformed

        HoaDonDao n = new HoaDonDao();
        String hd = "";
        try {
            hd = n.FindMaxID();
        } catch (Exception ex) {
        }
        sohd = Integer.parseInt(hd) + 1;
        HDBHDialog hdbh = new HDBHDialog(sohd);
        hdbh.setVisible(true);

    }//GEN-LAST:event_btnTHEMActionPerformed

    private void btnCAPNHATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAPNHATActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtSOHD, sb, "Số hóa đơn không được để trống.");
        DataValidator.validateEmpty(txtNGHD, sb, "Ngày hóa đơn không được để trống.");
        DataValidator.validateEmpty(txtMAKH, sb, "Mã khách hàng không được để trống.");
        DataValidator.validateEmpty(txtMANV, sb, "Mã nhân viên không được để trống.");
        DataValidator.validateEmpty(txtTRIGIA, sb, "Trị giá không được để trống.");
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }

        if (MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn cập nhật hóa đơn không?",
                "Hỏi") == JOptionPane.YES_OPTION) {
            HoaDon n = new HoaDon();
            n.setSoHD(txtSOHD.getText());
            n.setNgHD(txtNGHD.getText());
            n.setMaKH(txtMAKH.getText());
            n.setMaNV(txtMANV.getText());
            n.setTriGia(Long.parseLong(txtTRIGIA.getText()));

            if (new HoaDonDao().Update(n)) {
                MessageDialogHelper.showMessageDialog(parentForm, "Hóa đơn đã được cập nhật!", "Thông báo!");
                loadData();
            } else {
                MessageDialogHelper.showMessageDialog(parentForm, "Cập nhật hóa đơn không thành công do lỗi!", "Thông báo!");
            }
        }


    }//GEN-LAST:event_btnCAPNHATActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        txtSOHD.setText("");
        txtNGHD.setText("");
        txtMAKH.setText("");
        txtMANV.setText("");
        txtTRIGIA.setText("");
        loadData();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnXOAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXOAActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtSOHD, sb, "Số hóa đơn không được để trống.");
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        if (MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn xoá hóa đơn không?",
                "Hỏi") == JOptionPane.YES_OPTION) {
            HoaDonDao dao = new HoaDonDao();
            CTHDDAO cthddao = new CTHDDAO();
            if (dao.Delete(txtSOHD.getText()) && cthddao.DeleteALLbyID(txtSOHD.getText())) {
                MessageDialogHelper.showMessageDialog(parentForm, "Hóa đơn đã được xóa!", "Thông báo!");
                loadData();
                btnLamMoiActionPerformed(evt);
            } else {
                MessageDialogHelper.showMessageDialog(parentForm, "Xóa hóa đơn không thành công do lỗi!", "Thông báo!");
            }
        }


    }//GEN-LAST:event_btnXOAActionPerformed

    private void tblHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDMouseClicked
        try {
            int row = tblHD.getSelectedRow();
            if (row >= 0) {
                String id = (String) tblHD.getValueAt(row, 0);
                HoaDonDao dao = new HoaDonDao();
                HoaDon n = dao.FindByID(id);

                if (n != null) {
                    txtSOHD.setText(n.getSoHD());
                    txtNGHD.setText(n.getNgHD());
                    txtMAKH.setText(n.getMaKH());
                    txtMANV.setText(n.getMaNV());
                    txtTRIGIA.setText(String.valueOf(n.getTriGia()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.toString(), "Lỗi");
        }
    }//GEN-LAST:event_tblHDMouseClicked

    private void btnCHITIETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCHITIETActionPerformed
        String SOHD = txtSOHD.getText();
        CTHDDialog cthd = new CTHDDialog(SOHD);
        cthd.setVisible(true);
    }//GEN-LAST:event_btnCHITIETActionPerformed

    private void txtTRIGIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTRIGIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTRIGIAActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
 /* Create and diHDlay the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLHDPanel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnCAPNHAT;
    private javax.swing.JButton btnCHITIET;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnTHEM;
    private javax.swing.JButton btnTimSOHD;
    private javax.swing.JButton btnXOA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblHD;
    private javax.swing.JTextField txtMAKH;
    private javax.swing.JTextField txtMANV;
    private javax.swing.JTextField txtNGHD;
    private javax.swing.JTextField txtSOHD;
    private javax.swing.JTextField txtTRIGIA;
    private javax.swing.JTextField txtTimSOHD;
    // End of variables declaration//GEN-END:variables
}
