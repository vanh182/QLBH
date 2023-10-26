/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLBH.dao;

import QLBH.Helpers.DatabaseHelper;
import QLBH.model.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author VAN ANH
 */
public class NguoiDungDao {

    public NguoiDung checkLogin(String TenDN, String MatKhau)
            throws Exception {
        String sql = "select TenDN, MatKhau, VaiTro from NguoiDung "
                + " where TenDN=? and MatKhau=?";
        try (
                 Connection con = DatabaseHelper.OpConnection();  
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, TenDN);
            pstmt.setString(2, MatKhau);

            try ( ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDN(TenDN);
                    nd.setVaiTro(rs.getString("VaiTro"));
                    return nd;

                }
            }
        }
        return null;
    }
}
